package com.example.projet_4a_esiea.presentation.main

sealed class LoginStatusSealed

data class LoginSuccess(val email: String) : LoginStatusSealed()
object LoginError : LoginStatusSealed()