package com.example.setupprotobuf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.model.Post

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val post = Post.newBuilder().apply {
      this.id = 1
      this.name = "Shinchan"
      this.email = "welcomebackhome@nohara.com"
    }.build()

    Log.e("#",post.name)

  }
}