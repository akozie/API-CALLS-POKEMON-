package com.decagon.android.sq007.common

import com.decagon.android.sq007.api.*

object Common {

    var abilities: List<Ability>? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var move: List<Move>? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var stats: List<Stat>? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var imagePosition: String? = null
        get() {
            return field
        }
        set(value) {
            field = value
        }

//    var pokemonList: List<Pokemon> = ArrayList()
//    var spritesList: List<Sprites> = ArrayList()
    val BASE_KEY = "position"
}
