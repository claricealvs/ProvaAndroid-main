package com.example.votacao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CandidatoAdapter(
    private val candidatos: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<CandidatoAdapter.CandidatoViewHolder>() {

    class CandidatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeCandidato: TextView = itemView.findViewById(R.id.nomeCandidato)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidatoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_candidato, parent, false)
        return CandidatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CandidatoViewHolder, position: Int) {
        val candidato = candidatos[position]
        holder.nomeCandidato.text = candidato

        holder.itemView.setOnClickListener {
            onClick(candidato)
        }
    }

    override fun getItemCount(): Int = candidatos.size
}