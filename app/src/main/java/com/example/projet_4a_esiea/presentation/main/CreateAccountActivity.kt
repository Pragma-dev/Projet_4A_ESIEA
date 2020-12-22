package com.example.projet_4a_esiea.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projet_4a_esiea.R

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        //actionbar
        val actionbar = supportActionBar
        actionbar!!.title = "Create account"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}