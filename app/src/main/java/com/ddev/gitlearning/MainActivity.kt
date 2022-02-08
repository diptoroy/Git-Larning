package com.ddev.gitlearning

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ddev.gitlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.randomBtn.setOnClickListener {
//            var randomNumber = (0..20).random()
//            binding.digitTextView.text = randomNumber.toString()
//        }

        binding.increaseBtn.setOnClickListener {
            count++
            binding.digitTextView.text = count.toString()
        }

        binding.decreaseBtn.setOnClickListener {
            if(count != 0) {
                count--
                binding.digitTextView.text = count.toString()
            }
        }
    }
}