package com.ahmetbostanciklioglu.recyclerviewimplementationinkotlinwithxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmetbostanciklioglu.recyclerviewimplementationinkotlinwithxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindingRecyclerView()
        val data = ItemData.getItemData()
        val dataAdapter = DataAdapter(data)
        binding.recyclerView.adapter = dataAdapter

//        dataAdapter.setOnClickListener(object : DataAdapter.OnClickListener{
//            override fun onClick(position: Int, model: item) {
//                when (position) {
//                    0 -> {
//                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
//                        startActivity(intent)
//                    }
//
//
//                }
//            }
//        })
    }

    private fun bindingRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
    }
}