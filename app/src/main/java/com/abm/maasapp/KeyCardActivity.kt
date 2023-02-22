package com.abm.maasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class KeyCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key_card)

        val fragment = MenuFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.menu, fragment, "miTagDeFragment")
            .commit()
    }
}