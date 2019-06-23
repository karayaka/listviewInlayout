package com.example.kisar.listviewinlayout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kisar on 22.06.2019.
 */

public class CustomAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<UlkeBilgileri> ulkeList;

    public CustomAdapter(Activity activity, List<UlkeBilgileri> ulkeList) {
        layoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.ulkeList=ulkeList;

    }

    @Override
    public int getCount() {
        return ulkeList.size();
    }

    @Override
    public Object getItem(int i) {
        return ulkeList.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view=layoutInflater.inflate(R.layout.custom_list_item,null);
        }else{
            view=convertView;
        }
        TextView tvBaslik= (TextView) view.findViewById(R.id.txtbaslik);
        TextView tvaltBaslik= (TextView) view.findViewById(R.id.txtaltbaslik);
        ImageView imgeBayrak= (ImageView) view.findViewById(R.id.imgbayrak);
        String s=ulkeList.get(position).getUlkeAdi();
        //Log.e("custem",ulkeList.get(position).getUlkeAdi());
        UlkeBilgileri ulke=ulkeList.get(position);
        tvBaslik.setText("Ülke Adı: "+ulke.getUlkeAdi());
        tvaltBaslik.setText("Ülke Nufusu: "+ulke.getUlkeNufus());
        imgeBayrak.setImageResource(ulkeList.get(position).getUlkeBayrakId());

        return view;
    }





}
