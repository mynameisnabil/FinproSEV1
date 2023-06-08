package com.example.finprov1.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finprov1.R;

public class NewsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        ImageView newsImage = findViewById(R.id.news_image);
        TextView newsTitle = findViewById(R.id.news_title);
        TextView newsAuthorLocation = findViewById(R.id.news_author_location);
        TextView newsDescription = findViewById(R.id.news_description);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            newsTitle.setText(bundle.getString("title"));
            newsAuthorLocation.setText(bundle.getString("author_location"));
            newsImage.setImageResource(bundle.getInt("image"));
            newsDescription.setText(bundle.getString("description"));
        }
    }
}