package com.piashcse.fastscrollsidebar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.piashcse.fastcrollsidebar.ItemEntity
import com.piashcse.fastcrollsidebar.TitleDecoration
import com.piashcse.fastscrollsidebar.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val itemAdapter: ItemAdapter by lazy {
        ItemAdapter(fillData())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = itemAdapter
            addItemDecoration(
                TitleDecoration(
                    TitleDecoration.TitleAttributes(context).setBackgroundColor(R.color.purple_200)
                )
            )
        }

        binding.sideBar.setOnLetterChangeListener { letter ->
            val position: Int = itemAdapter.getSortLettersFirstPosition(letter)
            if (position != -1) {
                if (binding.recyclerview.layoutManager is LinearLayoutManager) {
                    val manager = binding.recyclerview.layoutManager as LinearLayoutManager
                    manager.scrollToPositionWithOffset(position, 0)
                } else {
                    binding.recyclerview.layoutManager?.scrollToPosition(position)
                }
            }
        }
    }

    private fun fillData(): List<ItemEntity<String>> {
        val sortList: MutableList<ItemEntity<String>> = ArrayList()
        Locale.getAvailableLocales()
            .map { it.displayCountry }
            .filter { it.trim().isNotBlank() }
            .distinct()
            .sorted().forEach {
                val item: ItemEntity<String> = ItemEntity()
                item.value = it
                val letters = it.substring(0, 1).toUpperCase()
                if (letters.matches("[A-Z]".toRegex())) {
                    item.setSortLetters(letters.toUpperCase())
                } else {
                    item.setSortLetters("#")
                }
                sortList.add(item)
            }
        return sortList
    }
}