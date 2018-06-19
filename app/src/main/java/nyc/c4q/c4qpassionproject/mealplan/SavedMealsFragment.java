package nyc.c4q.c4qpassionproject.mealplan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import nyc.c4q.c4qpassionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SavedMealsFragment extends Fragment {

  public SavedMealsFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_saved_meals, container, false);

    ArrayList<String> recipeNames = getArguments().getStringArrayList("RecipesList");
    ArrayList<String> imageUrls = getArguments().getStringArrayList("imageUrlsList");

    Log.d("BUNDLE-ARGS","onArgumentsReceived: : "+recipeNames.size());
    Log.d("BUNDLE-ARGS","onArgumentsReceived: : "+imageUrls.size());


    return view;
  }
}
