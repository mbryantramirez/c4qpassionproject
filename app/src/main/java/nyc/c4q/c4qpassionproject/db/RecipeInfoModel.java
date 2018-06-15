package nyc.c4q.c4qpassionproject.db;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RecipeInfoModel extends RealmObject {
  private String ListId;
  private RealmList<String> ingredients = new RealmList<>();
  private RealmList<String> measures = new RealmList<>();
  private String recipeInstructions;
  private String recipeImageUrl;
  @PrimaryKey
  private String recipeName;

  public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
  }

  public String getListId() {
    return ListId;
  }

  public void setListId(String listId) {
    ListId = listId;
  }

  public String getRecipeName() {
    return recipeName;
  }

  public String getRecipeImageUrl() {
    return recipeImageUrl;
  }

  public void setRecipeImageUrl(String recipeImageUrl) {
    this.recipeImageUrl = recipeImageUrl;
  }

  public RealmList<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(RealmList<String> ingredients) {
    this.ingredients = ingredients;
  }

  public RealmList<String> getMeasures() {
    return measures;
  }

  public void setMeasures(RealmList<String> measures) {
    this.measures = measures;
  }

  public String getRecipeInstructions() {
    return recipeInstructions;
  }

  public void setRecipeInstructions(String recipeInstructions) {
    this.recipeInstructions = recipeInstructions;
  }
}
