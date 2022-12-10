package com.shaimaziyad.recyclerviews.expandableRecyclerView.utils

import com.shaimaziyad.recyclerviews.expandableRecyclerView.model.MainModel
import com.shaimaziyad.recyclerviews.expandableRecyclerView.model.SubItemModel

object SampleData {

    private val colorList = listOf(
        SubItemModel("Red"),
        SubItemModel("Green"),
        SubItemModel("Black"),
        SubItemModel("Yellow"),
        SubItemModel("Brown"),
        SubItemModel("White"),
        SubItemModel("Blue"),

        )

    val collections = listOf(
        MainModel("all Colors", colorList),
        MainModel("Pastel Colors", colorList.reversed()),
        MainModel("Vintage Colors", colorList.shuffled()),
    )
}