package com.yharnam.clipvault.model;

import com.google.gson.annotations.SerializedName;

public class ClipsData {
    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    @SerializedName("embed_url")
    private String embedUrl;

    @SerializedName("broadcaster_id")
    private String broadcasterId;

    @SerializedName("broadcaster_name")
    private String broadcasterName;

    @SerializedName("creator_id")
    private String creatorId;

    @SerializedName("creator_name")
    private String creatorName;

    @SerializedName("video_id")
    private String videoId;

    @SerializedName("game_id")
    private String gameId;

    @SerializedName("language")
    private String language;

    @SerializedName("title")
    private String title;

    @SerializedName("view_count")
    private Integer viewCount;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("thumbnail_url")
    private String thumbnailUrl;

    @SerializedName("duration")
    private Double duration;

    @SerializedName("vod_offset")
    private Boolean vodOffset;

    @SerializedName("is_featured")
    private Boolean isFeatured;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public String getBroadcasterId() {
        return broadcasterId;
    }

    public void setBroadcasterId(String broadcasterId) {
        this.broadcasterId = broadcasterId;
    }

    public String getBroadcasterName() {
        return broadcasterName;
    }

    public void setBroadcasterName(String broadcasterName) {
        this.broadcasterName = broadcasterName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Boolean getVodOffset() {
        return vodOffset;
    }

    public void setVodOffset(Boolean vodOffset) {
        this.vodOffset = vodOffset;
    }

    public Boolean getFeatured() {
        return isFeatured;
    }

    public void setFeatured(Boolean featured) {
        isFeatured = featured;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ClipsData{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", embedUrl='" + embedUrl + '\'' +
                ", broadcasterId='" + broadcasterId + '\'' +
                ", broadcasterName='" + broadcasterName + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", creatorName='" + creatorName + '\'' +
                ", videoId='" + videoId + '\'' +
                ", gameId='" + gameId + '\'' +
                ", language='" + language + '\'' +
                ", title='" + title + '\'' +
                ", viewCount=" + viewCount +
                ", createdAt='" + createdAt + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", duration=" + duration +
                ", vodOffset=" + vodOffset +
                ", isFeatured=" + isFeatured +
                '}';
    }
}
