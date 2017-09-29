package com.julisha.afrisuser.julisha.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.julisha.afrisuser.julisha.R;

/**
 * Created by sugar on 9/29/2017.
 */

public class ProjectCategoryAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mProjectCategories;
    private int[] mCategoryIcons;


    public ProjectCategoryAdapter(Context mContext, String[] mCategories, int[] mCategoryIcons) {
        this.mContext = mContext;
        this.mProjectCategories = mCategories;
        this.mCategoryIcons = mCategoryIcons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.project_category_item,parent, false);

        TextView projectCategoryTV = (TextView) view.findViewById(R.id.project_category_tv);
        ImageView projectIconTV = (ImageView) view.findViewById(R.id.project_category_icon_iv);

        projectCategoryTV.setText(mProjectCategories[position]);
        projectIconTV.setImageResource(mCategoryIcons[position]);

        return view;
    }

    @Override
    public int getCount() {
        return mProjectCategories.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
}
