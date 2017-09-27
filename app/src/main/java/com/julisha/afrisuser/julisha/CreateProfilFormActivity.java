package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CreateProfilFormActivity extends AppCompatActivity {

    ImageView sback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profil_form);
        sback=(ImageView)findViewById(R.id.sback);
        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToLogin=new Intent(CreateProfilFormActivity.this,LoginActivity.class);
                startActivity(backToLogin);

            }
        });

    }
}
