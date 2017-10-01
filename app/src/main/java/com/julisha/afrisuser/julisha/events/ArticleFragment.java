package com.julisha.afrisuser.julisha.events;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.julisha.afrisuser.julisha.EventDetailActivity;
import com.julisha.afrisuser.julisha.R;
import com.julisha.afrisuser.julisha.data.ArticleAdapter;
import com.julisha.afrisuser.julisha.data.ProjectAdapter;

import static com.julisha.afrisuser.julisha.R.id.textView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ArticleFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    String[] mArticles;
    int[] mArticleIcons;
    ArticleAdapter mArticleAdapter;
    public ArticleFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ArticleFragment newInstance(int sectionNumber) {
        ArticleFragment fragment = new ArticleFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        populateArticle();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_article, container, false);
        ListView articleLV = (ListView) rootView.findViewById(R.id.article_list_view);

        mArticleAdapter = new ArticleAdapter(getContext(),
                mArticles,
                mArticleIcons);

        articleLV.setAdapter(mArticleAdapter);
        articleLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), EventDetailActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }



    private void populateArticle() {
        String[] categories = { "Comment etablir une startup en nouvelle technologies a Kinshasa ?",
                "Project two",
                "Project three",
                "Project four",
                "Project five"};
        int[] categoriesIcon = {R.drawable.thomas5,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel};

        mArticles = categories;
        mArticleIcons = categoriesIcon;
    }
}
