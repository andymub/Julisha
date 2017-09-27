package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }


    @Override
    public void onClick(View v) {
        Intent principalIntent;
        switch (v.getId())
        {
            case R.id .imageButtonEntreprise :
                //todo go to entreprise activity
                break;
            case R.id .imageButtonprofil :
                //todo go to Profil activity
                principalIntent= new Intent(PrincipalActivity.this, CreateProfil1Activity.class);
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
