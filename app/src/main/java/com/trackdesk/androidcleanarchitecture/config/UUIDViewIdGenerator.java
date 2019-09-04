package com.trackdesk.androidcleanarchitecture.config;

import java.util.UUID;

public class UUIDViewIdGenerator implements ViewIdGenerator {
    @Override
    public String newId() {
        return UUID.randomUUID().toString();
    }
}
