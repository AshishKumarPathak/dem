package com.example.scientificcalci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.content.Intent
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView



class SplashScreen : AppCompatActivity() {

    lateinit var adView : AdView
    lateinit var adView1 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        adView = findViewById<View>(R.id.adView) as AdView
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        adView1 = findViewById<View>(R.id.adView1) as AdView
        val adRequest1 = AdRequest.Builder().build()
        adView1.loadAd(adRequest1)



        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        //Normal Handler is deprecated , so we have to change the code little bit

        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)






        }
    }













