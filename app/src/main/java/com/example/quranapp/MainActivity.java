package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    Button p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30;
    PDFView mypdfviewer;
    ImageView pre,menu,next;



    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mypdfviewer = findViewById(R.id.pdfviewer);


        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        menu = findViewById(R.id.menu);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);



        mypdfviewer.fromAsset("quran.pdf").load();


        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage()-1);


            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage()+1);


            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               onBackPressed();


            }
        });



        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(2);

                Show();



            }
        });


        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(28);

                Show();
            }
        });


        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(56);

                Show();
            }
        });


        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(84);

                Show();
            }
        });


        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(112);

                Show();

            }
        });























    }

    private void Show() {



        mypdfviewer.setVisibility(View.VISIBLE);
        pre.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);


    }




    @Override
    public void onBackPressed() {
        mypdfviewer.setVisibility(View.INVISIBLE);
        pre.setVisibility(View.INVISIBLE);
        next.setVisibility(View.INVISIBLE);
        menu.setVisibility(View.INVISIBLE);
    }




}