package com.vima.myspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vima.spinner.views.NiceSpinner

class MainActivity : AppCompatActivity() {


    private lateinit var spinner: NiceSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
