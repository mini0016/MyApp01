package com.example.myapp01

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        
        btn_rollCall3.setOnClickListener { // 인원점검
            // intent
            val intent = Intent(this,SubActivity_RollCall::class.java)
            startActivity(intent)
            // 새로고침 탭
            // 이름 또는 학번 검색
            // ex) 2020.10.17(토) 00:18 형식으로 현재 날짜와 시각 표시
            // 힉번 | 이름 | 아침체온점호 | 저녁체온점호 형식으로 자료 보여주기
        }
        
        btn_microdust3.setOnClickListener {  // 미세먼지
            // intent
            val intent = Intent(this,SubActivity_Microdust::class.java)
            startActivity(intent)
        }
        
        btn_timetable3.setOnClickListener {  // 시간표
            // intent
            // 로그인 0이면 "로그인 후 이용해주세요" 토스트 메세지 띄우기

            // if(로그인==0){
            Toast.makeText(this@MainActivity2,"로그인이 필요합니다",Toast.LENGTH_SHORT).show()
            // }
            val intent = Intent(this,SubActivity_TimeTable::class.java)
            startActivity(intent)
            // lms 크롤링 + 엑셀 데이터 활용하기
        }
        
        btn_portal3.setOnClickListener {  // 포털 접속
            val intent = Intent(this,SubActivity_TheUniv::class.java)
            startActivity(intent)

            // 웹사이트 불러오기
            // 포털 내용을 앱으로 만드는 거는 시간 및 실력 한계상 X
        }
        
        btn_login3.setOnClickListener { // 로그인하기
            // MainActivity는 이미 꺼졌으니 해당 액티비티 새로 띄우기
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        btn_setting3.setOnClickListener {  // 설정
            val intent = Intent(this,SubActivity_Setting::class.java)
            startActivity(intent)
            // 내 정보
            // 관리자 문의
            // 비밀번호 바꾸기
            // 로그아웃
            
        }
    }

    var lastTimeBackPressed : Long = 0
    override fun onBackPressed() {
        if(System.currentTimeMillis() - lastTimeBackPressed >= 1500){
            lastTimeBackPressed = System.currentTimeMillis()
            Toast.makeText(this,"한번 더 누르시면 앱이 종료됩니다.",Toast.LENGTH_SHORT).show()

        }
        else {
            finish()
        }
    }
}