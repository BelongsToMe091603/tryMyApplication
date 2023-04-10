package com.example.a1402021040

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getSupportActionBar()?.hide();
        var btnBackLogin = findViewById<ImageButton>(R.id.signIn)
        btnBackLogin.setOnClickListener(View.OnClickListener {
            var intentLogin = Intent(this@RegisterActivity,
                LoginActivity::class.java)
            startActivity(intentLogin)
        })
    }
}