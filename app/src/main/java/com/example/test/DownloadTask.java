package com.example.test;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

class DownloadTask extends AsyncTask<String, Void, Document> {
    @Override
    protected Document doInBackground(String... params) {
        Document html = null;
        try {
            String url = params[0];
            if (url != null) {
                try {
                    html = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36").get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }
}