package nl.giejay.android.tv.immich.api.model

import java.util.Date

data class AssetExifInfo(
    val description: String,
    val dateTimeOriginal: Date?,
    val orientation: Int?,
    val exifImageWidth: Number?,
    val exifImageHeight: Number?,
    val city: String?,
    val state: String?,
    val country: String?,
)

data class Asset(
    val id: String,
    val type: String,
    val deviceAssetId: String?,
    val exifInfo: AssetExifInfo?,
    val fileModifiedAt: Date?
)
