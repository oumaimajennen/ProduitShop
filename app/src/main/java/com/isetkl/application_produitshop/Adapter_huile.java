package com.isetkl.application_produitshop;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter_huile extends ArrayAdapter {

    private ArrayList texte;
    private ArrayList image;

    public Adapter_huile(Context context, ArrayList texte, ArrayList image)
    {
        super(context, 0, texte);
        this.texte = texte;
        this.image = image;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_typehuile, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.item_image);
        TextView textView1 = convertView.findViewById(R.id.item_texte);


        imageView.setImageResource((Integer)image.get(position));
        textView1.setText((String)texte.get(position));


        return convertView;
    }
}
