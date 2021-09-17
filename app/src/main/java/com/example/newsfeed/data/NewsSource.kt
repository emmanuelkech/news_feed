package com.example.newsfeed.data

import com.example.newsfeed.R
import com.example.newsfeed.model.News

class NewsSource {

    fun loadNews() : List<News>{
        return listOf(
            News(R.string.newsletter1, R.drawable.newsletter1),
            News(R.string.newsletter2, R.drawable.newsletter2),
            News(R.string.newsletter3, R.drawable.newsletter3),
            News(R.string.newsletter4, R.drawable.newsletter4),
            News(R.string.newsletter5, R.drawable.newsletter5),
            News(R.string.newsletter6, R.drawable.newsletter6),
            News(R.string.newsletter7, R.drawable.newsletter7),
            News(R.string.newsletter8, R.drawable.newsletter8),
            News(R.string.newsletter9, R.drawable.newsletter9),
            News(R.string.newsletter10, R.drawable.newsletter10),
            News(R.string.newsletter11, R.drawable.newsletter11),
            News(R.string.newsletter12, R.drawable.newsletter12)
        )
    }
}