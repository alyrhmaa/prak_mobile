package com.example.aliya.pertemuan_10

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.aliya.Home.Pertemuan_13.TabCaptureFragment
import com.example.aliya.Home.Pertemuan_13.TabQrcodeFragment
import com.example.aliya.Home.Pertemuan_13.TabScanFragment

class ThirteenthTabsAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    // Jumlah total tab yang ada
    override fun getItemCount(): Int = 3

    // Menentukan Fragment mana yang akan ditampilkan berdasarkan posisi tab
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabCaptureFragment()
            1 -> TabQrcodeFragment()
            2 -> TabScanFragment()
            else -> throw IllegalStateException("Posisi tidak valid")
        }
    }
}