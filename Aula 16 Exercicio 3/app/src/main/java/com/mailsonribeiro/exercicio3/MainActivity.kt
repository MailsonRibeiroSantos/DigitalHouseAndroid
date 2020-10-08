package com.mailsonribeiro.exercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConverter.setOnClickListener{
            if(edtTemperaturaC.text.toString() != ""){
                try {
                    var temperaturaF = ((edtTemperaturaC.text.toString().toDouble() * 9) / 5) + 32
                    txtTemperaturaF.text = temperaturaF.toString() + "°F"
                }catch (ex: Exception){

                }
            }
        }
    }
}