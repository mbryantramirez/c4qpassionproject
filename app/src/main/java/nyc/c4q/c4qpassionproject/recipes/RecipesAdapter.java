package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.Navigation;
import com.squareup.picasso.Picasso;
import java.util.List;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.models.MealsResponse;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.RecipesViewHolder> {
  private List<MealsResponse.Meals> mealList;

  RecipesAdapter(List<MealsResponse.Meals> mealList) {
    this.mealList = mealList;
  }

  @NonNull @Override
  public RecipesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View childView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_itemview, parent, false);
    return new RecipesViewHolder(childView);
  }

  @Override public void onBindViewHolder(@NonNull final RecipesViewHolder holder, int position) {
    String recipeName = mealList.get(position).getStrMeal();
    holder.recipeTitle.setText(recipeName);
    String url = mealList.get(position).getStrMealThumb();
    Picasso.get().load(url).into(holder.recipeImage);
    final MealsResponse.Meals meals = mealList.get(position);
    holder.recipeImage.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("recipe", meals);
        Navigation.findNavController(v)
            .navigate(R.id.action_nav_recipes_to_nav_recipe_description, bundle);
      }
    });
  }

  @Override public int getItemCount() {
    return mealList == null ? 0 : mealList.size();
  }

  class RecipesViewHolder extends RecyclerView.ViewHolder {
    ImageView recipeImage;
    TextView recipeTitle;

    RecipesViewHolder(View itemView) {
      super(itemView);
      recipeImage = itemView.findViewById(R.id.recipe_iv);
      recipeTitle = itemView.findViewById(R.id.recipe_tv);
    }
  }
}
