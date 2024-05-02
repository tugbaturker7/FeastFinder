package com.example.feastfinder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter (private val mContext: Context, private val carList: List<Foods>) : RecyclerView.Adapter<FoodAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var text: TextView
        var cardImage: ImageView
        init {
            CardView = view.findViewById(R.id.foodCardView)
            text = view.findViewById(R.id.cardtext)
            cardImage=view.findViewById(R.id.food_card_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.food,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(
        holder: FoodAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val food = carList[position]
        holder.text.setText(food.name)
        if (food.name=="Lahmacun") {
            holder.cardImage.setBackgroundResource(R.drawable.lahmacun)


        }
        if (food.name=="Kebap") {
            holder.cardImage.setBackgroundResource(R.drawable.kebap)

        }
        if (food.name.equals("Yaprak Sarma")) {
            holder.cardImage.setBackgroundResource(R.drawable.yapraksarma)

        }
        if (food.name=="Mantı") {
            holder.cardImage.setBackgroundResource(R.drawable.manti)

        }
        if (food.name=="Baklava") {
            holder.cardImage.setBackgroundResource(R.drawable.baklavajpg)

        }

        holder.CardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("foodname", food.name)
            mContext.startActivity(intent)
        })
    }
}