package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;

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
    }


    @Override
    public void onClick(View v) {
        Intent principalIntent;
        switch (v.getId())
        {
            case R.id .imageButtonEntreprise :
                //todo go to entreprise activity
                Intent IntentEntreprise = new Intent(PrincipalActivity.this, EntreppriseListeActivity.class);
                startActivity(IntentEntreprise);
                break;
            case R.id .imageButtonprofil :
                //todo go to Profil activity
                principalIntent= new Intent(PrincipalActivity.this, UserProfilActivity.class);
                startActivity(principalIntent);
                break;
            case R.id .imageButtonproject :
                //todo go to Project activity
                break;
            case R.id .imageButtonEvenement :
                //todo go to Events activity
                break;

        }
    }

}
