package br.com.cotemig.calculoipva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_calularIPVA.setOnClickListener {
            calularIPVA()
        }



    }

    fun calularIPVA(){
        var valorVeiculo = e_txt_valor.toString().toDouble()
        var tipoVeiculo = e_txt_tipo.toString().toInt()
        var ipva : Double
        var aliquota = 0.0

        if (tipoVeiculo == 1){
            aliquota = 0.015
        }
        else if (tipoVeiculo == 2){
            aliquota = 0.02
        }
        else if (tipoVeiculo == 3){
            aliquota = 0.02
        }
        else if (tipoVeiculo == 4){
            aliquota = 0.02
        }
        else if (tipoVeiculo == 5){
            aliquota = 0.03
        }
        else if (tipoVeiculo == 6){
            aliquota = 0.04
        }
        ipva = valorVeiculo * aliquota

        var intent = Intent(this, ResultadoIPVA::class.java)
        intent.putExtra("ipva", ipva)
        startActivity(intent)
        finish()
        

    }
}