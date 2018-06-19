package nyc.c4q.c4qpassionproject.mealplan;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class MealPlanFragmentPagerAdapter extends FragmentPagerAdapter {
  private Context context;
  ArrayList<String> ingredients;
  ArrayList<String> measures;
  ArrayList<String> recipeNames;
  ArrayList<String> imageUrls;

  public MealPlanFragmentPagerAdapter(Context context, FragmentManager fm,
      ArrayList<String> imageUrls,
      ArrayList<String> recipeNames, ArrayList<String> ingredients, ArrayList<String> measures) {
    super(fm);
    this.imageUrls = imageUrls;
    this.recipeNames = recipeNames;
    this.ingredients = ingredients;
    this.measures = measures;
  }

  @Override public Fragment getItem(int position) {
    switch (position) {
      case 0:
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("imageUrlsList", imageUrls);
        bundle.putStringArrayList("RecipesList",recipeNames);
        SavedMealsFragment savedMealsFragment = new SavedMealsFragment();
        savedMealsFragment.setArguments(bundle);
        return savedMealsFragment;
      case 1:
        Bundle bundler = new Bundle();
        bundler.putStringArrayList("IngredientsList", ingredients);
        SavedIngredientsList savedIngredientsList = new SavedIngredientsList();
        savedIngredientsList.setArguments(bundler);
        return savedIngredientsList;
      default:
        return null;
    }
  }

  @Override public int getCount() {
    return 0;
  }
}
