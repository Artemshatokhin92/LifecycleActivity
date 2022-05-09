package com.shatokhin.lifecycleactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    companion object{
        const val NAME_ACTIVITY = "(1) MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val bundle = if (savedInstanceState == null) "null" else "Bundle"
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onCreate($bundle)")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoToSecondActivity: Button = findViewById(R.id.btnGoToSecondActivity)
        btnGoToSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onRestart()")
        super.onRestart()
    }

    override fun onStart() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onStart()")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onRestoreInstanceState(Bundle)")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onResume()")
        super.onResume()
    }
//====================================================================================
    override fun onPause() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onStop()")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onSaveInstanceState()")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        Log.d(TAG_FOR_LOGCAT, "$NAME_ACTIVITY - onDestroy()")
        super.onDestroy()
    }
}