package com.ahmetbostanciklioglu.recyclerviewimplementationinkotlinwithxml


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetbostanciklioglu.recyclerviewimplementationinkotlinwithxml.databinding.RecylerListBinding


class DataAdapter(
    private val items: List<item>
) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    class ViewHolder(binding: RecylerListBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView = binding.itemTextView
    }

   // private var onClickListener: OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RecylerListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item.item
//        holder.textView.setOnClickListener {
//            if (onClickListener != null) {
//                onClickListener!!.onClick(position, item)
//            }
//        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

//    fun setOnClickListener(onClickListener: OnClickListener) {
//        this.onClickListener = onClickListener
//    }
//
//    interface OnClickListener {
//        fun onClick(position: Int, model: item)
//    }

}