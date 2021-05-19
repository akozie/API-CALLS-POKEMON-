package com.decagon.android.sq007.Services

import android.util.Log
import com.decagon.android.sq007.OnItemClick.DataReady
import com.decagon.android.sq007.common.Common
import com.decagon.android.sq007.retrofit.RetrofitClient
import com.decagon.android.sq007.retrofit.RetrofitInterface
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

object ApiService {

    private var retrofitInterface: RetrofitInterface

    init {
        val retrofit = RetrofitClient.instance
        retrofitInterface = retrofit.create(RetrofitInterface::class.java)
    }
    var compositeDisposable = CompositeDisposable()

    fun fetchPokeMonList(listener: DataReady) {
        compositeDisposable.add(
            retrofitInterface.pokemonList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Log.i("PokemonList", "${it.results}")
                    listener.onPokemonListSuccess(it.results)
                }
        )
    }

    fun fetchPokeMonDetails(id: String, listener: DataReady) {
        compositeDisposable.add(
            retrofitInterface.PokemonDetails(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    Common.apply {

                        abilities = it.abilities
                        stats = it.stats
                        move = it.moves
                        imagePosition = id
                        listener.onDataDetailsSuccess()
                    }
                }
        )
    }

    fun fetchPokeMonImage(id: String) {
        compositeDisposable.add(
            retrofitInterface.PokemonImage(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                }
        )
    }
}
