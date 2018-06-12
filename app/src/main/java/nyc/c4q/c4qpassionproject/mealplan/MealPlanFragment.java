package nyc.c4q.c4qpassionproject.mealplan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.c4qpassionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MealPlanFragment extends Fragment {

  public MealPlanFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_meal_plan, container, false);

    return view;
  }
}
