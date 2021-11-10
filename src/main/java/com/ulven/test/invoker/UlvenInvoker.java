package com.ulven.test.invoker;

import com.ulven.test.exception.UlvenErrorStatus;
import com.ulven.test.exception.UlvenException;

public interface UlvenInvoker {

    default void invoke() {
        throw new UlvenException(UlvenErrorStatus.NOT_IMPLEMENTED);
    }
}
