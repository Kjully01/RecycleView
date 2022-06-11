package br.com.recycleview.controller.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.recycleview.databinding.LayoutRecycleViewBinding
import coil.load

class ImagesAdapter: RecyclerView.Adapter<ImagesAdapter.ViewHolderImages>() {

    private var imageList : MutableList<Triple<String, String, String>> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderImages {
        val itemBinding = LayoutRecycleViewBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolderImages(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolderImages, position: Int) {
        holder.onBind(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(imageListAux: List<Triple<String, String, String>>){
        imageList.clear()
        imageList.addAll(imageListAux)
        notifyDataSetChanged()
    }

    class ViewHolderImages(val layout : LayoutRecycleViewBinding) : RecyclerView.ViewHolder(layout.root){
        fun onBind(imageInfo: Triple<String, String, String>){
            layout.photo.photoItem.load(imageInfo.first)
            layout.tvName.text = imageInfo.second
            layout.tvTell.text = imageInfo.third
        }
    }
}