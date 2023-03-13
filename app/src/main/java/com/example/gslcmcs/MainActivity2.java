package com.example.gslcmcs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import com.example.gslcmcs.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding.lihatBtn.setOnClickListener(v -> {
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View,String>(binding.coverImage, "image");
//            pairs[1] = new Pair<View,String>(binding.titleTextView, "title");
//            pairs[2] = new Pair<View,String>(binding.divider, "divider");
//            pairs[3] = new Pair<View,String>(binding.priceTV, "price");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this, pairs);

            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent, options.toBundle());
        });
    }
}