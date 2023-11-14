package com.example.recyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent

class MyAdapter(var blist: ArrayList<Food>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
  private lateinit var name: EditText


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)


        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {

        name =holder.itemView.findViewById(R.id.name)
       name.text = blist[position].name.trim()
      //  name.text = this.blist[position].name
       // holder.itemView.image.setImageResource(blist[position].image)


    }

    override fun getItemCount(): Int {
        return blist.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}