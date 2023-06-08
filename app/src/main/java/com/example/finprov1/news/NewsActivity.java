package com.example.finprov1.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.finprov1.R;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity implements NewsAdapter.OnNewsClickListener {

    private List<NewsModel> newsList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        RecyclerView recyclerView = findViewById(R.id.rvNews);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        newsList = new ArrayList<>();
        newsList.add(new NewsModel("News 1", "Author 1 - Location 1", R.drawable.ic_launcher_background, "News Description 1..."));
        newsList.add(new NewsModel("News 2", "Author 2 - Location 2", R.drawable.ic_launcher_background, "News Description 2..."));
        newsList.add(new NewsModel("News 3", "Author 3 - Location 3", R.drawable.ic_launcher_background, "News Description 3..."));

        newsAdapter = new NewsAdapter(newsList, this);
        recyclerView.setAdapter(newsAdapter);
    }

    public void onNewsClick(NewsModel newsModel) {
        Intent intent = new Intent(this, NewsDetailActivity.class);
        intent.putExtra("title", newsModel.getTitle());
        intent.putExtra("author_location", newsModel.getAuthorLocation());
        intent.putExtra("image", newsModel.getImageResourceId());
        intent.putExtra("description", newsModel.getDescription());
        startActivity(intent);
    }
}