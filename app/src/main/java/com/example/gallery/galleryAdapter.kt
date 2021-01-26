package com.example.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class galleryAdapter (private val androidGallery: List<gallery>) :RecyclerView.Adapter<galleryAdapter.galleryViewHolder>() {

    class galleryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): galleryViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.gallery_activity, parent,false)
        return galleryViewHolder(view)
    }


    override fun onBindViewHolder(holder: galleryViewHolder, position: Int) {
        val p = androidGallery[position]
        Glide.with(holder.imageview.context)

            .load(p.linki)
            .centerCrop()
            .into(holder.imageview)
    }

    override fun getItemCount(): Int = androidGallery.size


}