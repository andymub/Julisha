package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateProfilFormActivity extends AppCompatActivity {


    ImageView sback;
    TextView localSignin,sinCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profil_form);
        sback=(ImageView)findViewById(R.id.sback);
        sinCreate=(TextView)findViewById(R.id.sinCreate);
        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLogin=new Intent(CreateProfilFormActivity.this,LoginActivity.class);
                startActivity(backToLogin);

            }
        });
        sinCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLogin=new Intent(CreateProfilFormActivity.this,SigninActivity.class);
                startActivity(backToLogin);

            }
        });

    }
}
