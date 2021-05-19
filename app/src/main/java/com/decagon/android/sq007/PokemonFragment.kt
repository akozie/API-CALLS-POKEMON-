package com.decagon.android.sq007

// import android.os.Bundle
// import android.util.Log
// import androidx.fragment.app.Fragment
// import android.view.LayoutInflater
// import android.view.View
// import android.view.ViewGroup
// import android.widget.LinearLayout
// import androidx.recyclerview.widget.GridLayoutManager
// import androidx.recyclerview.widget.LinearLayoutManager
// import androidx.recyclerview.widget.RecyclerView
// import com.decagon.android.sq007.OnItemClick.ItemClickListener
// import com.decagon.android.sq007.Services.ApiService
// import com.decagon.android.sq007.adapter.PokemonAdapter
// import com.decagon.android.sq007.common.Common
// import com.decagon.android.sq007.common.ItemOffSetDecoration
// import com.decagon.android.sq007.model.Pokemon
// import com.decagon.android.sq007.retrofit.RetrofitClient
// import com.decagon.android.sq007.retrofit.RetrofitInterface
// import io.reactivex.android.schedulers.AndroidSchedulers
// import io.reactivex.disposables.CompositeDisposable
// import io.reactivex.schedulers.Schedulers
//
//
//
// /**
// * A simple [Fragment] subclass.
// * Use the [PokemonFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
// import com.decagon.android.sq007.api.Result
// import kotlinx.coroutines.launch
// import kotlinx.coroutines.runBlocking
//
// class PokemonFragment : Fragment(){
//
//
//    private lateinit var pokemonRecyclerview: RecyclerView
//   private lateinit var pokemonList: List<Result>
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_pokemon, container, false)
//        pokemonRecyclerview = view.findViewById(R.id.pokemon_recyclerview)
//        pokemonList=ArrayList()
//
//
//       pokemonRecyclerview.layoutManager = GridLayoutManager(activity, 2)
//        val itemDecoration = ItemOffSetDecoration(requireActivity(), R.dimen.spacing)
//        pokemonRecyclerview.addItemDecoration(itemDecoration)
//
//
//        setRecyclerViewAdapter()
//
//        return view
//    }
//
//    private fun setRecyclerViewAdapter(){
//
//        val adapter = PokemonAdapter(requireContext(),pokemonList, activity as MainActivity )
//        pokemonRecyclerview.adapter = adapter
//    }
//
//
//
//
// }
