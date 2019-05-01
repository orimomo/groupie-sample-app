package com.example.groupie_sample_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val groupAdapter = GroupAdapter<ViewHolder>()
        findViewById<RecyclerView>(R.id.recycler_view).adapter = groupAdapter

        val items = listOf("りんご", "みかん", "ぶどう")
        items.forEach { item ->
            groupAdapter.add(ListItem(item))
        }
    }
}
