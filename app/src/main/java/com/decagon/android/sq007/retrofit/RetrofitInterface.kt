package com.decagon.android.sq007.retrofit

import com.decagon.android.sq007.api.PokemonDataDetails
import com.decagon.android.sq007.model.Pokemon
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitInterface {
    @GET("?limit=100&offset=0")
    fun pokemonList(): Observable<Pokemon>

    @GET("{id}")
    fun PokemonDetails(@Path("id")id: String): Observable<PokemonDataDetails>

    @GET("/sprites/{id}")
    fun PokemonImage(@Path("id")id: String): Observable<Pokemon>
}
