package nyc.c4q.c4qpassionproject.utils;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class MealDBServiceGenerator {

  private static final String BASE_URL = "https://www.themealdb.com/";

  private static Retrofit.Builder builder =
      new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create());

  private static Retrofit retrofit = builder.build();

  private static HttpLoggingInterceptor loggingInterceptor =
      new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

  private static OkHttpClient.Builder okhttpclient = new OkHttpClient.Builder();

  public static TheMealdbAPIServiceInterface createMealdbService() {
    if (!okhttpclient.interceptors().contains(loggingInterceptor)) {
      okhttpclient.addInterceptor(loggingInterceptor);
      builder.client(okhttpclient.build());
      retrofit = builder.build();
    }
    return retrofit.create(TheMealdbAPIServiceInterface.class);
  }
}
