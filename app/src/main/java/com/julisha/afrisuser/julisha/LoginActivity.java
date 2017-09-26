package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLgnFacebook,btnLgnGoogle,BtnLgn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //bind xml--jv
        btnLgnFacebook=(Button)findViewById(R.id.btn_facebook);
        btnLgnGoogle=(Button)findViewById(R.id.btn_google);
        BtnLgn=(Button)findViewById(R.id.btn_con);
        //set onclick
        btnLgnFacebook.setOnClickListener(this);
        btnLgnGoogle.setOnClickListener(this);
        BtnLgn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent startPrincIntent;
        startPrincIntent =new Intent(LoginActivity.this, PrincipalActivity.class);
        switch(v.getId())
        {
            case R.id.btn_facebook :
                //todo con the call principal Activ
                startActivity(startPrincIntent);
                break;
            case R.id.btn_google :
                //todo con the call principal Activ
                startActivity(startPrincIntent);
                break;
            case R.id.btn_con :
                //todo con the call principal Activ
                startActivity(startPrincIntent);
                break;

        }

    }
}
