package com.trios2024amrk.moodapp

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var scoreTextView: TextView
    private lateinit var roundTextView: TextView
    private lateinit var moodButton: Button
    private lateinit var seekBar: SeekBar
    private lateinit var seekBarValue: TextView


    private  var round = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scoreTextView = findViewById(R.id.score_textView)
        roundTextView = findViewById(R.id.round_textView)
        moodButton = findViewById(R.id.mood_button)
        seekBar = findViewById(R.id.seekBar)
        //seekBarValue = findViewById(R.id.seekBarValue)

        moodButton.setOnClickListener { incrementRound() }
    }

    private fun incrementRound() {
        round++
        score = score + (round+12)

        val newRound = getString(R.string.round, round)
        roundTextView.text = newRound

        val newScore = getString(R.string.score, score)
        scoreTextView.text = newScore
    }

    private fun resetGame() {
        // reset game logic
    }

    private fun startGame() {
        // start game logic
    }

    private fun endGame() {
        // end game logic
    }
}
