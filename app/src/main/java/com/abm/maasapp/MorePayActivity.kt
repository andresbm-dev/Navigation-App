package com.abm.maasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MorePayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_pay)

        val fragment = MenuFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.menu, fragment, "miTagDeFragment")
            .commit()
    }
}