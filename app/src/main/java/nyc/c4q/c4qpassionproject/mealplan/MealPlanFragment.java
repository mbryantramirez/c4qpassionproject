package nyc.c4q.c4qpassionproject.mealplan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.realm.Realm;
import io.realm.RealmRecyclerViewAdapter;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.db.RecipeInfoModel;

/**
 * A simple {@link Fragment} subclass.
 */

public class MealPlanFragment extends Fragment {

  private List<RecipeInfoModel> rsavedMealsLIst;
  private MealPlanFragmentPagerAdapter adapter;
  ArrayList<String> ingredients = new ArrayList<>();
  ArrayList<String> measures = new ArrayList<>();
  ArrayList<String> imageUrls = new ArrayList<>();
  ArrayList<String> recipeNames = new ArrayList<>();

  public MealPlanFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_meal_plan, container, false);
    Realm realm = Realm.getDefaultInstance();

    RealmResults<RecipeInfoModel> results = realm.where(RecipeInfoModel.class).findAll();

    for (RecipeInfoModel recipeInfoModel : results) {
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getRecipeName());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getListId());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getIngredients().size());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getMeasures().size());
      Log.d("REALM-PLAN", "onRealmResults: " + recipeInfoModel.getRecipeImageUrl());

      imageUrls.add(recipeInfoModel.getRecipeImageUrl());
      recipeNames.add(recipeInfoModel.getRecipeName());
      ingredients.addAll(recipeInfoModel.getIngredients());
      measures.addAll(recipeInfoModel.getMeasures());

      Log.d("REALM-PLAN", "onRealmResults: " + Arrays.toString(new List[] { ingredients }));

      Log.d("REALM-PLAN", "onRealmResults: " + Arrays.toString(new List[] { measures }));
    }

    adapter =
        new MealPlanFragmentPagerAdapter(getContext(), getActivity().getSupportFragmentManager(),
            imageUrls, recipeNames, ingredients, measures);

    ViewPager viewPager = view.findViewById(R.id.meal_plan_viewpager);
    TabLayout tabLayout = view.findViewById(R.id.meal_plan_tabs);
    tabLayout.setupWithViewPager(viewPager);

    return view;
  }
}
