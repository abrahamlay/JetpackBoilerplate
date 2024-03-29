package com.abrahamlay.jetpackboilerplate.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.NavHostFragment

/**
 * Created by Abraham Lay on 2019-08-10.
 */

abstract class BaseActivity<VM : ViewModel> : AppCompatActivity() {
    abstract val resourceLayout: Int?
    abstract val viewModel: VM

    protected val navController by lazy {
        onCreateNavController()?.let(NavHostFragment::findNavController)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resourceLayout?.let(this::setContentView)
        onInitViews()
        onInitObservers()
    }

    override fun onSupportNavigateUp() = navController?.navigateUp() ?: super.onSupportNavigateUp()

    protected open fun onCreateNavController(): NavHostFragment? = null

    protected open fun onInitViews() = Unit

    protected open fun onInitObservers() = Unit
}