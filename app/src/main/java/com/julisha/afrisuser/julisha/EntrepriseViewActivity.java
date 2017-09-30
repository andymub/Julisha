package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EntrepriseViewActivity extends AppCompatActivity {

    int position=0;
    String title []={
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
    String subTitlepays[]={"R.D.CONGO","Paris, France","","","","","","."};
    String category[]={"Brasserie"," Entreprise de téléphonie mobile","Entreprise de téléphonie mobile","","Entreprise de téléphonie mobile","Entreprise de téléphonie mobile","","."};
    String produits[]={"Principales bières : Primus Turbo King Mützig","Services de télécominication","Services de télécominication",
            "","Services de télécominication","Services de télécominication","","",""};
    String année[]={"1923","2001","2001","2014","1995","1991","19","1970"};
    String Description[]={"Bralima (acronyme de Brasseries, Limonaderies et Malteries),anciennement connue sous le nom de « Brasserie de Léopoldville »1 ou « Brasserie Léo »2, est une entreprise brassicole établie à Kinshasa, en République démocratique du Congo."
            +"Bralima est aujourd'hui une filiale de Heineken et possède des unités de production, outre Kinshasha, dans les villes de Bukavu, Kisangani, Boma, Mbandaka et Lubumbashi. Ses produits sont distribués dans l'ensemble du pays"
    ,"Congo Chine Télécoms est une entreprise de téléphonie mobile en République démocratique du Congo. Fruit de la collaboration entre la Chine et le Congo, la compagnie ouvre son réseau en décembre 2001"};
    TextView itemtitle,itemSub,txtCaracteri,txtproduits,txtDescrition;
    ImageView iconEntrepriseDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entreprise_view);
        Intent intent = getIntent();
        int p = intent.getIntExtra("position",0);
        position=p;
        itemtitle= (TextView)findViewById(R.id.itemtitle) ;
        itemSub=(TextView)findViewById(R.id.itemSub) ;
        txtproduits=(TextView)findViewById(R.id.txtproduits);
        txtCaracteri=(TextView)findViewById(R.id.txtCaracteri) ;
        txtDescrition=(TextView)findViewById(R.id.txtDescrition) ;
        iconEntrepriseDes=(ImageView)findViewById(R.id.iconEntrepriseDes);

        itemtitle.setText(title[position]);
        itemSub.setText("-Année :" + année[position] +"- Pays :"+subTitlepays[position]);
        txtCaracteri.setText(category[position]);
        txtproduits.setText(produits[position]);
        txtDescrition.setText(Description[position]);
        iconEntrepriseDes.setImageResource(imgid[position]);



    }
}
