package com.example.kisar.listviewinlayout;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String ulkeAdlari[]={"Türkiye","Almanya","Fransa","İngiltere","Rusya"};
    Integer ulkelerHakkinda[]={R.string.turkiyeHakkinda,R.string.almanyaHakkinda,R.string.fransaHakkinda,
            R.string.ingiltereHakkinda,R.string.rusyaHakkinda};
    int ulkelerNufus[]={80810525,82175684,64732099,65382556,143533000};
    Integer ulkeBayraklari[]={R.drawable.turkiye,R.drawable.almanya,R.drawable.fransa,
            R.drawable.ingiltere,R.drawable.rusya};
    ListView lstulkeler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<UlkeBilgileri>ulkeList=new ArrayList<>();
        for(int id=0;id<ulkeAdlari.length;id++){
            UlkeBilgileri ulke=new UlkeBilgileri();
            ulke.setUlkeAdi(ulkeAdlari[id]);
            ulke.setUlkeId(id);
            ulke.setUlkeBayrakId(ulkeBayraklari[id]);
            ulke.setUlkeHakkinda(ulkelerHakkinda[id]);
            ulke.setUlkeNufus(ulkelerNufus[id]);
            ulkeList.add(ulke);

        }

        Log.e("hata",ulkeList.get(0).getUlkeAdi(), null);
        lstulkeler= (ListView) findViewById(R.id.lstulkeler);
        CustomAdapter adapter=new CustomAdapter(this,ulkeList);
        lstulkeler.setAdapter(adapter);
        lstulkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(MainActivity.this,DetayActivity.class);
                i.putExtra("ulke",ulkeList.get(position));
                startActivity(i);
            }
        });
    }

}
