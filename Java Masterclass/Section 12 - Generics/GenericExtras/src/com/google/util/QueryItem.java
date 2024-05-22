package com.google.util;

public interface QueryItem {
    boolean matchFieldValue(String fieldName, String value);
}
