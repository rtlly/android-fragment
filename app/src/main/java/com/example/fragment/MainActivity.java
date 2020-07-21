package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private AndroidFragment androidFragment;
    private JavaFragment javaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        androidFragment = new AndroidFragment();
        javaFragment = new JavaFragment();
    }

    public void selectAndroid(View view) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, androidFragment);
        transaction.commit();
    }

    public void selectJava(View view) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, javaFragment);
        transaction.commit();
    }
}
