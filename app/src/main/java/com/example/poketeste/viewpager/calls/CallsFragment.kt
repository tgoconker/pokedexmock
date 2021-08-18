package com.example.poketeste.viewpager.calls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.poketeste.R
import com.example.poketeste.viewpager.calls.adapter.Call
import com.example.poketeste.viewpager.calls.adapter.CallsAdapter

class CallsFragment : Fragment() {
    private lateinit var callview: View
    private lateinit var recyclerView: RecyclerView

    private val listCalls = arrayListOf(
        Call(R.drawable.butterfree012,
            "Buterfree",
            "012"
            ),
        Call(R.drawable.chansey113,
            "Chansey",
            "113"
            ),
        Call(R.drawable.charmander004,
            "Charmander",
            "004"
            ),
        Call(R.drawable.cubone104,
            "Cubone",
            "104"
            ),
        Call(R.drawable.gengar094,
            "Gengar",
            "094"
            ),Call(R.drawable.jigglypuff039,
            "jigglypuff",
            "039"
            ),Call(R.drawable.kadabra064,
            "Kadabra",
            "064"
            )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { callview = inflater.inflate(R.layout.fragment_calls, container, false )
        return callview
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView = callview.findViewById(R.id.rv_calls)


        recyclerView.apply {
            setHasFixedSize(true)
            recyclerView.layoutManager = GridLayoutManager(context, 2)

            adapter = CallsAdapter(listCalls)
            addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
        }
    }
}