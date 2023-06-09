package com.example.medicslepyshev;
import com.example.medicslepyshev.CodeResponse;
import com.example.medicslepyshev.EmailResponse;
import com.example.medicslepyshev.Sale;
import com.example.medicslepyshev.Tests;
import com.example.medicslepyshev.UpdateUser;
import com.example.medicslepyshev.User;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import java.util.List;

public interface MedicApi {

    @POST("api/sendCode")
    Call<EmailResponse> sendCode(
            @Header("email") String email
    );

    @POST("api/signin")
    Call<CodeResponse> signIn(
            @Header("email") String email,
            @Header("code") String code
    );

    @POST("api/createProfile")
    Call<User> createProfile(
            @Body User user,
            @Header("Authorization") String auth_key
    );

    @GET("api/news")
    Call<List<Sale>> getNews(
    );

    @GET("api/catalog")
    Call<List<Tests>> getTests();

    @PUT("api/updateProfile")
    Call<User> updateProfile(
            @Body UpdateUser user,
            @Header("Authorization") String auth_key
    );

    @Multipart
    @POST("api/avatar")
    Call<EmailResponse> uploadAvatar(
            @Header("Authorization") String auth_key,
            @Part MultipartBody.Part file
    );

}