package nyc.c4q.c4qpassionproject.recipes;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.models.MealsResponse;

public class RecipeFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private MealsResponse.Meals meal;

    public RecipeFragmentPagerAdapter(Context context, FragmentManager fm, MealsResponse.Meals meals) {
        super(fm);
        this.context = context;
        this.meal = meals;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("Instructions", meal.getStrInstructions());
            RecipeInstructionsFragment recipeInstructionsFragment = new RecipeInstructionsFragment();
            recipeInstructionsFragment.setArguments(bundle);
            return recipeInstructionsFragment;
        } else {

            Bundle bundle = new Bundle();
            ArrayList<String> measureList = new ArrayList<>();
            ArrayList<String> ingredientsList = new ArrayList<>();
            String measure20 = meal.getStrmeasure20();
            String measure19 = meal.getStrmeasure19();
            String measure18 = meal.getStrmeasure18();
            String measure17 = meal.getStrmeasure17();
            String measure16 = meal.getStrmeasure16();
            String measure15 = meal.getStrmeasure15();
            String measure14 = meal.getStrmeasure14();
            String measure13 = meal.getStrmeasure13();
            String measure12 = meal.getStrmeasure12();
            String measure11 = meal.getStrmeasure11();
            String measure10 = meal.getStrmeasure10();
            String measure9 = meal.getStrmeasure9();
            String measure8 = meal.getStrmeasure8();
            String measure7 = meal.getStrmeasure7();
            String measure6 = meal.getStrmeasure6();
            String measure5 = meal.getStrMeasure5();
            String measure4 = meal.getStrMeasure4();
            String measure3 = meal.getStrMeasure3();
            String measure2 = meal.getStrMeasure2();
            String measure1 = meal.getStrMeasure1();

            measureList.add(measure20);
            measureList.add(measure19);
            measureList.add(measure18);
            measureList.add(measure17);
            measureList.add(measure16);
            measureList.add(measure15);
            measureList.add(measure14);
            measureList.add(measure13);
            measureList.add(measure12);
            measureList.add(measure11);
            measureList.add(measure10);
            measureList.add(measure9);
            measureList.add(measure8);
            measureList.add(measure7);
            measureList.add(measure6);
            measureList.add(measure5);
            measureList.add(measure4);
            measureList.add(measure3);
            measureList.add(measure2);
            measureList.add(measure1);

            String stringIngredient20 = meal.getStrIngredient20();
            String stringIngredient19 = meal.getStrIngredient19();
            String stringIngredient18 = meal.getStrIngredient18();
            String stringIngredient17 = meal.getStrIngredient17();
            String stringIngredient16 = meal.getStrIngredient16();
            String stringIngredient15 = meal.getStrIngredient15();
            String stringIngredient14 = meal.getStrIngredient14();
            String stringIngredient13 = meal.getStrIngredient13();
            String stringIngredient12 = meal.getStrIngredient12();
            String stringIngredient11 = meal.getStrIngredient11();
            String stringIngredient10 = meal.getStrIngredient10();
            String stringIngredient9 = meal.getStrIngredient9();
            String stringIngredient8 = meal.getStrIngredient8();
            String stringIngredient7 = meal.getStrIngredient7();
            String stringIngredient6 = meal.getStrIngredient6();
            String stringIngredient5 = meal.getStrIngredient5();
            String stringIngredient4 = meal.getStrIngredient4();
            String stringIngredient3 = meal.getStrIngredient3();
            String stringIngredient2 = meal.getStrIngredient2();
            String stringIngredient1 = meal.getStrIngredient1();

            ingredientsList.add(stringIngredient20);
            ingredientsList.add(stringIngredient19);
            ingredientsList.add(stringIngredient18);
            ingredientsList.add(stringIngredient17);
            ingredientsList.add(stringIngredient16);
            ingredientsList.add(stringIngredient15);
            ingredientsList.add(stringIngredient14);
            ingredientsList.add(stringIngredient13);
            ingredientsList.add(stringIngredient12);
            ingredientsList.add(stringIngredient11);
            ingredientsList.add(stringIngredient10);
            ingredientsList.add(stringIngredient9);
            ingredientsList.add(stringIngredient8);
            ingredientsList.add(stringIngredient7);
            ingredientsList.add(stringIngredient6);
            ingredientsList.add(stringIngredient5);
            ingredientsList.add(stringIngredient4);
            ingredientsList.add(stringIngredient3);
            ingredientsList.add(stringIngredient2);
            ingredientsList.add(stringIngredient1);

            bundle.putStringArrayList("MeasureList", measureList);
            bundle.putStringArrayList("Ingredientslist", ingredientsList);

            RecipeIngredientsFragment recipeIngredientsFragment = new RecipeIngredientsFragment();
            recipeIngredientsFragment.setArguments(bundle);
            return recipeIngredientsFragment;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_rec_instructions);
            case 1:
                return context.getString(R.string.category_rec_ingredients);
            default:
                return null;
        }
    }
}
