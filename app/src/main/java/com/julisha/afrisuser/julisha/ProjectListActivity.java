package com.julisha.afrisuser.julisha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.julisha.afrisuser.julisha.data.ProjectAdapter;
import com.julisha.afrisuser.julisha.data.ProjectCategoryAdapter;

public class ProjectListActivity extends AppCompatActivity {

    private ProjectAdapter mProjectAdapter;
    private String[] mProjects;
    private int[] mProjectIcons;

    private ListView mProjectLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

        populateProject();

        mProjectLV = (ListView) findViewById(R.id.project_lv);
        mProjectAdapter = new ProjectAdapter(this,
                mProjects,
                mProjectIcons);

        mProjectLV.setAdapter(mProjectAdapter);
        mProjectAdapter.notifyDataSetChanged();

    }

    private void populateProject() {
        String[] categories = { "Project One",
                "Project two",
                "Project three",
                "Project four",
                "Project five"};
        int[] categoriesIcon = {R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel};

        mProjects = categories;
        mProjectIcons = categoriesIcon;
    }
}
