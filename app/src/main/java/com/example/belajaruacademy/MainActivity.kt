package com.example.belajaruacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var EtInput: EditText
    private lateinit var BtnTombol: Button
    private lateinit var TvSay: TextView

    private fun initComponent(){
        EtInput = findViewById(R.id.et_nama)
        BtnTombol = findViewById(R.id.btn_sayHello)
        TvSay  = findViewById(R.id.tv_sayHello)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponent()

        TvSay.text = resources.getString(R.string.app_name)

        BtnTombol.setOnClickListener {

            Log.d("MYP", "ini log debug")
            Log.i("MYP", "ini log info")
            Log.w("MYP", "ini log warning")
            Log.e("MYP", "ini log error")

            Log.i("ValueResource",resources.getInteger(R.integer.maxPage).toString())
            Log.i("ValueResource",resources.getBoolean(R.bool.isProductionMode).toString())
            Log.i("ValueResource",resources.getIntArray(R.array.numbers).joinToString(","))
            Log.i("ValueResource",resources.getColor(R.color.background, theme).toString())

            BtnTombol.setBackgroundColor(resources.getColor(R.color.background, theme))

           val name =  EtInput.text.toString()
            TvSay.text = resources.getString(R.string.sayHelloTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("MYP", it)
            }
        }
        }
    }