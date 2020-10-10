package com.mailsonribeiro.exercicio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener{
            try {
                var horas = edtHorasTrabalhadas.text.toString().toDouble()
                var valorHora = edtValorHora.text.toString().toDouble()
                var salario = horas * valorHora
                txtSalario.text = "R$ " + salario.toString()
            }catch (e :Exception){

            }
        }
    }
}