package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview = findViewById(R.id.recyclerview)
        /////////////////////////////////
        val food = ArrayList<Food>()
        food.add(Food("Coffee", R.string.coffee, R.drawable.coffee_pot))
        food.add(Food("Espresso", R.string.espersso, R.drawable.espresso))
        food.add(Food("French fries", R.string.frenchFires, R.drawable.french_fries))
        food.add(Food("Honey", R.string.honey, R.drawable.honey))
        food.add(Food("Icecream", R.string.icecream, R.drawable.strawberry_ice_cream))
        food.add(Food("Sugar", R.string.sugarcubes, R.drawable.sugar_cubes))

        // Set the Layout Manager
        recyclerview.layoutManager = GridLayoutManager(this, 2)
        // Create an object for the MyAdapter
         val adapter = MyAdapter(food)
        // Set adapter to your RecyclerView
        recyclerview.adapter = adapter
    }
}