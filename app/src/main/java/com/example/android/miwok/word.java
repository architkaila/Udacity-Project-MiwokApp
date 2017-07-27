package com.example.android.miwok;

/**
 * Created by archit on 26/7/17.
 */

public class word {

    private static final int NO_IMAGE = -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;

    public word(String defaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public word(String defaultTranslation, String MiwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
