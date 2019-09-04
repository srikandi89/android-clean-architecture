package com.trackdesk.androidcleanarchitecture.base;

import dagger.android.DaggerActivity;

public abstract class BaseActivityFragment extends DaggerActivity implements BaseView {

    private static final String KEY_VIEW_ID = "view_id";

    private String viewId;
    private boolean isViewRecreated;

    @Override
    public String getViewId() {
        return null;
    }

    @Override
    public boolean isRecreated() {
        return false;
    }
}
