package com.flc.app3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ScrollingJornadaActivity extends AppCompatActivity {

    ImageView imgBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_jornada);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgBar = (ImageView) findViewById(R.id.img_logo_scroll);

        //holder.img_jornada.setImageResource(mDataset.get(i).getImagen());
        //Glide.with(ScrollingJornadaActivity.this).load(R.drawable.imgmontfort).centerCrop().placeholder(R.drawable.fondologin1).into(imgBar);
        //Picasso.with(ScrollingJornadaActivity.this).load(R.drawable.imgmontfort).fit().placeholder(R.drawable.fondologin1).into(imgBar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
