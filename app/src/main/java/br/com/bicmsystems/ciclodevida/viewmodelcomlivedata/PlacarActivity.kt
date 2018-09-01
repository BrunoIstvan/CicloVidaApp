package br.com.bicmsystems.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.bicmsystems.ciclodevida.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    var placarViewModel: PlacarViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        placarViewModel = ViewModelProviders.of(this).get(PlacarViewModel::class.java)

        placarViewModel?.placarCasa?.observe(this, Observer { tvCasa.text = it?.toString() })
        placarViewModel?.placarVisitante?.observe(this, Observer { tvVisitante.text = it?.toString() })

        bt3PontosCasa.setOnClickListener { placarViewModel?.pontoCasa(3) }
        bt2PontosCasa.setOnClickListener { placarViewModel?.pontoCasa(2) }
        bt1PontoCasa.setOnClickListener { placarViewModel?.pontoCasa(1) }

        bt3PontosVisitante.setOnClickListener { placarViewModel?.pontoVisitante(3) }
        bt2PontosVisitante.setOnClickListener { placarViewModel?.pontoVisitante(2) }
        bt1PontoVisitante.setOnClickListener { placarViewModel?.pontoVisitante(1) }

        btReiniciar.setOnClickListener { placarViewModel?.reiniciar() }
        
    }

}
