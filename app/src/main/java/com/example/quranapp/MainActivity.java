package com.example.quranapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Wave;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    PDFView mypdfviewer;
    ImageView pre,menu,next;
    TextView paranumber;
    int numbers;



    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mypdfviewer = findViewById(R.id.pdfviewer);
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        menu = findViewById(R.id.menu);
        paranumber= findViewById(R.id.paranum);


        ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite doubleBounce = new FadingCircle();
        progressBar.setIndeterminateDrawable(doubleBounce);



        Intent intent = getIntent();
        intent.getExtras();
        Bundle bundle = intent.getExtras();
        String position = bundle.getString("position");

         int pos = Integer.parseInt(position);
         numbers = pos;


        setValue();

        switch (pos){

        case 0:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            break;

        case 1:
            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(27);

                    //copy paste this progress bar in other paras
                    progressBar.setVisibility(View.GONE);

                }
            },1800);

            break;


        case 2:
            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(55);
                }
            },1800);

            break;


        case 3:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(83);
                }
            },1800);

            break;


        case 4:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(111);
                }
            },1800);

            break;


        case 5:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(139);
                }
            },1800);

            break;



        case 6:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(167);
                }
            },1800);

            break;

        case 7:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(195);
                }
            },1800);

            break;

        case 8:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(223);
                }
            },1800);

            break;


        case 9:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(251);
                }
            },1800);

            break;



        case 10:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(279);
                }
            },1800);

            break;



        case 11:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(307);
                }
            },1800);

            break;



        case 12:



            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(335);
                }
            },1800);

            break;



        case 13:



            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(363);
                }
            },1800);

            break;


        case 14:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(391);
                }
            },1800);

            break;



        case 15:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(419);
                }
            },1800);

            break;



        case 16:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(447);
                }
            },1800);

            break;



        case 17:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(475);
                }
            },1800);

            break;




        case 18:



            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(503);
                }
            },1800);

            break;



        case 19:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(531);
                }
            },1800);

            break;



        case 20:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(557);
                }
            },1800);

            break;


        case 21:



            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(585);
                }
            },1800);

            break;


        case 22:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(611);
                }
            },1800);

            break;



        case 23:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(639);
                }
            },1800);

            break;



        case 24:
            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(665);
                }
            },1800);

            break;


        case 25:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(695);
                }
            },1800);

            break;



        case 26:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(725);
                }
            },1800);

            break;


        case 27:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(755);
                }
            },1800);

            break;



        case 28:

            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(785);
                }
            },1800);

            break;



        case 29:


            mypdfviewer.fromAsset("quran.pdf").load();
            show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    mypdfviewer.jumpTo(817);
                }
            },1800);

            break;







    }





        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage() - 1);


            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mypdfviewer.jumpTo(mypdfviewer.getCurrentPage() + 1);


            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });




    }

    private void setValue() {

        numbers = numbers +1;
        paranumber.setText("Para Number: "+numbers);

    }

    private void show() {

mypdfviewer.setVisibility(View.VISIBLE);


    }


}