package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub__the_univ.*

class SubActivity_TheUniv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__the_univ)
        setUpUI()
    }

    var lastTimeBackPressed : Long = 0
    override fun onBackPressed() {
        if(System.currentTimeMillis() - lastTimeBackPressed >= 1500){
            lastTimeBackPressed = System.currentTimeMillis()
            Toast.makeText(this,"한번 더 누르시면 해당 탭이 종료됩니다.",Toast.LENGTH_LONG).show()
        }
        else {
            finish()
        }
    }

    private fun setUpUI() {
        // webview client 객체를 넘긴다
        // wbMain.setWebViewClient(WebClient())
        wbMain.webViewClient = WebViewClient()
        // 브라우저 세팅을 가져온다.
        val set = wbMain.getSettings()
        // 자바스크립트를 실행 가능하게
        set.setJavaScriptEnabled(true)
        // 웹 뷰에 맞게 출력하기
        set.setLoadWithOverviewMode(true)
        // Zoom 버튼의 보여지기 설정 -> Pinch로 Zoom을 가능하게 할 수도 있음
        // 아래와 같이 하면
        set.setBuiltInZoomControls(true)
        set.setUseWideViewPort(true)
        btnLMS.setOnClickListener{
            // 이동한다.
            wbMain.loadUrl(
                "https://lms.police.ac.kr/login.php"
            )
        }
        btnKNPU.setOnClickListener {
            Toast.makeText(this,"접속중입니다.",Toast.LENGTH_SHORT).show()
            wbMain.loadUrl(
                "https://knpu.police.ac.kr/"
            )
        }
        btnTheUniv.setOnClickListener {
            wbMain.loadUrl("http://theuniv.us/")
        }
        // webview에서 필요한 클래스
        class WebClient : WebViewClient(){
            // URL을 요청했다면...
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean{
                view.loadUrl(url)
                return true
            }
        }

    }
}