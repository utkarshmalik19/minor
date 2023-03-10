package com.example.minorproject.async;


public interface AsyncResponse<T> {

    enum Type {
        IMAGE_LOADED,
        ENCODE_SUCCESS,
        DECODE_SUCCESS,
        FAILURE
    }
    void processResult(T result, Type t);
}