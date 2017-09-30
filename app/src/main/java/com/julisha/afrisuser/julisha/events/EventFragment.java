package com.julisha.afrisuser.julisha.events;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.julisha.afrisuser.julisha.R;
import com.julisha.afrisuser.julisha.data.ArticleAdapter;


public class EventFragment extends Fragment {

    String[] mEvents;
    int[] mEventIcons;
    ArticleAdapter mEventAdapter;

    public EventFragment() {
        // Required empty public constructor
    }

    public static EventFragment newInstance() {
        EventFragment fragment = new EventFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        populateEvent();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_article, container, false);
        ListView articleLV = (ListView) rootView.findViewById(R.id.article_list_view);

        mEventAdapter = new ArticleAdapter(getContext(),
                mEvents,
                mEventIcons);

        articleLV.setAdapter(mEventAdapter);
        return rootView;
    }

    private void populateEvent() {
        String[] categories = { "Event One",
                "Event two",
                "Event three",
                "Event four",
                "Event five"};
        int[] categoriesIcon = {R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel};

        mEvents = categories;
        mEventIcons = categoriesIcon;
    }


}
