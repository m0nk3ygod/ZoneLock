package com.example.zonelock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val toLockBtn = findViewById<Button>(R.id.btn_to_lock)
        toLockBtn.setOnClickListener {
            val intent = Intent(this, LockActivity::class.java)
            startActivity(intent)
        }

        val btn = findViewById<Button>(R.id.btn_start_network_service)
        btn.setOnClickListener {
            val intent = Intent(this, NetworkMonitorService::class.java)
            startService(intent)
        }

        val btnOpenMap = findViewById<Button>(R.id.btn_open_map)
        btnOpenMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
    }
}
