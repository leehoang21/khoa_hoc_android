package com.tuhoc.bai23_kotlin_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //code btnInsertData mở màn hình InsertionActivity
        btnInsertData.setOnClickListener {
            val intent = Intent(this,InsertionActivity::class.java)
            startActivity(intent)
        }
        //code mở màn hình FetchingActivity
        btnFetchData.setOnClickListener {
            val intent = Intent(this,FetchingActivity::class.java)
            startActivity(intent)
        }
    }
}