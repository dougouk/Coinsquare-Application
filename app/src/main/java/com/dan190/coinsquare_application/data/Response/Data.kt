package com.dan190.coinsquare_application.data.Response

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("secure_media")
	val secureMedia: Any? = null,

	@field:SerializedName("saved")
	val saved: Boolean? = null,

	@field:SerializedName("over_18")
	val over18: Boolean? = null,

	@field:SerializedName("hide_score")
	val hideScore: Boolean? = null,

	@field:SerializedName("subreddit_id")
	val subredditId: String? = null,

	@field:SerializedName("subreddit")
	val subreddit: String? = null,

	@field:SerializedName("suggested_sort")
	val suggestedSort: Any? = null,

	@field:SerializedName("score")
	val score: Int? = null,

	@field:SerializedName("num_comments")
	val numComments: Int? = null,

	@field:SerializedName("mod_reason_title")
	val modReasonTitle: Any? = null,

	@field:SerializedName("whitelist_status")
	val whitelistStatus: String? = null,

	@field:SerializedName("can_gild")
	val canGild: Boolean? = null,

	@field:SerializedName("spoiler")
	val spoiler: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("locked")
	val locked: Boolean? = null,

	@field:SerializedName("created_utc")
	val createdUtc: Double? = null,

	@field:SerializedName("likes")
	val likes: Any? = null,

	@field:SerializedName("banned_at_utc")
	val bannedAtUtc: Any? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("downs")
	val downs: Int? = null,

	@field:SerializedName("edited")
	val edited: Boolean? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("created")
	val created: Double? = null,

	@field:SerializedName("report_reasons")
	val reportReasons: Any? = null,

	@field:SerializedName("brand_safe")
	val brandSafe: Boolean? = null,

	@field:SerializedName("approved_by")
	val approvedBy: Any? = null,

	@field:SerializedName("is_video")
	val isVideo: Boolean? = null,

	@field:SerializedName("subreddit_name_prefixed")
	val subredditNamePrefixed: String? = null,

	@field:SerializedName("mod_reason_by")
	val modReasonBy: Any? = null,

	@field:SerializedName("media_embed")
	val mediaEmbed: MediaEmbed? = null,

	@field:SerializedName("domain")
	val domain: String? = null,

	@field:SerializedName("approved_at_utc")
	val approvedAtUtc: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("ups")
	val ups: Int? = null,

	@field:SerializedName("permalink")
	val permalink: String? = null,

	@field:SerializedName("num_reports")
	val numReports: Any? = null,

	@field:SerializedName("author_flair_css_class")
	val authorFlairCssClass: Any? = null,

	@field:SerializedName("pinned")
	val pinned: Boolean? = null,

	@field:SerializedName("mod_reports")
	val modReports: List<Any?>? = null,

	@field:SerializedName("hidden")
	val hidden: Boolean? = null,

	@field:SerializedName("gilded")
	val gilded: Int? = null,

	@field:SerializedName("removal_reason")
	val removalReason: Any? = null,

	@field:SerializedName("mod_note")
	val modNote: Any? = null,

	@field:SerializedName("media")
	val media: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("author_flair_text")
	val authorFlairText: Any? = null,

	@field:SerializedName("archived")
	val archived: Boolean? = null,

	@field:SerializedName("num_crossposts")
	val numCrossposts: Int? = null,

	@field:SerializedName("thumbnail_width")
	val thumbnailWidth: Any? = null,

	@field:SerializedName("can_mod_post")
	val canModPost: Boolean? = null,

	@field:SerializedName("secure_media_embed")
	val secureMediaEmbed: SecureMediaEmbed? = null,

	@field:SerializedName("is_self")
	val isSelf: Boolean? = null,

	@field:SerializedName("link_flair_css_class")
	val linkFlairCssClass: Any? = null,

	@field:SerializedName("selftext_html")
	val selftextHtml: Any? = null,

	@field:SerializedName("selftext")
	val selftext: String? = null,

	@field:SerializedName("link_flair_text")
	val linkFlairText: Any? = null,

	@field:SerializedName("subreddit_type")
	val subredditType: String? = null,

	@field:SerializedName("user_reports")
	val userReports: List<Any?>? = null,

	@field:SerializedName("is_crosspostable")
	val isCrosspostable: Boolean? = null,

	@field:SerializedName("distinguished")
	val distinguished: Any? = null,

	@field:SerializedName("clicked")
	val clicked: Boolean? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("thumbnail_height")
	val thumbnailHeight: Any? = null,

	@field:SerializedName("parent_whitelist_status")
	val parentWhitelistStatus: String? = null,

	@field:SerializedName("stickied")
	val stickied: Boolean? = null,

	@field:SerializedName("visited")
	val visited: Boolean? = null,

	@field:SerializedName("quarantine")
	val quarantine: Boolean? = null,

	@field:SerializedName("banned_by")
	val bannedBy: Any? = null,

	@field:SerializedName("view_count")
	val viewCount: Any? = null,

	@field:SerializedName("contest_mode")
	val contestMode: Boolean? = null,

	@field:SerializedName("is_reddit_media_domain")
	val isRedditMediaDomain: Boolean? = null
)