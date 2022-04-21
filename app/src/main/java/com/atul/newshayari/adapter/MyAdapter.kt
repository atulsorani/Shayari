package com.atul.shayari.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atul.newshayari.R


class MyAdapter(val Categoryes : List<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    val colorList = listOf<String>("#55efc4","#81ecec","#74b9ff","#a29bfe","#00b894")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater :LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.category_design,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.categorytitle.text = Categoryes[position]
        if (position % 5 == 0){
            holder.categorytitle.setBackgroundColor(Color.parseColor(colorList[0]))
        }else if (position % 5 == 1){
            holder.categorytitle.setBackgroundColor(Color.parseColor(colorList[1]))
        }else if (position % 5 == 2){
            holder.categorytitle.setBackgroundColor(Color.parseColor(colorList[2]))
        }else if (position % 5 == 3){
            holder.categorytitle.setBackgroundColor(Color.parseColor(colorList[3]))
        }else if (position % 5 == 4){
            holder.categorytitle.setBackgroundColor(Color.parseColor(colorList[4]))
        }
    }

    override fun getItemCount(): Int {
        return Categoryes.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categorytitle = itemView.findViewById<TextView>(R.id.title)
    }
}