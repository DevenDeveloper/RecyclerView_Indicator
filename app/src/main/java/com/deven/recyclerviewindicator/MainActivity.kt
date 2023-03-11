package com.deven.recyclerviewindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.deven.carousellayoutmanager.CenterZoomLayoutManager
import com.deven.carouselrecyclerview.adapter.ImageAdapter
import com.deven.carouselrecyclerview.model.ModelImages
import com.deven.recyclerview_indicator.CirclePagerIndicatorDecoration
import com.deven.recyclerview_indicator.LinePagerIndicatorDecoration
import com.deven.recyclerviewindicator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onSetRecyclerView()
    }

    private fun onSetRecyclerView() {
        val images: MutableList<ModelImages> = ArrayList()
        images.add(ModelImages(1, "", "https://images.idgesg.net/images/article/2019/05/cso_best_security_software_best_ideas_best_technology_lightbulb_on_horizon_of_circuit_board_landscape_with_abstract_digital_connective_technology_atmosphere_ideas_innovation_creativity_by_peshkov_gettyimages-965785212_3x2_2400x1600-100797318-large.jpg?auto=webp&quality=85,70"))
        images.add(ModelImages(2, "", "https://imageio.forbes.com/specials-images/imageserve/637b1d11729a96ce28ea598c/The-Top-10-Tech-Trends-In-2023-Everyone-Must-Be-Ready-For/960x0.jpg?format=jpg&width=960"))
        images.add(ModelImages(3, "", "https://s35764.pcdn.co/wp-content/uploads/2021/09/tech2-1024x630.png"))
        images.add(ModelImages(4, "", "https://investormediapro.bg/wp-content/uploads/2021/02/Tech-of-tomorrow-tint-1130x636-1.jpg"))
        images.add(ModelImages(4, "", "https://www.valueresearchonline.com/content-assets/images/50971_20220623-tech__w660__.jpg"))

        val layoutManager: RecyclerView.LayoutManager = CenterZoomLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,
            false
        )
        binding.recyclerView.scrollToPosition(images.size / 2)
        val snapHelper: SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(binding.recyclerView)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = ImageAdapter(this, images)
        binding.recyclerView.addItemDecoration(CirclePagerIndicatorDecoration(getColor(R.color.black)))


        val layoutManager1: RecyclerView.LayoutManager = CenterZoomLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,
            false
        )
        val snapHelper1: SnapHelper = LinearSnapHelper()
        snapHelper1.attachToRecyclerView(binding.recyclerViewCirculer)
        binding.recyclerViewCirculer.scrollToPosition(images.size / 2)
        binding.recyclerViewCirculer.layoutManager = layoutManager1
        binding.recyclerViewCirculer.adapter = ImageAdapter(this, images)
        binding.recyclerViewCirculer.addItemDecoration(LinePagerIndicatorDecoration())
    }
}