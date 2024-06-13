package com.example.lesoon1a3

import android.os.Bundle
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
        setContentView(R.layout.activity_main)

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

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}