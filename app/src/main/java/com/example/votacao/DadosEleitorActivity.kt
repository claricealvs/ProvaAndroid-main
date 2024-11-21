package com.example.votacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class DadosEleitorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados_eleitor)

        val candidato = intent.getStringExtra("candidato")
        val botaoEnviar = findViewById<Button>(R.id.botaoEnviar)

        botaoEnviar.setOnClickListener {
            val nome = findViewById<EditText>(R.id.nomeCompleto).text.toString()
            val titulo = findViewById<EditText>(R.id.tituloEleitor).text.toString()
            val zona = findViewById<EditText>(R.id.zona).text.toString()
            val secao = findViewById<EditText>(R.id.secao).text.toString()
            val cidade = findViewById<EditText>(R.id.cidade).text.toString()
            val estado = findViewById<Spinner>(R.id.estado).selectedItem.toString()

            val intent = Intent(this, ConfirmacaoActivity::class.java)
            intent.putExtra("candidato", candidato)
            intent.putExtra("nome", nome)
            intent.putExtra("titulo", titulo)
            intent.putExtra("zona", zona)
            intent.putExtra("secao", secao)
            intent.putExtra("cidade", cidade)
            intent.putExtra("estado", estado)
            startActivity(intent)
        }
    }
}
