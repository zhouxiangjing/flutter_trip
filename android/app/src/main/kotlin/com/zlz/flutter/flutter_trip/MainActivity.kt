package com.zlz.flutter.flutter_trip

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.NonNull
import com.example.plugin.asr.AsrPlugin
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.SplashScreen
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant

import android.os.Build
import android.view.ViewTreeObserver
import android.view.WindowManager
class MainActivity: FlutterActivity() {

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        var shimPluginRegistry = ShimPluginRegistry(flutterEngine)
        AsrPlugin.registerWith(shimPluginRegistry.registrarFor("com.example.plugin.asr.AsrPlugin"))
    }
}