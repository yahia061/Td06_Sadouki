package com.example.yaya.td06_listview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by yaya on 25/04/2018.
 */

public class MonAdaptateurDeListe extends ArrayAdapter<String> {
private Integer[] tab_images_pour_la_liste={
  R.drawable.device,
        R.drawable.geolocation,
        R.drawable.accelerometer,
        R.drawable.navigateur_internet,
        R.drawable.notification,
        R.drawable.album_photo,
        R.drawable.connection_network,
        R.drawable.files,
        R.drawable.carnet_contact


};

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.rowlayaout,parent,false);
        TextView textView=(TextView)rowView.findViewById(R.id.label);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.icon);
        textView.setText(getItem(position));
        if(convertView==null){
            imageView.setImageResource(tab_images_pour_la_liste[position]);}
            else
                rowView=(View)convertView;
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "position :"+position, Toast.LENGTH_LONG).show();
            }
        });
            return rowView;

    }

    public MonAdaptateurDeListe(@NonNull Context context, @NonNull String[] values) {
        super(context,R.layout.rowlayaout, values);

    }
}
