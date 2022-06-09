package br.com.recycleview.controller.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.recycleview.controller.adapter.ImagesAdapter
import br.com.recycleview.controller.adapter.ImagesSecondAdapter
import br.com.recycleview.databinding.FragmentHomeBinding
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapterRecycleView: ImagesAdapter
    private lateinit var adapterSecondRecycleView: ImagesSecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startAdapter()
        setDataAdapter()
    }

    private fun startAdapter() {
        binding.rvPrimary.apply {
            adapterRecycleView = ImagesAdapter()
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRecycleView
        }

        binding.rvSecond.apply {
            adapterSecondRecycleView = ImagesSecondAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = adapterSecondRecycleView
        }
    }

    private fun setDataAdapter() {
        adapterRecycleView.setData(listUrls())
        adapterSecondRecycleView.setData(listUrls())
    }

    private fun listUrls(): List<Pair<String, String>> = listOf(
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        )

    )

    private fun rand(from: Int, to: Int): Int{
        val random = Random()
        return random.nextInt(to - from) + from
    }

}