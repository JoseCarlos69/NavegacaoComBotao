package com.example.navegacaocombotao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {
    // Declaração de variáveis para os elementos da tela
    private lateinit var redButton: Button
    private lateinit var greenButton: Button
    private lateinit var blueButton: Button
    private lateinit var randomColorButton: Button
    private lateinit var layout: RelativeLayout
    private lateinit var nextButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        setTitle("Tela 2") // Define o título da atividade como "Tela 2"

        // Inicializa as variáveis com os elementos da tela usando seus IDs
        redButton = findViewById(R.id.redButton)
        greenButton = findViewById(R.id.greenButton)
        blueButton = findViewById(R.id.blueButton)
        randomColorButton = findViewById(R.id.randomColorButton)
        layout = findViewById(R.id.layout)
        nextButton = findViewById(R.id.nextButton)
        backButton = findViewById(R.id.backButton)

        // Define ações a serem executadas quando os botões são clicados
        redButton.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.red)) // Define a cor de fundo como vermelho
        }

        greenButton.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.green)) // Define a cor de fundo como verde
        }

        blueButton.setOnClickListener {
            layout.setBackgroundColor(getColor(R.color.blue)) // Define a cor de fundo como azul
        }

        randomColorButton.setOnClickListener {
            // Gera uma cor aleatória a partir das cores definidas e define como cor de fundo
            val colors = intArrayOf(R.color.red, R.color.green, R.color.blue)
            val randomColor = colors.random()
            layout.setBackgroundColor(getColor(randomColor))
        }

        nextButton.setOnClickListener {
            // Cria uma intenção para iniciar a próxima atividade (TerceiraTela)
            val intent = Intent(this, TerceiraTela::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            // Cria uma intenção para voltar para a atividade anterior (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
