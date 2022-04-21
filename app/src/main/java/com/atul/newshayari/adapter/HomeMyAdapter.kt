package com.atul.shayari.adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import com.atul.newshayari.MainActivity
import com.atul.newshayari.R


class HomeMyAdapter(mCtx: MainActivity, val Shayri: List<String>) :RecyclerView.Adapter<HomeMyAdapter.HomeMyViewHolder>() {
    val mCtx = mCtx
    val colorList = listOf<String>("#55efc4","#81ecec","#74b9ff","#fab1a0","#00b894")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMyViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.home_design,parent,false)
        return HomeMyViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeMyViewHolder, position: Int) {
        holder.shayri.text = Shayri[position]

        if (position % 5 == 0){
            holder.card.setBackgroundColor(Color.parseColor(colorList[0]))
        }else if (position % 5 == 1){
            holder.card.setBackgroundColor(Color.parseColor(colorList[1]))
        }else if (position % 5 == 2){
            holder.card.setBackgroundColor(Color.parseColor(colorList[2]))
        }else if (position % 5 == 3){
            holder.card.setBackgroundColor(Color.parseColor(colorList[3]))
        }else if (position % 5 == 4){
            holder.card.setBackgroundColor(Color.parseColor(colorList[4]))
        }
        holder.copy.setOnClickListener {
            val clipboard: ClipboardManager? =
                mCtx.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager?
            val clip = ClipData.newPlainText("label", Shayri[position])
            clipboard!!.setPrimaryClip(clip)
            Toast.makeText(mCtx, "Copied", Toast.LENGTH_SHORT).show()
        }
        var count = 0
        holder.like.setOnClickListener {
            if (count == 0) {
                holder.like.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.fillheart, 0, 0,0)
                count = count+1
                holder.like.setText("Liked")
            }else{
                holder.like.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.heart, 0, 0,0)
                count = count-1
                holder.like.setText("")
            }
        }

    }

    override fun getItemCount(): Int {
        return Shayri.size
    }
    class HomeMyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val shayri = itemView.findViewById<TextView>(R.id.shayri)
        val card = itemView.findViewById<soup.neumorphism.NeumorphCardView>(R.id.card)
        val copy = itemView.findViewById<TextView>(R.id.copy)
        val like = itemView.findViewById<TextView>(R.id.like)
    }
}
