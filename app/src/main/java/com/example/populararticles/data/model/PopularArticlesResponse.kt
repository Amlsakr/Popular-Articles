package com.example.populararticles.data.model

import com.google.gson.annotations.SerializedName

data class PopularArticlesResponse(

	@field:SerializedName("copyright")
	val copyright: String = "",

	@field:SerializedName("results")
	val results: List<Article> = listOf(),

	@field:SerializedName("num_results")
	val numResults: Int = 0,

	@field:SerializedName("status")
	val status: String = ""
)

data class MediaItem(

	@field:SerializedName("copyright")
	val copyright: String = "",

	@field:SerializedName("media-metadata")
	val mediaMetadata: List<MediaMetadataItem> = listOf(),

	@field:SerializedName("subtype")
	val subtype: String = "",

	@field:SerializedName("caption")
	val caption: String = "",

	@field:SerializedName("type")
	val type: String = "",

	@field:SerializedName("approved_for_syndication")
	val approvedForSyndication: Int = 0
)

data class MediaMetadataItem(

	@field:SerializedName("format")
	val format: String = "",

	@field:SerializedName("width")
	val width: Int = 0,

	@field:SerializedName("url")
	val url: String = "",

	@field:SerializedName("height")
	val height: Int? = null
)

data class Article(

	@field:SerializedName("per_facet")
	val perFacet: List<String> = listOf(),

	@field:SerializedName("eta_id")
	val etaId: Int = 0,

	@field:SerializedName("subsection")
	val subsection: String = "",

	@field:SerializedName("org_facet")
	val orgFacet: List<String> = listOf(),

	@field:SerializedName("nytdsection")
	val nytdsection: String = "",

	@field:SerializedName("column")
	val column: Any? = null,

	@field:SerializedName("section")
	val section: String = "",

	@field:SerializedName("asset_id")
	val assetId: Long = 0,

	@field:SerializedName("source")
	val source: String = "",

	@field:SerializedName("abstract")
	val jsonMemberAbstract: String = "",

	@field:SerializedName("media")
	val media: List<MediaItem> = listOf(),

	@field:SerializedName("type")
	val type: String = "",

	@field:SerializedName("title")
	val title: String = "",

	@field:SerializedName("des_facet")
	val desFacet: List<String> = listOf(),

	@field:SerializedName("uri")
	val uri: String = "",

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("adx_keywords")
	val adxKeywords: String = "",

	@field:SerializedName("geo_facet")
	val geoFacet: List<Any?>? = null,

	@field:SerializedName("id")
	val id: Long = 0,

	@field:SerializedName("published_date")
	val publishedDate: String = "",

	@field:SerializedName("updated")
	val updated: String = "",

	@field:SerializedName("byline")
	val byline: String = ""
)
