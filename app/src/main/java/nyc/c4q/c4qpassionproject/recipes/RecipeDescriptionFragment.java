package nyc.c4q.c4qpassionproject.recipes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import nyc.c4q.c4qpassionproject.MainActivity;
import nyc.c4q.c4qpassionproject.R;
import nyc.c4q.c4qpassionproject.models.MealsResponse;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeDescriptionFragment extends Fragment {

  private ImageView headerImage;
  private MainActivity mainActivity;
  private Toolbar toolbar;

  public RecipeDescriptionFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_recipe_description, container, false);
    MealsResponse.Meals meal = getArguments().getParcelable("recipe");

    String desc = meal.getStrInstructions();
    Log.d("BUNDLE", "onRecieve: " + desc);
    toolbar = view.findViewById(R.id.rdesc_toolbar);
    initViewPager();
    setUpToolBar();
    headerImage = view.findViewById(R.id.rdesc_header);
    Picasso.get().load(meal.getStrMealThumb()).into(headerImage);
    ViewPager viewPager = view.findViewById(R.id.rdesc_viewpager);
    TabLayout tabLayout = view.findViewById(R.id.recipe_tabs);
    tabLayout.setupWithViewPager(viewPager);
    return view;
  }

  private void setUpToolBar() {
    mainActivity.setSupportActionBar(toolbar);
  }

  private void initViewPager() {

  }

}
