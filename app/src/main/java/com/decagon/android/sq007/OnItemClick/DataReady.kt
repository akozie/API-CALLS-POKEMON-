package com.decagon.android.sq007.OnItemClick

import com.decagon.android.sq007.api.Result

interface DataReady {

    abstract fun onDataDetailsSuccess()
    abstract fun onDataDetailsFailure()
    abstract fun onPokemonListSuccess(pokemonResultList: List<Result>)
    abstract fun onPokemonListFailure()
}
