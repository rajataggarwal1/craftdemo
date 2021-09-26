package com.intuit.craftdemo.domain.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorSource {

    @JsonProperty
    private String pointer;

    public ErrorSource() {
    }

    public ErrorSource(String pointer) {
        this.pointer = pointer;
    }

    public String getPointer() {
        return pointer;
    }

    public void setPointer(String pointer) {
        this.pointer = pointer;
    }
}