package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.c4qpassionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeInstructionsFragment extends Fragment {

  public RecipeInstructionsFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_recipe_instructions, container, false);
  }
}
