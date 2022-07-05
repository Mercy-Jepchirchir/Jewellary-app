package dev.chirii.jewellery_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, TungareActivity::class.java))
    //setContentView(R.layout.activity_splash)
    }
}