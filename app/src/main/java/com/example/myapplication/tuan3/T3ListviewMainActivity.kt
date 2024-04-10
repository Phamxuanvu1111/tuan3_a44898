package com.example.myapplication.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? =null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_listview_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        var lv=findViewById<ListView>(R.id.t3Listview)
        ls.add(T3Contact("Nguyen Van A","20", R.drawable.anh10))
        ls.add(T3Contact("Nguyen Van B","20", R.drawable.anh11))
        ls.add(T3Contact("Nguyen Van B","20", R.drawable.anh12))
        adapter= T3Adapter(ls, this)
        lv!!.adapter=adapter
    }
}