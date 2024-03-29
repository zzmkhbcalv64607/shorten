package com.liyuu.shortenservice.exceptions;

/**
 * @ClassName ParameterException
 * @Description
 * @Version 1.0.0
 * @Author liyuu
 * @Date 2023/08/29
 */
public class ParameterException extends RuntimeException {
    public ParameterException() {
    }

    public ParameterException(String message) {
        super(message);
    }

    public ParameterException(Throwable cause) {
        super(cause);
    }
}
