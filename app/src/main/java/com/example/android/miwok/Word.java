package com.example.android.miwok;

/**
 * Created by Kirk on 12/4/2017.
 */

public class Word {

    // String value of miwok word
    private String mMiwokTranslation;

    // String value of default translation of the miwok word
    private String mDefaultTranslation;

    private int mAudioResourceID = NO_AUDIO_PROVIDED;

    // int value of Image Location for the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;

    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
        mImageResourceID = imageResourceID;
    }

    /**
     * get Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get image Resource ID for the word
     */
    public int getAudioResourceID() {return mAudioResourceID; }

    /**
     * return whether there is an image set
     */
    public boolean hasAudio() {
        return mAudioResourceID != NO_AUDIO_PROVIDED;
    }

    /**
     * get image Resource ID for the word
     */
    public int getImageResourceID() {return mImageResourceID; }

    /**
     * return whether there is an image set
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceID=" + mAudioResourceID +
                ", mImageResourceID=" + mImageResourceID +
                '}';
    }
}
