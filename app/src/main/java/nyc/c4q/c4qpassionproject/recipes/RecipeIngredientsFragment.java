package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

import nyc.c4q.c4qpassionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeIngredientsFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private IngredientsAdapter ingredientsAdapter;

    public RecipeIngredientsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_recipe_ingredients, container, false);

        ArrayList<String> ingredientsList = getArguments().getStringArrayList("Ingredientslist");
        ArrayList<String> measuresList = getArguments().getStringArrayList("MeasureList");
        Log.d("BUNDLE-ARGS", "onArgumentsRecieved: " + ingredientsList.size() + " " + measuresList.size());

        ingredientsList.removeIf(item -> item == null || "".equals(item));
        measuresList.removeIf(item -> item == null || "".equals(item));

        Log.d("BUNDLE-ARGS", "onArgumentsRecieved: " + ingredientsList.size() + " " + measuresList.size());

        recyclerView = view.findViewById(R.id.rec_ingredients_rv);

        initRecyclerView(ingredientsList, measuresList);

        return view;
    }

    private void initRecyclerView(ArrayList<String> ingredientsList, ArrayList<String> measuresList) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ingredientsAdapter = new IngredientsAdapter(ingredientsList, measuresList);
        recyclerView.setAdapter(ingredientsAdapter);
    }
}
