package com.example.lesoon1a3

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesoon1a3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),CounterView {

    private val presenter = CounterPresenter()

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        presenter.attachView(this)

        with(binding){

            btnPlus.setOnClickListener {
                presenter.onIncrement()
            }

            btnMinus.setOnClickListener {
                presenter.onDecrement()
            }
        }
    }

    override fun updateCount(count: Int) {
        binding.counter.text = count.toString()

        presenter.onEqualToTen()
        presenter.onEqualToFifteen()
    }

    override fun showToast() {
        Toast.makeText(this,"Поздравляем",Toast.LENGTH_LONG).show()
    }

    override fun turnCountToGreen() {
        binding.counter.setTextColor(Color.GREEN)
    }

    override fun turnCountToBlack() {
        binding.counter.setTextColor(Color.BLACK)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}