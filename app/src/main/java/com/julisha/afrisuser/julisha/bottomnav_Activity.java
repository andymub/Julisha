package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ViewFlipper;

import java.security.PrivateKey;

public class bottomnav_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

private ViewFlipper vfli1,vfli2,vfli3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnav_);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        vfli1=(ViewFlipper)findViewById(R.id.vflip1);
        vfli2=(ViewFlipper)findViewById(R.id.vflip2);
        vfli3=(ViewFlipper)findViewById(R.id.vflip3);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent intentFromBottomItem =getIntent();
        int i= intentFromBottomItem.getIntExtra("bottomItem",0);
        String title ;
        if (i==1){
            title="Soumettre un projet";
            fab.setImageResource(R.mipmap.ic_addfile);
            //Spinner staticSpinner = (Spinner) findViewById(R.id.static_spinner);
            // Create an ArrayAdapter using the string array and a default spinner
            ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                    .createFromResource(this, R.array.brew_array,
                            android.R.layout.simple_spinner_item);

            // Specify the layout to use when the list of choices appears
            staticAdapter
                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Apply the adapter to the spinner
           // staticSpinner.setAdapter(staticAdapter);

            Spinner dynamicSpinner = (Spinner) findViewById(R.id.dynamic_spinner);

            String[] items = new String[] { "Financement Participatif", "Financement Integral", "Autre..." };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, items);

            dynamicSpinner.setAdapter(adapter);

            dynamicSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    Log.v("item", (String) parent.getItemAtPosition(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub
                }
            });
            vfli1.setVisibility(View.VISIBLE);
            vfli2.setVisibility(View.INVISIBLE);
            vfli3.setVisibility(View.INVISIBLE);
        }
        else if(i==2) {title="Mes Projets";fab.setImageResource(R.mipmap.ic_edit_white);
            vfli2.setVisibility(View.VISIBLE);
            vfli1.setVisibility(View.INVISIBLE);
            vfli3.setVisibility(View.INVISIBLE);
        }
        else {title="Offres des financements"; vfli3.setVisibility(View.VISIBLE);vfli1.setVisibility(View.INVISIBLE); vfli2.setVisibility(View.INVISIBLE);}

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle(title);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottomnav_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
