package com.example.poketeste.viewpager.calls.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.poketeste.R

class CallViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    private var imgCall = itemView.findViewById<ImageView>(R.id.imgCall)
    private var nameCall = itemView.findViewById<TextView>(R.id.txtPokemonName)
    private var dateCall = itemView.findViewById<TextView>(R.id.txtPokemonNumber)

    fun bind(call: Call){
        imgCall.setImageResource(call.image)
        nameCall.text = call.name
        dateCall.text = call.date
    }
}