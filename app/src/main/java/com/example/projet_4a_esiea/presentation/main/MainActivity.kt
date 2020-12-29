package com.example.projet_4a_esiea.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.projet_4a_esiea.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.email_input_layout
import kotlinx.android.synthetic.main.activity_main.new_create_account
import kotlinx.android.synthetic.main.activity_main.login_edit
import kotlinx.android.synthetic.main.activity_main.password_edit
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {


    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                    val intent = Intent(this, ApiCallActivity::class.java)
                    this.startActivity(intent)

                    /*MaterialAlertDialogBuilder(this)
                        .setTitle("CONNECTED")
                        .setMessage("GGGGGGG")
                        .setPositiveButton("Ok"){ dialog, which ->
                            dialog.dismiss()
                        }
                        .show()*/
                }
                LoginError -> {
                    email_input_layout.error = " "
                    password_input_layout.error = "Email or password is wrong, please try again or create an account"
                    password_edit.text?.clear()
                }
            }
        })
        new_create_account.setOnClickListener{
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString())
        }

        create_account_button.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            this.startActivity(intent)
        }
    }
}