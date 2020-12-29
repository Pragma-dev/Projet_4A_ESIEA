package com.example.projet_4a_esiea.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projet_4a_esiea.R
import com.example.projet_4a_esiea.data.local.models.Joke
import kotlinx.android.synthetic.main.activity_api_call.*

class ApiCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_call)

        val List = generateDummyList(500)
        recycler_view.adapter = ListAdapter(List)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<Joke> {
        val list = ArrayList<Joke>()
        for (i in 0 until size) {
            val item = Joke("test","test",2, "test" ,"r","tt","f")
            list += item
        }
        return list
    }
}