package com.example.sebnem.haberapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by sebnm on 11.06.2017.
 */

public class GazeteAdapter extends BaseAdapter{
    private LayoutInflater mInflater;
    private List<Gazete> mGazeteListesi;

    public GazeteAdapter(Activity activity,List<Gazete> gazeteler){
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mGazeteListesi = gazeteler;
    }

    @Override
    public int getCount() {
        return mGazeteListesi.size();
    }

    @Override
    public Object getItem(int position) {
        return mGazeteListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satir;

        satir = mInflater.inflate(R.layout.row,null);
        TextView textView = (TextView)satir.findViewById(R.id.tvAd);
        ImageView imageView = (ImageView)satir.findViewById(R.id.ivLogo);

        Gazete gazete = mGazeteListesi.get(position);
        textView.setText(gazete.getG_isim());

        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.cnn);
                break;
            case 1:
                imageView.setImageResource(R.drawable.ht);
                break;
            case 2:
                imageView.setImageResource(R.drawable.hurriyet);
                break;
            case 3:
                imageView.setImageResource(R.drawable.milliyet);
                break;
            case 4:
                imageView.setImageResource(R.drawable.ny);
                break;
            case 5:
                imageView.setImageResource(R.drawable.posta);
                break;
            case 6:
                imageView.setImageResource(R.drawable.sabah);
                break;
            default:
                break;
        }

        return satir;
    }
}
