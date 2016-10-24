package com.flc.app3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class ScrollingJornadaActivity extends AppCompatActivity {

    ImageView imgBar, icL1, icV1, icL2, icV2;
    Toolbar toolbar;
    TextView ptsJornada, ejL1, ejV1, map1, venc1, res1, dif1, fech1, yutu1, ejL2, ejV2, map2, venc2, res2, dif2, fech2, yutu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_jornada);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // no se pone en horizontal

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        imgBar = (ImageView) findViewById(R.id.img_logo_scroll);
        ptsJornada = (TextView) findViewById(R.id.scroll_j_pts);

        ejL1 = (TextView) findViewById(R.id.scroll_j_ejLocal1);
        ejV1 = (TextView) findViewById(R.id.scroll_j_ejVis1);
        icL1 = (ImageView) findViewById(R.id.scroll_j_iconLocal1);
        icV1 = (ImageView) findViewById(R.id.scroll_j_iconVis1);
        map1 = (TextView) findViewById(R.id.scroll_j_mapa1);
        venc1 = (TextView) findViewById(R.id.scroll_j_winner1);
        res1 = (TextView) findViewById(R.id.scroll_j_resultado1);
        dif1 = (TextView) findViewById(R.id.scroll_j_dif1);
        fech1 = (TextView) findViewById(R.id.scroll_j_fecha1);
        yutu1 = (TextView) findViewById(R.id.scroll_j_youtube1);

        ejL2 = (TextView) findViewById(R.id.scroll_j_ejLocal2);
        ejV2 = (TextView) findViewById(R.id.scroll_j_ejVis2);
        icL2 = (ImageView) findViewById(R.id.scroll_j_iconLocal2);
        icV2 = (ImageView) findViewById(R.id.scroll_j_iconVis2);
        map2 = (TextView) findViewById(R.id.scroll_j_mapa2);
        venc2 = (TextView) findViewById(R.id.scroll_j_winner2);
        res2 = (TextView) findViewById(R.id.scroll_j_resultado2);
        dif2 = (TextView) findViewById(R.id.scroll_j_dif2);
        fech2 = (TextView) findViewById(R.id.scroll_j_fecha2);
        yutu2 = (TextView) findViewById(R.id.scroll_j_youtube2);

        String nombre = "TítuloJornada";
        String img = "https://firebasestorage.googleapis.com/v0/b/liga-wkhl.appspot.com/o/nofound.jpg?alt=media&token=1a399034-35f5-497e-866a-fbec88c85875"; //img de la dama del lago
        String ptsEncabezado = "puntos";

        String ejerLocal1 = "EjLocal1";
        String ejerVisi1 = "EjVisi1";
        String mapa1 = "Mapa";
        String vencedor1 = "vencedor1";
        String result1 = "0 - 0";
        String diff1 = "+ 0 puntos";
        String fecha1 = "00/00/00";
        String youtube1 = "link1";

        String ejerLocal2 = "EjLocal2";
        String ejerVisi2 = "EjVisi2";
        String mapa2 = "Mapa";
        String vencedor2 = "vencedor2";
        String result2 = "0 - 0";
        String diff2 = "+ 0 puntos";
        String fecha2 = "00/00/00";
        String youtube2 = "link2";

        // pasar parámetros a otro intent
        Bundle datosFragmentJornadas = this.getIntent().getExtras();
        if(datosFragmentJornadas != null ){
            nombre = datosFragmentJornadas.getString("nombre");
            img = datosFragmentJornadas.getString("img");
            ptsEncabezado = datosFragmentJornadas.getString("ptsEncabezado");

            ejerLocal1 = datosFragmentJornadas.getString("ejerLocal1");
            ejerVisi1 = datosFragmentJornadas.getString("ejerVisi1");
            mapa1 = datosFragmentJornadas.getString("mapa1");
            vencedor1 = datosFragmentJornadas.getString("vencedor1");
            result1 = String.valueOf(datosFragmentJornadas.getInt("ptsLocal1"))+" - "+String.valueOf(datosFragmentJornadas.getInt("ptsVisi1"));
            diff1 = "+ "+String.valueOf(datosFragmentJornadas.getInt("dif1"))+" puntos";
            fecha1 = datosFragmentJornadas.getString("fecha1");
            youtube1 = datosFragmentJornadas.getString("youtube1");

            ejerLocal2 = datosFragmentJornadas.getString("ejerLocal2");
            ejerVisi2 = datosFragmentJornadas.getString("ejerVisi2");
            mapa2 = datosFragmentJornadas.getString("mapa2");
            vencedor2 = datosFragmentJornadas.getString("vencedor2");
            result2 = String.valueOf(datosFragmentJornadas.getInt("ptsLocal2"))+" - "+String.valueOf(datosFragmentJornadas.getInt("ptsVisi2"));
            diff2 = "+ "+String.valueOf(datosFragmentJornadas.getInt("dif2"))+" puntos";
            fecha2 = datosFragmentJornadas.getString("fecha2");
            youtube2 = datosFragmentJornadas.getString("youtube2");
        }

        toolbar.setTitle(nombre);
        setSupportActionBar(toolbar);
        Picasso.with(ScrollingJornadaActivity.this).load(img).fit().into(imgBar);
        ptsJornada.setText(ptsEncabezado);

        ejL1.setText(ejerLocal1);
        ejV1.setText(ejerVisi1);
        Picasso.with(ScrollingJornadaActivity.this).load(iconEj(ejerLocal1)).into(icL1);
        Picasso.with(ScrollingJornadaActivity.this).load(iconEj(ejerVisi1)).into(icV1);
        map1.setText(mapa1);
        venc1.setText(vencedor1);
        res1.setText(result1);
        dif1.setText(diff1);
        fech1.setText(fecha1);
        yutu1.setText(youtube1);

        ejL2.setText(ejerLocal2);
        ejV2.setText(ejerVisi2);
        Picasso.with(ScrollingJornadaActivity.this).load(iconEj(ejerLocal2)).into(icL2);
        Picasso.with(ScrollingJornadaActivity.this).load(iconEj(ejerVisi2)).into(icV2);
        map2.setText(mapa2);
        venc2.setText(vencedor2);
        res2.setText(result2);
        dif2.setText(diff2);
        fech2.setText(fecha2);
        yutu2.setText(youtube2);


        //holder.img_jornada.setImageResource(mDataset.get(i).getImagen());
        //Glide.with(ScrollingJornadaActivity.this).load(R.drawable.imgmontfort).centerCrop().placeholder(R.drawable.fondologin1).into(imgBar);
        //Picasso.with(ScrollingJornadaActivity.this).load(R.drawable.imgmontfort).fit().placeholder(R.drawable.logoconletra).into(imgBar);
        //Picasso.with(ScrollingJornadaActivity.this).load(this.iconEj("Enanos"));


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Intent intent = new Intent(this,TabsActivity.class);
        startActivity(intent);
        this.finish();
    }

    public int iconEj(String ej){
        int result = R.drawable.ic_nofound;
        switch (ej){
            case "Enanos": result = R.drawable.ic_enanos;
                break;
            case "Altos elfos": result = R.drawable.ic_highbornelves;
                break;
            case "Bretonia": result = R.drawable.ic_bretonia;
                break;
            case "Condes vampiros": result = R.drawable.ic_condesvampiros;
                break;
            case "Condes vampiro": result = R.drawable.ic_condesvampiros;
                break;
            case "Orcos&Goblins": result = R.drawable.ic_orcandgoblins;
                break;
            default: result = R.drawable.ic_nofound;
        }
        return result;
    }
}
