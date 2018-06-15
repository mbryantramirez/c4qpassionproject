package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import java.util.UUID;
import nyc.c4q.c4qpassionproject.MainActivity;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.db.RecipeInfoModel;
import nyc.c4q.c4qpassionproject.models.MealsResponse;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeDescriptionFragment extends Fragment {

  private ImageView headerImage;
  private MainActivity mainActivity;
  private Toolbar toolbar;
  private View view;
  private MealsResponse.Meals meal;
  private RecipeFragmentPagerAdapter adapter;
  private List<String> measureList;
  private List<String> ingredientsList;

  public RecipeDescriptionFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    view = inflater.inflate(R.layout.fragment_recipe_description, container, false);
    setHasOptionsMenu(true);
    meal = getArguments().getParcelable("recipe");
    ViewPager viewPager = view.findViewById(R.id.recipe_viewpager);
    adapter =
        new RecipeFragmentPagerAdapter(getContext(), getActivity().getSupportFragmentManager(),
            meal);
    viewPager.setAdapter(adapter);
    TabLayout tabLayout = view.findViewById(R.id.recipe_tabs);
    tabLayout.setupWithViewPager(viewPager);
    initRecipeLists();
    return view;
  }

  private void initRecipeLists() {
    measureList = new ArrayList<>();
    ingredientsList = new ArrayList<>();
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


    ingredientsList.removeIf(item -> item == null || "".equals(item));
    measureList.removeIf(item -> item == null || "".equals(item));
  }

  @Override
  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    inflater.inflate(R.menu.recipe_desc_menu, menu);
    super.onCreateOptionsMenu(menu, inflater);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.action_add_to_meal_map:
        Log.d("item id", "onClick: " + item.getItemId());

        List<String> ingredients = adapter.getIngredientsList();
        List<String> measureLists = adapter.getMeasureList();
        String imageUrl = adapter.getImageThumb();
        String mealName = meal.getStrMeal();

        Realm realm = Realm.getDefaultInstance();

        realm.beginTransaction();

        RecipeInfoModel recipeInfoModel = new RecipeInfoModel();
        RealmList<String> realmIngredients = new RealmList<>();
        RealmList<String> realmMeasures = new RealmList<>();
        realmIngredients.addAll(ingredientsList);
        realmMeasures.addAll(measureList);
        recipeInfoModel.setIngredients(realmIngredients);
        recipeInfoModel.setMeasures(realmMeasures);
        recipeInfoModel.setRecipeImageUrl(meal.getStrMealThumb());
        recipeInfoModel.setRecipeName(meal.getStrMeal());
        recipeInfoModel.setListId(UUID.randomUUID().toString());
        realm.copyToRealmOrUpdate(recipeInfoModel);
        realm.commitTransaction();

        RealmResults<RecipeInfoModel> results = realm.where(RecipeInfoModel.class).findAll();

        for (RecipeInfoModel recipeInfoModel1 : results) {
          Log.d("REALM-D", "onRealmResults: " + recipeInfoModel1.getRecipeName());
          Log.d("REALM-D", "onRealmResults: " + recipeInfoModel1.getListId());
          Log.d("REALM-D", "onRealmResults: " + recipeInfoModel1.getIngredients().size());
        }

      default:
        return super.onOptionsItemSelected(item);
    }
  }
}
