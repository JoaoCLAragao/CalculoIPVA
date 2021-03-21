package br.com.cotemig.calculoipva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_i_p_v_a.*

class ResultadoIPVA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_i_p_v_a)
        var ipva = intent.getDoubleExtra("ipva", 0.0)

        txt_v_IPVA_Valor.text = ipva.toString()

        btn_voltar.setOnClickListener {
            voltaMainActivity()
        }
    }

    fun voltaMainActivity(){
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}