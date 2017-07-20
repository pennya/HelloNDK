//
// Created by KIM on 2017-07-20.
//

#include "com_sample_hello_HelloTest.h"

JNIEXPORT jint JNICALL Java_com_sample_hello_HelloTest_ndkHelloTest
        (JNIEnv * env, jobject obj, jint v) {

    jint a = v + 10;
    a *= 4;

    return a;
}

