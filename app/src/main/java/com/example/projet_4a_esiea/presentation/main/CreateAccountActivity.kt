package com.example.projet_4a_esiea.presentation.main

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_4a_esiea.R
import kotlinx.android.synthetic.main.activity_create_account.*
import org.koin.android.ext.android.inject


class CreateAccountActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()

    fun isValidEmail(target: CharSequence?): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        //actionbar
        val actionbar = supportActionBar
        actionbar!!.title = "Create account"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        create_account.setOnClickListener {
            var verify = 0

            if(email_edit.text.toString() == "") {
                create_email_input_layout.error = "Please enter an email"
                verify = 1
            }else{
                if(isValidEmail(email_edit.text.toString()) == false){
                    create_email_input_layout.error = "Please enter a valid email format"
                    verify = 1
                }else{
                    create_email_input_layout.error = null
                }
            }
            if(create_password_edit.text.toString() == "") {
                create_password_input_layout.error = "Please enter a password"
                verify = 1
            }else{
                create_password_input_layout.error = null
            }
            if(create_confirm_password_edit.text.toString() == "") {
                confirm_password_input_layout.error = "Please confirm your password"
                verify = 1
            }else{
                confirm_password_input_layout.error = null
            }

            if(create_password_edit.text.toString() != create_confirm_password_edit.text.toString()){
                confirm_password_input_layout.error = "The password is different"
                verify = 1
            }else if((create_password_edit.text.toString() != create_confirm_password_edit.text.toString()) && (create_confirm_password_edit.text.toString() != "") ){
                confirm_password_input_layout.error = null
            }
            if(verify == 0){
                mainViewModel.onClickedCreateAccount(email_edit.text.toString().trim(), create_password_edit.text.toString(), create_confirm_password_edit.text.toString())
                val intent = Intent(this, MainActivity::class.java)
                this.startActivity(intent)
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}