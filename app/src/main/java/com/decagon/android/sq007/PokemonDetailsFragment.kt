package com.decagon.android.sq007

// import android.content.Intent
// import android.os.Bundle
// import androidx.fragment.app.Fragment
// import android.view.LayoutInflater
// import android.view.View
// import android.view.ViewGroup
// import android.widget.ImageView
// import android.widget.TextView
// import androidx.recyclerview.widget.LinearLayoutManager
// import androidx.recyclerview.widget.RecyclerView
// import com.bumptech.glide.Glide
// import com.decagon.android.sq007.common.Common
// import com.decagon.android.sq007.model.Pokemon
//
// /**
// * A simple [Fragment] subclass.
// * Use the [PokemonDetailsFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
// class PokemonDetailsFragment : Fragment() {
//
//
//    lateinit var recyclerViewDetailsAbilities: RecyclerView
//    lateinit var recyclerViewDetailsMove: RecyclerView
//    lateinit var recyclerViewDetailsStats: RecyclerView
//    lateinit var  imageView: ImageView
//
//
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//    }
//
//
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_pokemon_details, container, false)
//
//
//
//
//
//
//        recyclerViewDetailsAbilities =view.findViewById(R.id.pokemon_details_recyclerview_abilities)
//
//        recyclerViewDetailsAbilities.apply {
//            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
//        }
//
//        recyclerViewDetailsMove = view.findViewById(R.id.pokemon_details_recyclerview_move)
//        recyclerViewDetailsMove.apply {
//            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
//        }
//
//        recyclerViewDetailsStats = view.findViewById(R.id.pokemon_details_recyclerview_stats)
//        recyclerViewDetailsStats.apply { layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false) }
//
//        imageView = view.findViewById(R.id.pokemon_details_image)
//        Glide.with(requireContext()).load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${Common.imagePosition+1}.png")
//            .into(imageView)
//        return view
//
//    }
//
//
//
// }
