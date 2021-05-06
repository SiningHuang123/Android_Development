package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.broadcasttest.BaseActivity
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        login.setOnClickListener {
            val password = pin.text.toString()
            val account = account.text.toString()
            if (account == "hsn" && password == "123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Account or password is invalid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}