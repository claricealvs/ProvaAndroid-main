package com.example.votacao

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CandidatoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewCandidatos)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val candidatos = listOf("Candidato 1", "Candidato 2", "Candidato 3", "Candidato 4",
            "Candidato 5", "Candidato 6", "Candidato 7", "Candidato 8", "Candidato 9",
            "Candidato 10")

        adapter = CandidatoAdapter(candidatos) { candidatoSelecionado ->
            val intent = Intent(this, DadosEleitorActivity::class.java)
            intent.putExtra("candidato", candidatoSelecionado)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}
