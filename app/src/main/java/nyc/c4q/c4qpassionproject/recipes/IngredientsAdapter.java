package nyc.c4q.c4qpassionproject.recipes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.c4qpassionproject.R;

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder> {

    private ArrayList<String> ingredientsList;
    private ArrayList<String> measureList;

    IngredientsAdapter(ArrayList<String> ingredientsList, ArrayList<String> measureList) {
        this.ingredientsList = ingredientsList;
        this.measureList = measureList;
    }


    @NonNull
    @Override
    public IngredientsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredients_itemview, parent, false);
        return new IngredientsViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientsViewHolder holder, int position) {
        String ingredient = ingredientsList.get(position);
        String measure = measureList.get(position);
        holder.ingedientText.setText(ingredient);
        holder.measureText.setText(measure);
    }

    @Override
    public int getItemCount() {
        return ingredientsList == null || measureList == null ? 0 : ingredientsList.size();
    }

    public class IngredientsViewHolder extends RecyclerView.ViewHolder {
        TextView ingedientText;
        TextView measureText;

        public IngredientsViewHolder(View itemView) {
            super(itemView);
            ingedientText = itemView.findViewById(R.id.ingredient_tv);
            measureText = itemView.findViewById(R.id.measure_tv);

        }
    }
}