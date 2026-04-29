package com.example.aliya.Home.pertemuan_5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aliya.R
import com.google.android.material.appbar.MaterialToolbar

class FifthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        // 🔥 WAJIB: set toolbar jadi ActionBar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        
        // Aktifkan tombol back
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        // Button WebView
        val btn = findViewById<Button>(R.id.btnWeb)

        btn.setOnClickListener {
            Toast.makeText(this, "Membuka WebView...", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, WebViewActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                return true
            }

            R.id.menu_about -> {
                Toast.makeText(this, "Ini halaman About", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_dark -> {
                item.isChecked = !item.isChecked
                Toast.makeText(this, "Dark Mode: ${item.isChecked}", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_notif -> {
                item.isChecked = !item.isChecked
                Toast.makeText(this, "Notifikasi: ${item.isChecked}", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}