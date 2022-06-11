package br.com.recycleview.controller.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.recycleview.controller.adapter.ImagesAdapter
import br.com.recycleview.databinding.FragmentHomeBinding
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapterRecycleView: ImagesAdapter

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
    }

    private fun setDataAdapter() {
        adapterRecycleView.setData(listUrls())
    }

    private fun listUrls(): List<Triple<String, String, String>> = listOf(
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Maria",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "João",
            "(31)94665-1234"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Pedro",
            "(31)1234-5485"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Karen",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Miguel",
            "(33)3465-5647"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Davi",
            "(33)2658-2341"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Bernado",
            "(31)3215-4631"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Sarah",
            "(31)4230-1232"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Laura",
            "(31)2035-0331"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Maria Clara",
            "(33)1520-8654"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Aurora",
            "(31)9584-6345",
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Sofia",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Mateus",
            "(33)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Thiago",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Géssica",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Túlio",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Brenda",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Gabriel",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Thaís",
            "(31)9584-6345"
        ),
        Triple(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "Bia",
            "(31)9584-6345"
        )

    )

    private fun rand(from: Int, to: Int): Int{
        val random = Random()
        return random.nextInt(to - from) + from
    }

}