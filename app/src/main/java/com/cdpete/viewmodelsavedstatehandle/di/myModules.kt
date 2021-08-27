package com.cdpete.viewmodelsavedstatehandle.di

import com.cdpete.viewmodelsavedstatehandle.MainActivity
import com.cdpete.viewmodelsavedstatehandle.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object myModules {
    val injectModules = module {
        viewModel { MainViewModel(get()) }
    }
}