package com.mustafayavuz.mustafa.jsonparse;

public class ExampleItem {

    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String imageUrl,String creator, int likes){
        mImageUrl=imageUrl;
        mCreator=creator;
        mLikes=likes;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }
}
