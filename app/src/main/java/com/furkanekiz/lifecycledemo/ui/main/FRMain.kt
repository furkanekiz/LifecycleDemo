package com.furkanekiz.lifecycledemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.furkanekiz.lifecycledemo.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FRMain : Fragment() {

    companion object {
        fun newInstance() = FRMain()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fr_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        // TODO: Use the ViewModel
        lifecycleScope.launch(Dispatchers.IO) {
            Log.i("MyTag","thread is : ${Thread.currentThread().name}")
        }

        lifecycleScope.launchWhenCreated {  }

        lifecycleScope.launchWhenStarted {  }

        lifecycleScope.launchWhenResumed {  }
    }

}