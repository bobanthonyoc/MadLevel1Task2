package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    private var correctAnswers = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBtn.setOnClickListener{
            checkAnswers()
        }
    }


    private fun checkAnswers() {
        if (binding.conjunction1.text.toString() == "T") {
            correctAnswers++
        }
        if (binding.conjunction2.text.toString() == "F") {
            correctAnswers++
        }
        if (binding.conjunction3.text.toString() == "F") {
            correctAnswers++
        }
        if (binding.conjunction4.text.toString() == "F") {
            correctAnswers++
        }

        onSubmit()
        correctAnswers = 0
    }

    private fun onSubmit() {
        if (correctAnswers == 0) {
            Toast.makeText(this, getString(R.string.nonCorrect), Toast.LENGTH_LONG).show()
        }
        else if (correctAnswers == 1){
            Toast.makeText(this, getString(R.string.oneCorrect), Toast.LENGTH_LONG).show()
        } else if (correctAnswers == 2) {
            Toast.makeText(this, getString(R.string.twoCorrect), Toast.LENGTH_LONG).show()
        } else if (correctAnswers == 3) {
            Toast.makeText(this, getString(R.string.threeCorrect), Toast.LENGTH_LONG).show()
        }else if (correctAnswers == 4) {
            Toast.makeText(this, getString(R.string.fourCorrect), Toast.LENGTH_LONG).show()
        }

    }
}