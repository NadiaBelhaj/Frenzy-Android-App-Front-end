package com.nadia.frenzy.ui.adapter

import android.content.Context
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.NonNull
import com.nadia.frenzy.R
import com.nadia.frenzy.data.Theme
import de.hdodenhof.circleimageview.CircleImageView

class ColorGridAdapter(@NonNull context: Context, themeList: List<Theme>) :
    ArrayAdapter<Theme>(context, 0, themeList) {

    @NonNull
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if(view == null){
            
        }
        
        val theme = getItem(position)
        colorCircleView.setImageResource(theme!!.colorValue)
        return view
    }
}