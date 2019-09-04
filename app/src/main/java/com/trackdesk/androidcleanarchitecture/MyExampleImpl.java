package com.trackdesk.androidcleanarchitecture;

import java.util.Date;

public class MyExampleImpl implements MyExample {

    private long mDate;
    private String status;

    public MyExampleImpl() {
        mDate = new Date().getTime();
        status = "Test Status";
    }

    @Override
    public long getDate() {
        return mDate;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
