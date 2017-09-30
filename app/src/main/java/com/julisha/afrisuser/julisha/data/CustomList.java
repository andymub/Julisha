package com.julisha.afrisuser.julisha.data;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;
import com.julisha.afrisuser.julisha.R;

/**
 * Created by Andymub on 30/09/2017.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web,web2,web3;
    //private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] web, String[] web2,String[] web3) {
        super(context, R.layout.list_single, web);
        this.context = context;
        this.web = web;
        this.web2=web2;
        this.web3=web3;
        //this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txti1);
        TextView txtSubTitle = (TextView) rowView.findViewById(R.id.txti2);
        TextView txtPrice = (TextView) rowView.findViewById(R.id.txti3);

       // ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        txtSubTitle.setText(web2[position]);
        txtPrice.setText(web3[position]);

        //imageView.setImageResource(imageId[position]);
        return rowView;
    }
}