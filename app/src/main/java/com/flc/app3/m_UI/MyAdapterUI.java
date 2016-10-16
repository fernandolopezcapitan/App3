package com.flc.app3.m_UI;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flc.app3.R;
import com.flc.app3.ScrollingJornadaActivity;
import com.flc.app3.pojo.Jornada;

import java.util.ArrayList;

/**
 * Created by Fernando López on 15/10/2016.
 */

public class MyAdapterUI extends RecyclerView.Adapter<MyViewHolderUI>{

    Context c;
    private ArrayList<Jornada> jornadaArrayList;

    public MyAdapterUI(Context c, ArrayList<Jornada> jornadaArrayList) {
        this.c = c;
        this.jornadaArrayList = jornadaArrayList;
    }

    @Override
    public MyViewHolderUI onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.recycler_item_jornada, parent, false);
        return new MyViewHolderUI(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolderUI holder, int position) {
        holder.tv_nombre_jornada.setText(jornadaArrayList.get(position).getNombre());
        holder.tv_puntos.setText(jornadaArrayList.get(position).getPtsEncabezado());
        holder.tv_jugador1.setText(jornadaArrayList.get(position).getJugLocal1());
        holder.tv_jugador2.setText(jornadaArrayList.get(position).getJugVisi1());
        holder.tv_jugador3.setText(jornadaArrayList.get(position).getJugLocal2());
        holder.tv_jugador4.setText(jornadaArrayList.get(position).getJugVisi2());
        holder.tv_jugador5.setText(jornadaArrayList.get(position).getDescansa());
        holder.tv_jugado.setText(jornadaArrayList.get(position).getCommentJugada());
        //holder.mTextView.setText(mDataset.get(i).getCiudad());
        //holder.imagenCiudad.setImageResource(mDataset.get(i).getImagen());
        //holder.puntuacionTextView.setText(String.valueOf(mDataset.get(i).getPuntuacion()));
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(c,ScrollingJornadaActivity.class);
                //String objectId = mDataset.get(i).getObjectId();
                //intent.putExtra("objectId",objectId);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return jornadaArrayList.size();
    }
}
