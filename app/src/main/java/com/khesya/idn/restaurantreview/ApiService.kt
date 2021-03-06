package com.khesya.idn.restaurantreview

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")

    fun getRestaurant(
        @Path("id") id:String
    ) : Call<RestaurantResponse>


    @FormUrlEncoded
    @Headers("Athorization: token 12345")
    @POST("reviiew")
    fun postReview(
        @Field("id")id: String,
        @Field("name")name: String,
        @Field("review")review: String
    ): Call<PostReviewResponse>
}