package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {

            rollDice()
        }

    }

    private fun rollDice() {

        // this is testing from windows

        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt= Random.nextInt(100) + 1
        resultText.text = randomInt.toString()
    }
}
