package com.fauzywahyudi.latihan3_my_recycler_view.model

import com.beust.klaxon.*

private val klaxon = Klaxon()

data class Restaurants (
    val error: Boolean,
    val message: String,
    val count: Long,
    val restaurants: List<Restaurant>
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Restaurants>(json)
    }
}

data class Restaurant (
    val id: String,
    val name: String,
    val description: String,

    @Json(name = "pictureId")
    val pictureID: String,

    val city: String,
    val rating: Double
)

