package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import nyc.c4q.c4qpassionproject.MainActivity;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.models.MealsResponse;
import nyc.c4q.c4qpassionproject.utils.MealDBServiceGenerator;
import nyc.c4q.c4qpassionproject.utils.TheMealdbAPIServiceInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipesFragment extends Fragment {

  private TheMealdbAPIServiceInterface mealDBCallback =
      MealDBServiceGenerator.createMealdbService();

  private RecyclerView recyclerView;
  private RecipesAdapter recipesAdapter;
  List<MealsResponse.Meals> mealList = new ArrayList<>();
  private Toolbar toolbar;
  private View view;

  public RecipesFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_recipes, container, false);
    recyclerView = view.findViewById(R.id.latest_recipes_rv);
    initRecyclerView();
    getRecipes();
    return view;
  }

  private void getRecipes() {
    Call<MealsResponse> mealsResponseCall = mealDBCallback.getMealDBRecipies();
    mealsResponseCall.enqueue(new Callback<MealsResponse>() {
      @Override public void onResponse(@NonNull Call<MealsResponse> call,
          @NonNull Response<MealsResponse> response) {
        if (response.code() == 200) {
          List<MealsResponse.Meals> meals = Objects.requireNonNull(response.body()).getMeals();
          String name = meals.get(1).getStrMeal();
          String url = meals.get(1).getStrMealThumb();
          Log.d("JSON-RESPONSE", "onResponse: " + name);
          Log.d("JSON-RESPONSE", "onResponse: " + url);
          mealList.addAll(meals);
          recipesAdapter.notifyDataSetChanged();
        }
      }

      @Override public void onFailure(Call<MealsResponse> call, Throwable t) {

      }
    });
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
  }

  private void initRecyclerView() {
    LinearLayoutManager linearLayoutManager =
        new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
    recyclerView.setLayoutManager(linearLayoutManager);
    recipesAdapter = new RecipesAdapter(mealList);
    recyclerView.setAdapter(recipesAdapter);
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setupToolBar();
  }

  public void setupToolBar() {
    toolbar = view.findViewById(R.id.recipes_toolbar);
    ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    if (((MainActivity) getActivity()).getSupportActionBar() != null) {
      ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
      ((MainActivity) getActivity()).setupNavigationDrawer(toolbar);
    }
  }
}
