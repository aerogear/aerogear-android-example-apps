package org.aerogear.android.app.memeolist.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meme extends BaseObservable implements Serializable {

    private String id;
    private String photoUrl;
    private long likes;
    private String owner;
    private List<Comment> comments;

    public Meme(String id, String photoUrl, String owner) {
        this.id = id;
        this.photoUrl = photoUrl;
        this.owner = owner;
        this.likes = 0;
        this.comments = new ArrayList<>();
    }

    public Meme(String id, String photoUrl, String owner, long likes, List<Comment> comments) {
        this.id = id;
        this.photoUrl = photoUrl;
        this.owner = owner;
        this.likes = likes;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Bindable
    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meme meme = (Meme) o;
        return Objects.equals(id, meme.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
