package com.julisha.afrisuser.julisha.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.julisha.afrisuser.julisha.R;

/**
 * Created by sugar on 9/30/2017.
 */

public class ArticleAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mArticles;
    private int[] mArticleIcons;

    public ArticleAdapter(Context mContext, String[] mArticles, int[] mArticleIcons) {
        this.mContext = mContext;
        this.mArticles = mArticles;
        this.mArticleIcons = mArticleIcons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.project_item,parent, false);

        TextView projectCategoryTV = (TextView) view.findViewById(R.id.project_title_tv);
        ImageView projectIconTV = (ImageView) view.findViewById(R.id.project_icon_iv);

        projectCategoryTV.setText(mArticles[position]);
        projectIconTV.setImageResource(mArticleIcons[position]);

        return view;
    }

    @Override
    public int getCount() {
        return mArticles.length;
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
