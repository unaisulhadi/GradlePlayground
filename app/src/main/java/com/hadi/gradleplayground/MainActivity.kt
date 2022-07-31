package com.hadi.gradleplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initialize()
    }

    private fun initialize() {

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val tv4 = findViewById<TextView>(R.id.tv4)
        val tv5 = findViewById<TextView>(R.id.tv5)
        val tv6 = findViewById<TextView>(R.id.tv6)

        // Getting gradle res values
        tv1.text = getString(R.string.my_app_name)

        // Get BuildConfig values from gradle
        tv2.text = BuildConfig.IS_PRODUCTION.toString()
        tv3.text = BuildConfig.BASE_URL

        // Read API keys from credentials.properties
        tv4.text = BuildConfig.PROPERTIES_API_KEY

        // Read API keys from credentials.properties
        tv5.text = BuildConfig.ANOTHER_API_KEY


    }


}