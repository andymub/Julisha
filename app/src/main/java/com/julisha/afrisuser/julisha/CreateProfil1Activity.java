package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateProfil1Activity extends AppCompatActivity {

    private TextView signupforfree;
    private ImageView createprofimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createprofil1);
        signupforfree=(TextView)findViewById(R.id.signupforfree);
        createprofimg=(ImageView)findViewById(R.id.createprofimg);

        signupforfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createProfil=new Intent(CreateProfil1Activity.this, CreateProfilFormActivity.class);
                startActivity(createProfil);
            }
        });
        createprofimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //ona , c'est totalement du n'importe quoi avoir les mm lignes mais sa iyi akuna
                //bia best practice
                Intent createProfil1=new Intent(CreateProfil1Activity.this, CreateProfilFormActivity.class);
                startActivity(createProfil1);
            }
        });
    }
}
