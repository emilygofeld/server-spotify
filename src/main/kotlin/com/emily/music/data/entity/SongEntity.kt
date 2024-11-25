package com.emily.music.data.entity

import com.emily.core.ID
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class SongEntity(
    val title: String,
    val singer: List<String>,
    val length: Int,
    @BsonId
    val id: ID = ObjectId().toString()
)