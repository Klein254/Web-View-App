package com.example.simple_web_viewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCOOP:Button
    lateinit var btnKCB:Button
    lateinit var btnABSA:Button
    lateinit var btnDTB:Button
    lateinit var btnStanbic:Button
    lateinit var btnStandard:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCOOP = findViewById(R.id.btnCooperative)
        btnKCB = findViewById(R.id.btnKCB)
        btnABSA = findViewById(R.id.btnABSA)
        btnDTB = findViewById(R.id.btnDTB)
        btnStanbic = findViewById(R.id.btnStansbic)
        btnStandard = findViewById(R.id.btnStandard)

        btnCOOP.setOnClickListener {
            val open_coop = Intent(this, Cooperative_bnk::class.java)
            startActivity(open_coop)
        }
        btnKCB.setOnClickListener {
            val openKcb = Intent(this, KCB::class.java)
            startActivity(openKcb)
        }

        btnABSA.setOnClickListener {
            val openABSA = Intent(this, ABSA::class.java)
            startActivity(openABSA)
        }
        btnDTB.setOnClickListener {
            val open_DTB = Intent(this, Diamond_Trust::class.java)
            startActivity(open_DTB)
        }
        btnStanbic.setOnClickListener {
            val open_stanbic = Intent(this, Stanbic::class.java)
            startActivity(open_stanbic)
        }
        btnStandard.setOnClickListener {
            val open_standard = Intent(this, Standard_Chartered::class.java)
            startActivity(open_standard)
        }


    }
}