package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.gridview.adapters.CarAdapters
import com.example.gridview.model.CarItem

class MainActivity : AppCompatActivity() , AdapterView.OnItemClickListener{

    private var arrayList:ArrayList<CarItem> ? = null
    private var gridView:GridView ? = null
    private var carAdapters:CarAdapters ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById(R.id.grid_view_list)
        arrayList = ArrayList()
        arrayList = setValues()
        carAdapters = CarAdapters(applicationContext, arrayList!!)
        gridView?.adapter = carAdapters
        gridView?.onItemClickListener = this
    }

    private fun setValues() : ArrayList<CarItem>{
        var arrayList:ArrayList<CarItem> = ArrayList()

        arrayList.add(CarItem(R.drawable.downloa, "Picture1"))
        arrayList.add(CarItem(R.drawable.h1, "Picture2"))
        arrayList.add(CarItem(R.drawable.h2, "Picture3"))
        arrayList.add(CarItem(R.drawable.h3, "Picture4"))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:CarItem = arrayList!!.get(position)
        Toast.makeText(applicationContext , items.name , Toast.LENGTH_LONG).show()
    }
}
