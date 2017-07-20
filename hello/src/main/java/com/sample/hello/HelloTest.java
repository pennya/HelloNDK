package com.sample.hello;

/**
 * Created by KIM on 2017-07-20.
 */

public class HelloTest {
    static {
        System.loadLibrary("hello");
    }

    public native int ndkHelloTest(int v);
}
