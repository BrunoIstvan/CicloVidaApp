package br.com.bicmsystems.ciclodevida

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders
                        .of(this)
                        .get(MainViewModel::class.java)

        atualizaPlacarCasa()
        atualizaPlacarVisitante()

        btCasa.setOnClickListener {
            mainViewModel.placarCasa++
            atualizaPlacarCasa()
        }

        btVisitante.setOnClickListener {
            mainViewModel.placarVisitante++
            atualizaPlacarVisitante()
        }

    }

    private fun atualizaPlacarCasa() {
        tvCasa.text = mainViewModel.placarCasa.toString()
    }

    private fun atualizaPlacarVisitante() {
        tvVisitante.text = mainViewModel.placarVisitante.toString()
    }

}
