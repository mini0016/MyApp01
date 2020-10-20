package com.example.myapp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub__setting.*

class SubActivity_Setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__setting)

        btn_askMng.setOnClickListener {
            val intent = Intent(this,SubActivity_Manager::class.java)
            startActivity(intent)
        }
    }
}