package com.example.a1402021040

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();
        var btnNextLogin = findViewById<Button>(R.id.btn_next)
        btnNextLogin.setOnClickListener(View.OnClickListener {
            var intentLogin = Intent(this@SplashScreen,
                LoginActivity::class.java)
            startActivity(intentLogin)
        })
    }
}