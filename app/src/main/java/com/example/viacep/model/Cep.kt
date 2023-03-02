package com.example.viacep.model

import com.google.gson.annotations.SerializedName

data class Cep(
    var cep: String,
    var logradouro: String,
    var complemento: String,
    var bairro: String,
    @SerializedName("localidade") var cidade: String,
    @SerializedName("uf")var estado: String


)
