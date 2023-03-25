package com.example.practicaldemo

data class PlaylistResponse(
    val `data`: List<PlayList>
)

data class PlayList(
    val contentDetails: ContentDetails,
    val etag: String,
    val id: String,
    val kind: String,
    val language: String,
    val snippet: Snippet,
    val thumbUrl: String
)
data class ContentDetails(
    val itemCount: Int
)

data class Snippet(
    val channelId: String,
    val channelTitle: String,
    val description: String,
    val publishedAt: String,
    val title: String
)