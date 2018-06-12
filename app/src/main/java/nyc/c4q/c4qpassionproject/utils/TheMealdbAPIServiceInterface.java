package nyc.c4q.c4qpassionproject.utils;

import nyc.c4q.c4qpassionproject.models.MealsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TheMealdbAPIServiceInterface {

    @GET("api/json/v1/1/latest.php")
    Call<MealsResponse> getMealDBRecipies();

}
