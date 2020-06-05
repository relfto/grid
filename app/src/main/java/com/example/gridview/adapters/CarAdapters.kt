package com.example.gridview.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.R
import com.example.gridview.model.CarItem

class CarAdapters(var context:Context,var arrayList: ArrayList<CarItem>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
         var view:View = View.inflate(context, R.layout.card_view_item_grid, null)
         var icons:ImageView = view.findViewById(R.id.icons)
         var names:TextView=view.findViewById(R.id.names_text_view)
         var listItem:CarItem = arrayList.get(position)

         icons.setImageResource(listItem.icons !!)
         names.text=listItem.name
        return  view
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

}