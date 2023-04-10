package com.example.a1402021040

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        getSupportActionBar()?.hide();
        var btnNextLogin = findViewById<Button>(R.id.btn_signup)
        btnNextLogin.setOnClickListener(View.OnClickListener {
            var intentLogin = Intent(this@LoginActivity,
                RegisterActivity::class.java)
            startActivity(intentLogin)
        })
    }
}