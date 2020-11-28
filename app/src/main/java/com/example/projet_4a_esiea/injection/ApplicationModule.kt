package com.example.projet_4a_esiea.injection

import com.example.projet_4a_esiea.MainViewModel
import org.koin.dsl.module


val presentationModule = module {
    factory { MainViewModel() }

}
