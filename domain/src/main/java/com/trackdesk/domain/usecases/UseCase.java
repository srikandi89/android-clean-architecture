package com.trackdesk.domain.usecases;

import io.reactivex.Single;

public interface UseCase<I, O> {

    Single<O> execute(I input);
}
