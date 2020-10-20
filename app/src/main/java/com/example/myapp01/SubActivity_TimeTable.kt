package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub__time_table.*
import org.jsoup.Connection
import org.jsoup.Jsoup
import org.jsoup.select.Elements


class SubActivity_TimeTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub__time_table)

        /*
        var res: Connection.Response = Jsoup.connect("https://www.lms.police.ac.kr/login.php")
            .data("action","Login","module","Default","username","20190016","password","a4035115~","x","30","y","6")
            .method(Connection.Method.POST)
            .timeout(10000)
            .execute()
        var cookies: Map<String,String> = res.cookies()
        var doc: org.jsoup.nodes.Document = Jsoup.connect("https://www.lms.police.ac.kr")
            .cookies(cookies)
            .timeout(10000)
            .get()


        btn_adapt.setOnClickListener {

        }
*/
    }
}