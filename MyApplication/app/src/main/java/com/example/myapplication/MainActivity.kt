package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        renderableSource = RenderableSource.builder()
            .setSource(
                this,
                Uri.parse(“path/to/model.glb”),
        RenderableSource.SourceType.GLB
        )
        .setRecenterMode(RenderableSource.RecenterMode.ROOT)
            .build()
    }
}