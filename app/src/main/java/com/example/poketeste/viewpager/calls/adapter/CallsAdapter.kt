package com.example.poketeste.viewpager.calls.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.poketeste.R

class CallsAdapter(private val listCalls: List<Call>): RecyclerView.Adapter<CallViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.calls_item_layout, parent, false)
        return CallViewHolder(view)
    }

    override fun onBindViewHolder(holder: CallViewHolder, position: Int) =
        holder.bind(listCalls[position])

    override fun getItemCount(): Int =listCalls.size

}