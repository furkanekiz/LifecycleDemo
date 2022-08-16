package com.furkanekiz.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.furkanekiz.lifecycledemo.ui.main.FRMain
import kotlinx.android.synthetic.main.ac_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ACMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FRMain.newInstance())
                .commitNow()
        }

        lifecycleScope.launch(Dispatchers.IO) {
            /*delay(5000)
            progressBar.visibility = View.VISIBLE
            delay(10000)
            progressBar.visibility = View.GONE*/
            Log.i("MyTag","thread is : ${Thread.currentThread().name}")
        }
    }
}