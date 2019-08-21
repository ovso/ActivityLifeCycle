package io.github.ovso.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_a)
    println("OJH A onCreate()")
  }

  override fun onRestart() {
    super.onRestart()
    println("OJH A onRestart()")
  }

  override fun onStart() {
    super.onStart()
    println("OJH A onStart()")
  }

  override fun onResume() {
    super.onResume()
    println("OJH A onResume()")
  }

  override fun onPause() {
    super.onPause()
    println("OJH A onPause()")
  }

  override fun onStop() {
    super.onStop()
    println("OJH A onStop()")
  }

  override fun onDestroy() {
    super.onDestroy()
    println("OJH A onDestroy()")
  }

  fun onClickB(v: View) {
    startActivity(Intent(this, BActivity::class.java))
  }

  fun onClickC(v: View) {
    startActivity(Intent(this, CActivity::class.java))
  }
}
