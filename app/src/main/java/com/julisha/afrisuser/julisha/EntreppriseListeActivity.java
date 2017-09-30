package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.julisha.afrisuser.julisha.data.CustomListAdapter;

public class EntreppriseListeActivity extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Bralima",
            "Orange",
            "Africell",
            "Equity",
            "Airtel",
            "Vodacom",
            "SCPT",
            "SNEL"
    };


    Integer[] imgid={
            R.drawable.pic_bralima,
            R.drawable.pic_orange,
            R.drawable.pic_africel,
            R.drawable.pic_equity,
            R.drawable.pic_airtel,
            R.drawable.pic_vodacom,
            R.drawable.pic_scpt,
            R.drawable.pic_snel   };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepprise_liste);
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                Intent intentEntreprise;
                intentEntreprise=new Intent(EntreppriseListeActivity.this,EntrepriseViewActivity.class);
                intentEntreprise.putExtra("position",+position);
                startActivity(intentEntreprise);



            }
        });
    }
}
