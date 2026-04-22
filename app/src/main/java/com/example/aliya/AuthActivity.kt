package com.example.aliya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.aliya.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Kode ini harus selalu dipanggil saat butuh akses "user_pref"
        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

        //Kondisi jika isLogin bernilai true
//        val isLogin = sharedPref.getBoolean("isLogin", false)
//        if (isLogin) {
//            //Panggil Intent untuk ke MainActivity
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            if (username.isNotEmpty() && username == password) {
                val editor = sharedPref.edit()
                editor.putBoolean("isLogin", true)
                editor.putString("username",username)
                editor.apply()

                // Menggunakan Toast agar muncul notifikasi tanpa harus menekan tombol OK/Lanjut
                Toast.makeText(this, "Login Berhasil! Selamat datang $username", Toast.LENGTH_SHORT).show()
                
                // Langsung berpindah ke MainActivity (Dashboard)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Alert Gagal tetap menggunakan AlertDialog agar user menyadari kesalahan
                AlertDialog.Builder(this)
                    .setTitle("Login Gagal")
                    .setMessage("Username atau Password salah. Silahkan coba lagi.")
                    .setPositiveButton("Tutup", null)
                    .show()
            }
        }
    }
}