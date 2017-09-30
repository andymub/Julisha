package com.julisha.afrisuser.julisha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.julisha.afrisuser.julisha.data.CustomList;

public class FinanceActivity extends AppCompatActivity {
    ListView list;
    String[] web = {
            "OFFRE DE FINANCEMENT ECOBANK GROUP ",
            "OFFRE DE FINANCEMENT Boostmyshop",
            "offre de microcred ",
            "offre de finacement ",
            "OFFRE DE FMI",
            "OFFRE DE LA RAWBANK",
            "OFFRE DE LA BCDC"
    } ;

    String[] web2 = {
            "Domaine de sécurité banquaire",
            "Domaine de vente en ligne",
            "Domaine de l'elevage et agriculture",
            "Sport",
            "Publicité et Media",
            "Assurance",
            "Artisanat"
    } ;

    String[] web3 = {
            "500 USD",
            "18 547 EUR",
            "14 544 554 534 FC",
            "5048 USD",
            "2 541 USD",
            "1 500 USD",
            "524 USD"
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finance);
        CustomList adapter = new
                CustomList(FinanceActivity.this, web, web2,web3);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(FinanceActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}