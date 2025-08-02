package com.example.catphoto.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class CatPhoto(
    @SerializedName("created_at")
    @Expose
    val createdAt: String,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("mimetype")
    @Expose
    val mimetype: String,
    @SerializedName("tags")
    @Expose
    val tags: List<String>,
    @SerializedName("url")
    @Expose
    val url: String
)