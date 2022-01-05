package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class akasisatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akasisatu);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("pengumuman_kip_tambahan.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}