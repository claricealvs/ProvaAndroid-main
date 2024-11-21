package com.example.votacao

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacao)

        val candidato = intent.getStringExtra("candidato")
        val nome = intent.getStringExtra("nome")
        val titulo = intent.getStringExtra("titulo")
        val zona = intent.getStringExtra("zona")
        val secao = intent.getStringExtra("secao")
        val cidade = intent.getStringExtra("cidade")
        val estado = intent.getStringExtra("estado")

        val dados = """
            Candidato: $candidato
            Nome: $nome
            Título de Eleitor: $titulo
            Zona: $zona
            Seção: $secao
            Cidade: $cidade
            Estado: $estado
        """.trimIndent()

        findViewById<TextView>(R.id.dadosConfirmacao).text = dados
    }
}
