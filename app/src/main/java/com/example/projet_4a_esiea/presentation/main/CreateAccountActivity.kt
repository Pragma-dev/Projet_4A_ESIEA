package com.example.projet_4a_esiea.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projet_4a_esiea.R
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class CreateAccountActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        //actionbar
        val actionbar = supportActionBar
        actionbar!!.title = "Create account"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        create_account.setOnClickListener {
            mainViewModel.onClickedCreateAccount(email_edit.text.toString().trim(), create_password_edit.text.toString(), create_confirm_password_edit.text.toString())
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}