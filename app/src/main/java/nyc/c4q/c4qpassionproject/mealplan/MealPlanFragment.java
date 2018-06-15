package nyc.c4q.c4qpassionproject.mealplan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.realm.Realm;
import io.realm.RealmRecyclerViewAdapter;
import io.realm.RealmResults;
import java.util.List;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.db.RecipeInfoModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class MealPlanFragment extends Fragment {

  private List<RecipeInfoModel> rsavedMealsLIst;
  private RealmResultsAdapter adapter;

  public MealPlanFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_meal_plan, container, false);
    Realm realm = Realm.getDefaultInstance();

    RealmResults<RecipeInfoModel> results = realm.where(RecipeInfoModel.class).findAll();

    for(RecipeInfoModel recipeInfoModel :results){
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getRecipeName());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getListId());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getIngredients().size());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getIngredients().get(1));
    }

    RealmRecyclerViewAdapter rAdapter = new RealmRecyclerViewAdapter();


    return view;
  }
}
