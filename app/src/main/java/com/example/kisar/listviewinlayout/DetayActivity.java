package com.example.kisar.listviewinlayout;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    TextView tv_baslik,tv_altbaslik,tv_hakkinda;
    ImageView img_bayrak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        setTitle("Ülke Detay");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent i=getIntent();
        UlkeBilgileri ulke= (UlkeBilgileri) i.getSerializableExtra("ulke");
        tv_baslik= (TextView) findViewById(R.id.tv_baslik);
        tv_altbaslik= (TextView) findViewById(R.id.tv_altbaslik);
        tv_hakkinda= (TextView) findViewById(R.id.tv_hakkinda);
        img_bayrak= (ImageView) findViewById(R.id.img_bayrak);

        tv_baslik.setText(ulke.getUlkeAdi());
        tv_altbaslik.setText(""+ulke.getUlkeNufus());
        tv_hakkinda.setText(ulke.getUlkeHakkinda());
        img_bayrak.setImageResource(ulke.getUlkeBayrakId());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home) {
            Intent i=new Intent(DetayActivity.this,MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
