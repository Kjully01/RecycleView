package br.com.recycleview.controller.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.recycleview.databinding.LayoutRecycleViewPrimaryBinding
import coil.load

class ImagesAdapter: RecyclerView.Adapter<ImagesAdapter.ViewHolderImages>() {

    private var imageList : MutableList<Pair<String, String>> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderImages {
        val itemBinding = LayoutRecycleViewPrimaryBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolderImages(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolderImages, position: Int) {
        holder.onBind(imageList[position])
    }

    override fun getItemCount(): Int = imageList.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(imageListAux: List<Pair<String, String>>){
        imageList.clear()
        imageList.addAll(imageListAux)
        notifyDataSetChanged()
    }

    class ViewHolderImages(val layout : LayoutRecycleViewPrimaryBinding) : RecyclerView.ViewHolder(layout.root){
        fun onBind(imageInfo: Pair<String, String>){
            layout.tvPrimary.text = imageInfo.first
            layout.ivPrimary.load(imageInfo.second)

        }
    }
}