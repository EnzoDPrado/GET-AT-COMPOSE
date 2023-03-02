package com.example.viacep.service

import com.example.viacep.model.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CepRetrofitService {



    //https://viacep.com.br/ws/06130090/json/
    @GET("{cep}/json/")

    fun getCep(@Path("cep") cep:String): Call<Cep>

    //https://viacep.com.br/ws/SP/Jandira/Silva/json/
    @GET("{uf}/{cidade}/{logradouro}/json")
    fun getCeps(
        @Path("uf")uf: String,
        @Path("cidade")cidade: String,
        @Path("logradouro")logradouro:String
    ):Call<List<Cep>>


    @GET("cidade?name={nome_cidade}&estado={estado}")
    fun getTeste(
        @Query("nome_cidade")nomeCidade: String,
        @Query("uf")estado:String
    ){

    }

}