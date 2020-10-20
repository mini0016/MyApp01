package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sub__manager.*


class SubActivity_Manager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__manager)


        var mngInfo = 0


        btn_proposal.setOnClickListener {

        }

        btn_ask.setOnClickListener {

        }

        btn_mngInfo.setOnClickListener {
            if(mngInfo==0){
                tv_mngInfo.setVisibility(View.VISIBLE)
                mngInfo=1
            }
            else{
                tv_mngInfo.setVisibility(View.INVISIBLE)
                mngInfo=0
            }

        }


    }

}