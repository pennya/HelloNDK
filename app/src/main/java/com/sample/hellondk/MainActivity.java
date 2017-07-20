package com.sample.hellondk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sample.hello.HelloTest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloTest hello = new HelloTest();
        Toast.makeText(this, hello.ndkHelloTest(10) + "", Toast.LENGTH_SHORT).show();
    }
}
