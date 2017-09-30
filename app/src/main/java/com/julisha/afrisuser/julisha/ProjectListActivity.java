package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        mProjectLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ProjectListActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectListActivity.this, ProjectDetailActivity.class);
                startActivity(intent);
            }
        });

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
