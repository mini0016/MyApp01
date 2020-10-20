package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubActivity_Microdust : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__microdust)


    }
}


/*
미세먼지 Open API
    - 네트워크 통신 : Retrofit
    - weather@sk.com로 메일 보내야 함
    서비스명
    용도
    일 API 호출 수 : 500
    사용 날씨 요소 : 미세먼지 정보
    계약 기간 :

현재 위치 FusedLocationProvider

지역 저장, 삭제 Realm

새로고침 SwipeRefreshLayout
 */