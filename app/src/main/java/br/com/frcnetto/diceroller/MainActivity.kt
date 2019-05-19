package br.com.frcnetto.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        when((Random().nextInt(6) + 1)){
            1    -> dice.setImageResource(R.drawable.dice_1)
            2    -> dice.setImageResource(R.drawable.dice_2)
            3    -> dice.setImageResource(R.drawable.dice_3)
            4    -> dice.setImageResource(R.drawable.dice_4)
            5    -> dice.setImageResource(R.drawable.dice_5)
            6    -> dice.setImageResource(R.drawable.dice_6)
            else -> dice.setImageResource(R.drawable.empty_dice)
        }
    }
}
