package com.example.projet_4a_esiea.injection

import android.content.Context
import androidx.room.Room
import com.example.projet_4a_esiea.data.local.AppDatabase
import com.example.projet_4a_esiea.data.local.DatabaseDao
import com.example.projet_4a_esiea.data.repository.UserRepository
import com.example.projet_4a_esiea.domain.usecase.CreateUserUseCase
import com.example.projet_4a_esiea.domain.usecase.GetUserUseCase
import com.example.projet_4a_esiea.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module
import java.security.AccessControlContext


val presentationModule = module {
    factory { MainViewModel(get (), get ()) }

}

val domainModule : Module = module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }

}

val dataModule : Module = module {
    single { UserRepository(get()) }
    single{ createDataBase(androidContext()) }
    }

fun createDataBase(context: Context): DatabaseDao {
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}
