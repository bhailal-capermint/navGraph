package com.example.navgraphproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val settingIntent = Intent(Settings.ACTION_SETTINGS)
//        settingIntentResult.launch(settingIntent)
//    }
//
//    private val settingIntentResult =
//        registerForActivityResult(
//            ActivityResultContracts.StartActivityForResult(),
//        ) {
//            if (it.resultCode == Activity.RESULT_OK) {
//
//            }
        }
}