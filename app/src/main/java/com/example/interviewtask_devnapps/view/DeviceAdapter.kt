package com.example.interviewtask_devnapps.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.interviewtask_devnapps.R
import com.example.interviewtask_devnapps.databinding.ListItemBinding
import com.example.interviewtask_devnapps.model.data.Devices

class DeviceAdapter(private var ctx: Context?, private var listClubs: MutableList<Devices>?) :
    RecyclerView.Adapter<DeviceAdapter.MyViewHolder>() {

    class MyViewHolder(val itemBinding: ListItemBinding) : RecyclerView.ViewHolder(itemBinding.root){

        private var binding : ListItemBinding? = null

        init {
            this.binding = itemBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(ctx)
        val binding: ListItemBinding = DataBindingUtil.inflate(inflater, R.layout.list_item,parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        listClubs?.let {
            return it.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemBinding.device = listClubs?.get(position)
    }

}