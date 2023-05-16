package com.example.gasstop


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class CarsAdapter(var context: Context, var data:ArrayList<Gasupload>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtName:TextView
        var mTxtPrice:TextView
        var mImage:ImageView
        init {
            this.mTxtName = row?.findViewById(R.id.mTvName) as TextView
            this.mTxtPrice = row?.findViewById(R.id.mTvPrice) as TextView
            this.mImage = row?.findViewById(R.id.mImgPic) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Gasupload = getItem(position) as Gasupload
        viewHolder.mTxtName.text = item.brand
        viewHolder.mTxtPrice.text = item.price
        Glide.with(context).load(item.image).into(viewHolder.mImage)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}