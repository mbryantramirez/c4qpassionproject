package nyc.c4q.c4qpassionproject.mealplan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.w3c.dom.Text;

class RealmResultsAdapter extends RecyclerView.Adapter<RealmResultsAdapter.RealmMealViewHolder> {

  public RealmResultsAdapter(Context context, List<String> ingredientsList) {

  }

  @NonNull @Override
  public RealmMealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
  }

  @Override public void onBindViewHolder(@NonNull RealmMealViewHolder holder, int position) {

  }

  @Override public int getItemCount() {
    return 0;
  }

  public class RealmMealViewHolder extends RecyclerView.ViewHolder {
    private TextView mealName;
    private ImageView mealImage;

    public RealmMealViewHolder(View itemView) {
      super(itemView);


    }
  }
}
