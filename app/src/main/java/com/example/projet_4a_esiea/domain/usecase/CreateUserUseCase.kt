package com.example.projet_4a_esiea.domain.usecase

import com.example.projet_4a_esiea.data.repository.UserRepository
import com.example.projet_4a_esiea.domain.entity.User

class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user : User){
        userRepository.createUser(user)
    }
}