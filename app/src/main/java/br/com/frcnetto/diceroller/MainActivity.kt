package br.com.frcnetto.diceroller

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        dice.setImageDrawable(returnDiceFaceByNumber(Random().nextInt(6) + 1))
    }

    private fun returnDiceFaceByNumber(face: Int): Drawable {
        return when(face){
            1    -> resources.getDrawable(R.drawable.dice_1)
            2    -> resources.getDrawable(R.drawable.dice_2)
            3    -> resources.getDrawable(R.drawable.dice_3)
            4    -> resources.getDrawable(R.drawable.dice_4)
            5    -> resources.getDrawable(R.drawable.dice_5)
            6    -> resources.getDrawable(R.drawable.dice_6)
            else -> resources.getDrawable(R.drawable.empty_dice)
        }
    }
}
