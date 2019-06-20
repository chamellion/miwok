package com.example.android.miwok;

import android.widget.ImageView;

import junit.framework.Assert;

public class Word {


    private String mDefaultTranslation;

    private String mMiwokTranslation ;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudio;



//Constructor for word class with two input parameter, miwok word and corresponding English translation
    public Word(String miwokTranslation, String DefaultTranslation, int Audio){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = Audio;
    }
    public Word(String miwokTranslation, String DefaultTranslation, int ImageResourceId, int Audio){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudio = Audio;
    }
    // get the default translation(English)
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }// GEt the miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }public int getAudio(){ return mAudio;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudio=" + mAudio +
                '}';
    }
}
