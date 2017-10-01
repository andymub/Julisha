package com.julisha.afrisuser.julisha.events;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.julisha.afrisuser.julisha.EventDetailActivity;
import com.julisha.afrisuser.julisha.R;
import com.julisha.afrisuser.julisha.data.ArticleAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuccessStoryFragment extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    String[] mSuccessStoriess;
    int[] mSuccessStoriesIcons;
    ArticleAdapter mSuccessStoriesAdapter;

    public SuccessStoryFragment() {
        // Required empty public constructor
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SuccessStoryFragment newInstance(int sectionNumber) {
        SuccessStoryFragment fragment = new SuccessStoryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateSuccessStory();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_success_story, container, false);
        ListView successStoryLV = (ListView) rootView.findViewById(R.id.success_story_list_view);

        mSuccessStoriesAdapter = new ArticleAdapter(getContext(),
                mSuccessStoriess,
                mSuccessStoriesIcons);

        successStoryLV.setAdapter(mSuccessStoriesAdapter);
        successStoryLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

    private void populateSuccessStory() {

        String[] categories = { "Premier e-commerce a Kinshasa : eMart.cd",
                "Success Story two",
                "Success Story three",
                "Success Story four",
                "Success Story five"};

        int[] categoriesIcon = {R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel};

        mSuccessStoriess = categories;
        mSuccessStoriesIcons = categoriesIcon;
    }

}
