package com.digitalhouse.fakeloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        btnLoginCreateAccount.setOnClickListener {
            finish()
        }
        checkedAgree.setOnCheckedChangeListener{_, isChecked ->
            btnSignUpCreateAccount.isEnabled = isChecked
        }
        btnSignUpCreateAccount.setOnClickListener {
            if(edtNameCreateAccount.text.toString() =="") {
                edtNameCreateAccount.error = "Campo Vazio"
            }

            if(edtEmailCreateAccount.text.toString() =="") {
                edtEmailCreateAccount.error = "Campo Vazio"
            }

            if(edtPasswordCreateAccount.text.toString() =="") {
                edtPasswordCreateAccount.error = "Campo Vazio"
            }
            try {
                UserService.register(edtNameCreateAccount.text.toString(), edtEmailCreateAccount.text.toString(), edtPasswordCreateAccount.text.toString())
                Toast.makeText(this,"Cadastro realizado com Sucesso!!",Toast.LENGTH_LONG).show()
                finish()
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_SHORT).show()
            }
        }
    }
}