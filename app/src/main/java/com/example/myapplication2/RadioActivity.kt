package com.example.myapplication2

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    lateinit var cat : RadioButton
    lateinit var tree : RadioButton
    lateinit var fish : RadioButton
    lateinit var image : ImageView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        cat = findViewById(R.id.CatRadio)
        tree = findViewById(R.id.treeRadio)
        fish = findViewById(R.id.fishRadio)
        image = findViewById(R.id.catImage)

        cat.setOnClickListener {
            image.setImageResource(R.drawable.cat)
        }
        fish.setOnClickListener {
            image.setImageResource(R.drawable.fish)
        }
        tree.setOnClickListener {
            image.setImageResource(R.drawable.tree
            )
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}