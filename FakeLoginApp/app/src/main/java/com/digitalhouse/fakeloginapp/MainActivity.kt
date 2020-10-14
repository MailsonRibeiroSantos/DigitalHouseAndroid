package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreate.setOnClickListener {
            val intent = Intent(this,CreateAccount::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {

            if(edtEmail.text.toString() == ""){
                edtEmail.error = "Campo Vazio"
            }

            if(edtPassword.text.toString() == ""){
                edtPassword.error = "Campo Vazio"
            }

            var user = UserService.logIn(edtEmail.text.toString(), edtPassword.text.toString())

            if(user != null) {
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("name",user.name)
                startActivity(intent)
            }else{
                    Toast.makeText(this, "Usuário ou senha errada!!", Toast.LENGTH_SHORT).show()
            }

        }
    }


}