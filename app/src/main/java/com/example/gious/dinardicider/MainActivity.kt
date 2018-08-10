package com.example.gious.dinardicider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist =  arrayListOf("Chines","Italian","Japeness","Burger")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodlist.count())

            selectedFoodtext.text = foodlist[randomFood]
        }

        addFoodbtn.setOnClickListener {
            val newFood = addFood.text.toString()
            foodlist.add(newFood)
            addFood.text.clear()
        }
    }
}

