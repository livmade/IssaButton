package com.example.issabutton

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class MainActivity() : AppCompatActivity() {
    var x = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click = findViewById(R.id.UpBtn) as Button
        var numSpace = findViewById(R.id.numText) as EditText


        btn_click.setOnClickListener{
            var upCount = x++
            numSpace.setText(upCount.toString())
        }
    }
}

