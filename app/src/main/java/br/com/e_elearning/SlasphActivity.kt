package br.com.e_elearning

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import br.com.e_elearning.databinding.ActivitySplashBinding

class SlasphActivity : AppCompatActivity() {
    lateinit var handler: Handler
    private val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SlasphActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}