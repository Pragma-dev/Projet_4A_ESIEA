package com.example.projet_4a_esiea.presentation.main

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projet_4a_esiea.R
import com.example.projet_4a_esiea.data.local.models.Joke
import kotlinx.android.synthetic.main.row_layout.view.*


class ListAdapter(private val List: List<Joke>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = List[position]
        holder.textView1.text = currentItem.joke
    }

    override fun getItemCount() = List.size

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textView1 : TextView = itemView.line1

    }

}