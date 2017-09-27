package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {
    ImageView sback;
    TextView localSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sback = (ImageView)findViewById(R.id.sinb);
        localSignin=(TextView)findViewById(R.id.sin) ;
        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SigninActivity.this,LoginActivity.class);
                startActivity(it);
            }
        });
        localSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSin;
                startSin =new Intent(SigninActivity.this, PrincipalActivity.class);
                startActivity(startSin);

            }
        });
    }


}

