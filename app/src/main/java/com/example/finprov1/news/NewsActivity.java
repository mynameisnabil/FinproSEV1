package com.example.finprov1.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.finprov1.R;
import com.example.finprov1.latestupdates.LatestUpdatesModel;

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
        newsList.add(new NewsModel("Indonesia akan melawan Argentina di GBK", "Bima Sakti - Jakarta", R.drawable.news1, "Indonesia akan melawan Argentina di GBK"));
        newsList.add(new NewsModel("Indonesia Juara SEA Games 2023 Cabang Sepak Bola", "Bima Sakti - Jakarta", R.drawable.news2, "Indonesia Juara SEA Games 2023 Cabang Sepak Bola"));
        newsList.add(new NewsModel("BINUS Membuka Lapangan Sepak Bola Pertama", "Bima Sakti - Jakarta", R.drawable.news3, "BINUS Membuka Lapangan Sepak Bola Pertama"));
        newsList.add(new NewsModel("Tournament Mobile Legend Terbesar di dunia", "Bima Sakti - Jakarta", R.drawable.news4, "Tournament Mobile Legend Terbesar di dunia"));
        newsList.add(new NewsModel("BOOM ID Juara VCT Indonesia", "Bima Sakti - Jakarta", R.drawable.news5, "BOOM ID Juara VCT Indonesia"));

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