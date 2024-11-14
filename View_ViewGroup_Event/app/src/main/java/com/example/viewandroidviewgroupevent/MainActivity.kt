package com.example.viewandroidviewgroupevent

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewandroidviewgroupevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customLayout = CustomLayout(this)
        addContentView(customLayout, LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT))

        val customView = CustomView(this).apply {
            text = "Hello, Ready Story!"
        }
        customLayout.addView(customView)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.d("phael", "MainActivity in called dispatchTouchEvent()")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("phael", "MainActivity in called onTouchEvent()")
        return super.onTouchEvent(event)
    }
}