package com.tuhoc.bai16_3_ryclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*


class RvAdapter(private val ds:List<Int>) :RecyclerView.Adapter<RvAdapter.itemViewHolder>(){
    class itemViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    //ctrl + i
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.itemView.apply {
            imgAnh.setImageResource(ds[position])
        }
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}