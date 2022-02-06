package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class paraActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<HModel> modleList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);



        recyclerView = findViewById(R.id.rv_home);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(paraActivity.this);




        recyclerView.setLayoutManager(layoutManager);
        modleList = new ArrayList<>();

        modleList.add(new HModel("آلم","1"));
        modleList.add(new HModel("سَيَقُولُ","2"));
        modleList.add(new HModel("تِلْكَ الرُّسُلُ","3"));
        modleList.add(new HModel("لَنْ تَنَالُوا","4"));
        modleList.add(new HModel("وَالْمُحْصَنَاتُ","5"));
        modleList.add(new HModel("لَا يُحِبُّ اللَّهُ","6"));
        modleList.add(new HModel("وَإِذَا سَمِعُوا","7"));
        modleList.add(new HModel("وَلَوْ أَنَّنَا","8"));
        modleList.add(new HModel("قَالَ الْمَلَأُ","9"));
        modleList.add(new HModel("وَاعْلَمُوا","10"));
        modleList.add(new HModel("يَعْتَذِرُونَ","11"));
        modleList.add(new HModel("وَمَا مِنْ دَابَّةٍ","12"));
        modleList.add(new HModel("وَمَا أُبَرِّئُ","13"));
        modleList.add(new HModel("رُبَمَا","14"));
        modleList.add(new HModel("سُبْحَانَ الَّذِي","15"));
        modleList.add(new HModel("قَالَ أَلَمْ","16"));
        modleList.add(new HModel("اقْتَرَبَ","17"));
        modleList.add(new HModel("قَدْ أَفْلَحَ","18"));
        modleList.add(new HModel("وَقَالَ الَّذِينَ","19"));
        modleList.add(new HModel("أَمَّنْ خَلَقَ","20"));
        modleList.add(new HModel("اتْلُ مَا أُوحِيَ","21"));
        modleList.add(new HModel("وَمَنْ يَقْنُتْ","22"));
        modleList.add(new HModel("وَمَا لِيَ","23"));
        modleList.add(new HModel("فَمَنْ أَظْلَمُ","24"));
        modleList.add(new HModel("إِلَيْهِ يُرَدُّ","25"));
        modleList.add(new HModel("حم","26"));
        modleList.add(new HModel("قَالَ فَمَا خَطْبُكُمْ","27"));
        modleList.add(new HModel("قَدْ سَمِعَ اللَّهُ","28"));
        modleList.add(new HModel("تَبَارَكَ الَّذِي","29"));
        modleList.add(new HModel("عَمَّ يَتَسَاءَلُونَ","30"));
        HAdopter adopter = new HAdopter(modleList, paraActivity.this);
        recyclerView.setAdapter(adopter);





    }
}