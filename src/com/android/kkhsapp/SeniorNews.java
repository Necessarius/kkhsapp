/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.android.kkhsapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author index
 */
public class SeniorNews extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.webview);
            WebView myWebView = (WebView) findViewById(R.id.webview);
            Document doc = Jsoup.connect("http://www.k12.hi.us/~kekaulik/").get();
            Elements ele = doc.select("td[height=204]");
            String html = ele.toString();
            String mime = "text/html";
            String encoding = "utf-8";
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadData(html, mime, encoding);            
        } catch (IOException ex) {
            Logger.getLogger(NewsActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
