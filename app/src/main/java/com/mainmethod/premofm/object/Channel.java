/*
 * Copyright (c) 2014.
 * Main Method Incorporated.
 */

package com.mainmethod.premofm.object;

import org.parceler.Parcel;

/**
 * Created by evan on 12/3/14.
 */
@Parcel(Parcel.Serialization.BEAN)
public class Channel implements Collectable {

    private int mId = -1;
    private String mServerId;
    private String mTitle;
    private String mAuthor;
    private String mDescription;
    private String mSiteUrl;
    private String mFeedUrl;
    private String mArtworkUrl;
    private String mNetwork;
    private String mTags;

    public Channel() {

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getServerId() {
        return mServerId;
    }

    public void setServerId(String serverId) {
        mServerId = serverId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getSiteUrl() {
        return mSiteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        mSiteUrl = siteUrl;
    }

    public String getFeedUrl() {
        return mFeedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        mFeedUrl = feedUrl;
    }

    @Override
    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
    }

    public String getNetwork() {
        return mNetwork;
    }

    public void setNetwork(String network) {
        mNetwork = network;
    }

    public String getTags() {
        return mTags;
    }

    public void setTags(String tags) {
        mTags = tags;
    }

    public boolean isSubscribed() {
        return mId > -1;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "mId=" + mId +
                ", mServerId='" + mServerId + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mSiteUrl='" + mSiteUrl + '\'' +
                ", mFeedUrl='" + mFeedUrl + '\'' +
                ", mArtworkUrl='" + mArtworkUrl + '\'' +
                ", mNetwork='" + mNetwork + '\'' +
                ", mTags='" + mTags + '\'' +
                '}';
    }

    public boolean metadataEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel channel = (Channel) o;

        if (!mArtworkUrl.equals(channel.mArtworkUrl)) return false;
        if (!mAuthor.equals(channel.mAuthor)) return false;
        if (!mDescription.equals(channel.mDescription)) return false;
        if (!mFeedUrl.equals(channel.mFeedUrl)) return false;
        if (!mNetwork.equals(channel.mNetwork)) return false;
        if (!mSiteUrl.equals(channel.mSiteUrl)) return false;
        if (!mTags.equals(channel.mTags)) return false;
        if (!mTitle.equals(channel.mTitle)) return false;

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Channel channel = (Channel) o;

        if (!mArtworkUrl.equals(channel.mArtworkUrl)) return false;
        if (!mAuthor.equals(channel.mAuthor)) return false;
        if (!mDescription.equals(channel.mDescription)) return false;
        if (!mFeedUrl.equals(channel.mFeedUrl)) return false;
        if (!mNetwork.equals(channel.mNetwork)) return false;
        if (!mServerId.equals(channel.mServerId)) return false;
        if (!mSiteUrl.equals(channel.mSiteUrl)) return false;
        if (!mTags.equals(channel.mTags)) return false;
        if (!mTitle.equals(channel.mTitle)) return false;

        return true;
    }

    @Override
    public String getSubtitle() {
        return mAuthor;
    }
}