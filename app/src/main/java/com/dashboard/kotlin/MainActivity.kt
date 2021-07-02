package com.dashboard.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.dashboard.kotlin.suihelper.suihelper
import kotlinx.android.synthetic.main.toolbar.*
import rikka.shizuku.Shizuku
import rikka.sui.Sui
import java.io.DataInputStream
import java.io.DataOutputStream


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //sui
        suihelper().init(packageName)

    }
}