package com.szs.recyckerviewclasswork.CrushAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.szs.recyckerviewclasswork.R
import com.szs.recyckerviewclasswork.model.FindCrush

class CrushViewHolder(crushView: View) : RecyclerView.ViewHolder(crushView){
    var name = crushView.findViewById<TextView>(R.id.txt_name)
    var hour = crushView.findViewById<TextView>(R.id.txt_hour)
    var reactCount = crushView.findViewById<TextView>(R.id.txt_reactCount)
    var commentCount = crushView.findViewById<TextView>(R.id.msg_count)
    var shareCount = crushView.findViewById<TextView>(R.id.share_count)
    var profilePhoto = crushView.findViewById<ImageView>(R.id.image_profile)
    var photo = crushView.findViewById<ImageView>(R.id.image_photo)
}

class CrushAdapter(var crushDatatArray: ArrayList<FindCrush>): RecyclerView.Adapter<CrushViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrushViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.crush_data, parent, false)
        return CrushViewHolder(view)
    }

    override fun getItemCount(): Int {
        return crushDatatArray.size
    }

    override fun onBindViewHolder(holder: CrushViewHolder, position: Int) {
        holder.name.text = crushDatatArray[position].name
        holder.reactCount.text =crushDatatArray[position].reactNo.toInt().toString()
        holder.shareCount.text = crushDatatArray[position].share.toInt().toString()
        holder.commentCount.text = crushDatatArray[position].commentCount.toInt().toString()
        holder.hour.text = crushDatatArray[position].hour.toInt().toString()
        holder.profilePhoto.setImageResource(crushDatatArray[position].profilePhoto)
        holder.photo.setImageResource(crushDatatArray[position].photo)
    }

}