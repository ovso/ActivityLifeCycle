package io.github.ovso.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_b)
    println("OJH B onCreate()")
  }

  override fun onRestart() {
    super.onRestart()
    println("OJH B onRestart()")
  }

  override fun onStart() {
    super.onStart()
    println("OJH B onStart()")
  }

  override fun onResume() {
    super.onResume()
    println("OJH B onResume()")
  }

  override fun onPause() {
    super.onPause()
    println("OJH B onPause()")
  }

  override fun onStop() {
    super.onStop()
    println("OJH B onStop()")
  }

  override fun onDestroy() {
    super.onDestroy()
    println("OJH B onDestroy()")
  }

}
