package com.example.projet_4a_esiea.presentation.main

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projet_4a_esiea.domain.entity.User
import com.example.projet_4a_esiea.domain.usecase.CreateUserUseCase
import com.example.projet_4a_esiea.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val createUserUseCase : CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
) : ViewModel(){

    val loginLiveData : MutableLiveData<LoginStatusSealed> = MutableLiveData()

    fun onClickedLogin(emailUser: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val user = getUserUseCase.invoke(emailUser,password)
            val loginStatusSealed = if ( user != null){
                LoginSuccess(user.email, user.password)
            }else{
                LoginError
            }

            withContext(Dispatchers.Main){
                loginLiveData.value = loginStatusSealed
            }
        }
    }

    fun onClickedCreateAccount(
        email: String,
        password: String,
        confirm_password: String
    ) {
       viewModelScope.launch(Dispatchers.IO) {
            createUserUseCase.invoke(User(email,password))
            Log.d("DEBUG", email);
            Log.d("DEBUG", password);

        }
    }
}