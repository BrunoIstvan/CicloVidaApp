package br.com.bicmsystems.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarViewModel: ViewModel() {

    val placarCasa = MutableLiveData<Int>()
    val placarVisitante = MutableLiveData<Int>()

    init {
        placarCasa.value = 0
        placarVisitante.value = 0
    }

    fun pontoCasa(pontos: Int) {
        placarCasa.value = placarCasa.value?.plus(pontos)
    }

    fun pontoVisitante(pontos: Int) {
        placarVisitante.value = placarVisitante.value?.plus(pontos)
    }

    fun reiniciar() {
        placarVisitante.value = 0
        placarCasa.value = 0
    }

}