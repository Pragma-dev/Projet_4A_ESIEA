package com.example.projet_4a_esiea.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.example.projet_4a_esiea.R
import com.example.projet_4a_esiea.data.local.models.Joke
import com.example.projet_4a_esiea.data.local.models.RestJokeResponse
import kotlinx.android.synthetic.main.activity_api_call.*

class ApiCallActivity : AppCompatActivity() {


    private val dataList: MutableList<Joke> = mutableListOf()
    private lateinit var myAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_call)
        val actionbar = supportActionBar
        actionbar!!.title = "Jokapp"

        actionbar.setDisplayHomeAsUpEnabled(true)

        //setup adapter

        myAdapter = ListAdapter(dataList)

        //recycler view

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.addItemDecoration(DividerItemDecoration(this,OrientationHelper.VERTICAL))
        recycler_view.adapter = myAdapter

        AndroidNetworking.initialize(this)

        AndroidNetworking.get("https://v2.jokeapi.dev/joke/Any?amount=10")
            .build()
            .getAsObject(RestJokeResponse::class.java, object : ParsedRequestListener<RestJokeResponse>{
                override fun onResponse(response: RestJokeResponse) {
                    dataList.addAll(response.jokes)
                    myAdapter.notifyDataSetChanged()

                }

                override fun onError(anError: ANError?) {
                }
            })

        randomJokes.setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}