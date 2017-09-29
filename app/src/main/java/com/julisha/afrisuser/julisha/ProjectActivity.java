package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.julisha.afrisuser.julisha.data.ProjectCategoryAdapter;

public class ProjectActivity extends AppCompatActivity {

    private ProjectCategoryAdapter mProjectCategoryAdapter;
    private String[] mProjectCategories;
    private int[] mProjectCategoryIcons;

    private ListView mProjectLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        populateProjectCategory();

        mProjectLV = (ListView) findViewById(R.id.project_lv);
        mProjectCategoryAdapter = new ProjectCategoryAdapter(this,
                mProjectCategories,
                mProjectCategoryIcons);
        mProjectLV.setAdapter(mProjectCategoryAdapter);

        mProjectLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ProjectActivity.this, "cliked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectActivity.this, ProjectListActivity.class );
                startActivity(intent);
            }
        });
        mProjectCategoryAdapter.notifyDataSetChanged();
    }

    private void populateProjectCategory() {
        String[] categories = { "Agriculture",
                "Music",
                "Cinema",
                "Automobiles",
                "Media"};
        int[] categoriesIcon = {R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel,
                R.drawable.pic_airtel};

        mProjectCategories = categories;
        mProjectCategoryIcons = categoriesIcon;
    }
}
