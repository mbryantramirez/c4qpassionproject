package nyc.c4q.c4qpassionproject.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class MealsResponse {

  private List<Meals> meals;

  public List<Meals> getMeals() {
    return meals;
  }

  public static class Meals implements Parcelable {
    private String strSource;
    private String strMeasure20;
    private String strMeasure19;
    private String strMeasure18;
    private String strMeasure17;
    private String strMeasure16;
    private String strMeasure15;
    private String strMeasure14;
    private String strMeasure13;
    private String strMeasure12;
    private String strMeasure11;
    private String strMeasure10;
    private String strMeasure9;
    private String strMeasure8;
    private String strMeasure7;
    private String strMeasure6;
    private String strMeasure5;
    private String strMeasure4;
    private String strMeasure3;
    private String strMeasure2;
    private String strMeasure1;
    private String strIngredient20;
    private String strIngredient19;
    private String strIngredient18;
    private String strIngredient17;
    private String strIngredient16;
    private String strIngredient15;
    private String strIngredient14;
    private String strIngredient13;
    private String strIngredient12;
    private String strIngredient11;
    private String strIngredient10;
    private String strIngredient9;
    private String strIngredient8;
    private String strIngredient7;
    private String strIngredient6;
    private String strIngredient5;
    private String strIngredient4;
    private String strIngredient3;
    private String strIngredient2;
    private String strIngredient1;
    private String strYoutube;
    private String strTags;
    private String strMealThumb;
    private String strInstructions;
    private String strArea;
    private String strCategory;
    private String strMeal;
    private String idMeal;

    protected Meals(Parcel in) {
      strSource = in.readString();
      strMeasure20 = in.readString();
      strMeasure19 = in.readString();
      strMeasure18 = in.readString();
      strMeasure17 = in.readString();
      strMeasure16 = in.readString();
      strMeasure15 = in.readString();
      strMeasure14 = in.readString();
      strMeasure13 = in.readString();
      strMeasure12 = in.readString();
      strMeasure11 = in.readString();
      strMeasure10 = in.readString();
      strMeasure9 = in.readString();
      strMeasure8 = in.readString();
      strMeasure7 = in.readString();
      strMeasure6 = in.readString();
      strMeasure5 = in.readString();
      strMeasure4 = in.readString();
      strMeasure3 = in.readString();
      strMeasure2 = in.readString();
      strMeasure1 = in.readString();
      strIngredient20 = in.readString();
      strIngredient19 = in.readString();
      strIngredient18 = in.readString();
      strIngredient17 = in.readString();
      strIngredient16 = in.readString();
      strIngredient15 = in.readString();
      strIngredient14 = in.readString();
      strIngredient13 = in.readString();
      strIngredient12 = in.readString();
      strIngredient11 = in.readString();
      strIngredient10 = in.readString();
      strIngredient9 = in.readString();
      strIngredient8 = in.readString();
      strIngredient7 = in.readString();
      strIngredient6 = in.readString();
      strIngredient5 = in.readString();
      strIngredient4 = in.readString();
      strIngredient3 = in.readString();
      strIngredient2 = in.readString();
      strIngredient1 = in.readString();
      strYoutube = in.readString();
      strTags = in.readString();
      strMealThumb = in.readString();
      strInstructions = in.readString();
      strArea = in.readString();
      strCategory = in.readString();
      strMeal = in.readString();
      idMeal = in.readString();
    }

    public static final Creator<Meals> CREATOR = new Creator<Meals>() {
      @Override public Meals createFromParcel(Parcel in) {
        return new Meals(in);
      }

      @Override public Meals[] newArray(int size) {
        return new Meals[size];
      }
    };

    public String getStrsource() {
      return strSource;
    }

    public String getStrmeasure20() {
      return strMeasure20;
    }

    public String getStrmeasure19() {
      return strMeasure19;
    }

    public String getStrmeasure18() {
      return strMeasure18;
    }

    public String getStrmeasure17() {
      return strMeasure17;
    }

    public String getStrmeasure16() {
      return strMeasure16;
    }

    public String getStrmeasure15() {
      return strMeasure15;
    }

    public String getStrmeasure14() {
      return strMeasure14;
    }

    public String getStrmeasure13() {
      return strMeasure13;
    }

    public String getStrmeasure12() {
      return strMeasure12;
    }

    public String getStrmeasure11() {
      return strMeasure11;
    }

    public String getStrmeasure10() {
      return strMeasure10;
    }

    public String getStrmeasure9() {
      return strMeasure9;
    }

    public String getStrmeasure8() {
      return strMeasure8;
    }

    public String getStrmeasure7() {
      return strMeasure7;
    }

    public String getStrmeasure6() {
      return strMeasure6;
    }

    public String getStrMeasure5() {
      return strMeasure5;
    }

    public String getStrMeasure4() {
      return strMeasure4;
    }

    public String getStrMeasure3() {
      return strMeasure3;
    }

    public String getStrMeasure2() {
      return strMeasure2;
    }

    public String getStrMeasure1() {
      return strMeasure1;
    }

    public String getStrIngredient20() {
      return strIngredient20;
    }

    public String getStrIngredient19() {
      return strIngredient19;
    }

    public String getStrIngredient18() {
      return strIngredient18;
    }

    public String getStrIngredient17() {
      return strIngredient17;
    }

    public String getStrIngredient16() {
      return strIngredient16;
    }

    public String getStrIngredient15() {
      return strIngredient15;
    }

    public String getStrIngredient14() {
      return strIngredient14;
    }

    public String getStrIngredient13() {
      return strIngredient13;
    }

    public String getStrIngredient12() {
      return strIngredient12;
    }

    public String getStrIngredient11() {
      return strIngredient11;
    }

    public String getStrIngredient10() {
      return strIngredient10;
    }

    public String getStrIngredient9() {
      return strIngredient9;
    }

    public String getStrIngredient8() {
      return strIngredient8;
    }

    public String getStrIngredient7() {
      return strIngredient7;
    }

    public String getStrIngredient6() {
      return strIngredient6;
    }

    public String getStrIngredient5() {
      return strIngredient5;
    }

    public String getStrIngredient4() {
      return strIngredient4;
    }

    public String getStrIngredient3() {
      return strIngredient3;
    }

    public String getStrIngredient2() {
      return strIngredient2;
    }

    public String getStrIngredient1() {
      return strIngredient1;
    }

    public String getStrYoutube() {
      return strYoutube;
    }

    public String getStrtags() {
      return strTags;
    }

    public String getStrMealThumb() {
      return strMealThumb;
    }

    public String getStrInstructions() {
      return strInstructions;
    }

    public String getStrArea() {
      return strArea;
    }

    public String getStrCategory() {
      return strCategory;
    }

    public String getStrMeal() {
      return strMeal;
    }

    public String getIdMeal() {
      return idMeal;
    }

    @Override public int describeContents() {
      return 0;
    }

    @Override public void writeToParcel(Parcel dest, int flags) {

      dest.writeString(strSource);
      dest.writeString(strMeasure20);
      dest.writeString(strMeasure19);
      dest.writeString(strMeasure18);
      dest.writeString(strMeasure17);
      dest.writeString(strMeasure16);
      dest.writeString(strMeasure15);
      dest.writeString(strMeasure14);
      dest.writeString(strMeasure13);
      dest.writeString(strMeasure12);
      dest.writeString(strMeasure11);
      dest.writeString(strMeasure10);
      dest.writeString(strMeasure9);
      dest.writeString(strMeasure8);
      dest.writeString(strMeasure7);
      dest.writeString(strMeasure6);
      dest.writeString(strMeasure5);
      dest.writeString(strMeasure4);
      dest.writeString(strMeasure3);
      dest.writeString(strMeasure2);
      dest.writeString(strMeasure1);
      dest.writeString(strIngredient20);
      dest.writeString(strIngredient19);
      dest.writeString(strIngredient18);
      dest.writeString(strIngredient17);
      dest.writeString(strIngredient16);
      dest.writeString(strIngredient15);
      dest.writeString(strIngredient14);
      dest.writeString(strIngredient13);
      dest.writeString(strIngredient12);
      dest.writeString(strIngredient11);
      dest.writeString(strIngredient10);
      dest.writeString(strIngredient9);
      dest.writeString(strIngredient8);
      dest.writeString(strIngredient7);
      dest.writeString(strIngredient6);
      dest.writeString(strIngredient5);
      dest.writeString(strIngredient4);
      dest.writeString(strIngredient3);
      dest.writeString(strIngredient2);
      dest.writeString(strIngredient1);
      dest.writeString(strYoutube);
      dest.writeString(strTags);
      dest.writeString(strMealThumb);
      dest.writeString(strInstructions);
      dest.writeString(strArea);
      dest.writeString(strCategory);
      dest.writeString(strMeal);
      dest.writeString(idMeal);
    }
  }
}
