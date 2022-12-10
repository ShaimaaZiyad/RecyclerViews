package com.shaimaziyad.recyclerviews.storiesRecyclerview.utils

import com.shaimaziyad.recyclerviews.storiesRecyclerview.model.Story
import com.shaimaziyad.recyclerviews.storiesRecyclerview.model.StoryModel

object StoriesData {

    private val storyModel = listOf(
        StoryModel(Images.imageUrl0),
        StoryModel(Images.imageUrl1),
        StoryModel(Images.imageUrl2),
        StoryModel(Images.imageUrl3),
        StoryModel(Images.imageUrl4),
        StoryModel(Images.imageUrl5),
        StoryModel(Images.imageUrl6),
        StoryModel(Images.imageUrl7),
        StoryModel(Images.imageUrl8),
        StoryModel(Images.imageUrl9)
    )

    val collections = listOf(
        Story("All Stories", storyModel),
        Story("Want To See", storyModel.reversed()),
        Story("Popular Story", storyModel.shuffled()),
        Story("Top Rated Story", storyModel)
    )
}