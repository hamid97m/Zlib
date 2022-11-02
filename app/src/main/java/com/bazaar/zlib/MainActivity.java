package com.aghajari.zlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.archivepatcher.applier.zip.CustomDeflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(CustomDeflater.test(20));
    }
}