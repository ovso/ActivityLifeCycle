package io.github.ovso.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_c)
    println("OJH C onCreate()")
  }

  override fun onRestart() {
    super.onRestart()
    println("OJH C onRestart()")
  }

  override fun onStart() {
    super.onStart()
    println("OJH C onStart()")
  }

  override fun onResume() {
    super.onResume()
    println("OJH C onResume()")
  }

  override fun onPause() {
    super.onPause()
    println("OJH C onPause()")
  }

  override fun onStop() {
    super.onStop()
    println("OJH C onStop()")
  }

  override fun onDestroy() {
    super.onDestroy()
    println("OJH C onDestroy()")
  }

}
