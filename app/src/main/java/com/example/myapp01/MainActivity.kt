package com.example.myapp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lock = 0
        //var login = 0

        btn_login.setOnClickListener { // 로그인 _db와 연결해야 함
            val id = et_id.text.toString()
            tv_id2.setText(id) // id가 db에 있는지 검사하기
            var dbId = "나중에 구현하기!"
            if (id == dbId) {
                var pw = et_pw.text.toString()
                tv_pw2.setText(pw) // id가 있으면 pw가 db의 pw와 같은지 확인하고
                val dbPw = "나중에 구현하기!"
                var wrongPw = 0;
                while (lock == 0) {
                    if (pw == dbPw) {
                        // pw가 맞았다면 '로그인 성공' 토스트 메세지 띄우고 메인 화면으로 넘어가기
                        //login = 1
                        break
                    }
                    else {
                        wrongPw++
                        // '비밀번호가 틀렸습니다. (틀린 횟수: n/5)' 텍스트 띄우기
                        if (wrongPw == 5) {
                            // '비밀번호를 5회 이상 틀렸습니다. 관리자에게 문의해주세요.' 텍스트트 띄우기
                            lock = 1
                            break
                        }

                    }

                }
            } else {
                // id가 없으면 '아이디가 존재하지 않습니다' 텍스트 띄우기
            }

        }


        btn_searchPw.setOnClickListener { // 비밀번호 찾기 (화면 변경)
            val intent = Intent(this,SubActivity_SearchPw::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 설정
            startActivity(intent)

            // 아이디(학번)과 이름, 비밀번호 힌트 입력하도록 하기
            // 입력받은 아이디(학번)과 이름, 비밀번호 힌트가 일치하면 '비밀번호 : $' 텍스트 띄우기
            // 일치하지 않는다면 '입력하신 내용과 일치하는 정보를 찾지 못했습니다. 힌트를 잊어버리셨다면 관리자에게 문의해주세요.' 띄우기

            // 확인 버튼
            // 취소 버튼
        }

        btn_manager.setOnClickListener {
            val intent = Intent(this,SubActivity_Manager::class.java)
            startActivity(intent)
            
            // 관리자에게 연락할 수단 만들어주기
            // 1. 비밀번호 문의
            // 2. 건의사항
            // 3. 오류 등 문의
        }

        btn_noLogin.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

    }

    var lastTimeBackPressed : Long = 0
    override fun onBackPressed() {
        if(System.currentTimeMillis() - lastTimeBackPressed >= 1500){
            lastTimeBackPressed = System.currentTimeMillis()
            Toast.makeText(this,"한번 더 누르시면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        }
        else {
            finish()
        }
    }

}


/*
// 나중에 로그인 후 접속 창에서 btn_modify 버튼 생성하기
btn_modify.setOnClickListener { // 개인정보 변경 (화면 변경경)_db와 연결해야
    // 아이디(학번) _변경 불가능
    // 이름 _변경 불가능
    // 비밀번호(default: knpu1234)
    // 비밀번호 확인
    // 비밀번호 힌트(비밀번호 찾기용)

    // 확인 버튼
    // 취소 버튼
}
*/