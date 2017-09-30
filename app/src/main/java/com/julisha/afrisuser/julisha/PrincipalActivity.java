package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.julisha.afrisuser.julisha.R.id.item;

public class PrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnProject, btnProfil, btnEvents, btnEntreprise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //bind xml--jv
        btnProfil = (ImageButton) findViewById(R.id.imageButtonprofil);
        btnEntreprise=(ImageButton)findViewById(R.id.imageButtonEntreprise);
        btnEvents=(ImageButton)findViewById(R.id.imageButtonEvenement);
        btnProject=(ImageButton)findViewById(R.id.imageButtonproject);

        //set onclick btn
        btnProject.setOnClickListener(this);
        btnEvents.setOnClickListener(this);
        btnEntreprise.setOnClickListener(this);
        btnProfil.setOnClickListener(this);

        // Set the third image button background transparent
        // This method allow us to show click effect
        TypedValue outValue = new TypedValue();
        getApplicationContext().getTheme().resolveAttribute(
                android.R.attr.selectableItemBackground, outValue, true);
        btnProfil.setBackgroundResource(outValue.resourceId);
        btnEntreprise.setBackgroundResource(outValue.resourceId);
        btnEvents.setBackgroundResource(outValue.resourceId);
        btnProject.setBackgroundResource(outValue.resourceId);
        BottomNavigationView bottomNavigation =
                (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                handleBottomNavigationItemSelected(item);
                return true;
            }
        });
    }




        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.investisseur:
                Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.aide:
                Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Contact:
                Toast.makeText(getApplicationContext(),"Item 3 Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    // ...

    private void handleBottomNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_addprojet:
                //todo go to add project
                break;
            case R.id.action_mes_project:
                //todo go to check my project
                break;
            case R.id.action_Offres_des_Finacements:
                //todo go to check finance offer
                break;
        }
    }



    @Override
    public void onClick(View v) {
        Intent principalIntent;
        switch (v.getId())
        {
            case R.id .imageButtonEntreprise :
                Intent IntentEntreprise = new Intent(PrincipalActivity.this, EntreppriseListeActivity.class);
                startActivity(IntentEntreprise);
                break;
            case R.id .imageButtonprofil :
                principalIntent= new Intent(PrincipalActivity.this, UserProfilActivity.class);
                startActivity(principalIntent);
                break;
            case R.id .imageButtonproject :
                principalIntent = new Intent(PrincipalActivity.this, ProjectListActivity.class);
                startActivity(principalIntent);
                break;
            case R.id .imageButtonEvenement :
                principalIntent = new Intent(PrincipalActivity.this, EventsActivity.class);
                startActivity(principalIntent);
                break;

        }
    }

}
