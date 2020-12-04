package com.lazday.androidretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String title = getIntent().getStringExtra("intent_title");
        String image = getIntent().getStringExtra("intent_image");
        getSupportActionBar().setTitle( title );
        Picasso.get()
                .load( image )
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_placeholder)
                .into( (ImageView)findViewById(R.id.imageView) );
    }
}