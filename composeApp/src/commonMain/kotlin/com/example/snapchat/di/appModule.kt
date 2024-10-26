package com.example.snapchat.di

// In a commonMain file
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    single { MyService() }
    single { MyRepository() }

}

class MyService
class MyRepository

