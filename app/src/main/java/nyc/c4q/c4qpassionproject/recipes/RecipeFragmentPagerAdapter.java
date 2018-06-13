package nyc.c4q.c4qpassionproject.recipes;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import nyc.c4q.c4qpassionproject.R;

public class RecipeFragmentPagerAdapter extends FragmentPagerAdapter {

  private Context context;

  public RecipeFragmentPagerAdapter(Context context, FragmentManager fm) {
    super(fm);
    this.context = context;
  }

  @Override public Fragment getItem(int position) {
    if (position == 0) {
      return new RecipeInstructionsFragment();
    } else {
      return new RecipeIngredientsFragment();
    }
  }

  @Override public int getCount() {
    return 2;
  }

  @Nullable @Override public CharSequence getPageTitle(int position) {
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
