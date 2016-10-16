package com.flc.app3.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.flc.app3.R;

/**
 * Created by Fernando López on 15/10/2016.
 */

public class MyViewHolderUI extends RecyclerView.ViewHolder{
    public TextView tv_nombre_jornada;
    public TextView tv_puntos;
    public TextView tv_jugador1;
    public TextView tv_jugador2;
    public TextView tv_jugador3;
    public TextView tv_jugador4;
    public TextView tv_jugador5;
    public TextView tv_jugado;
    public View mView;

    public MyViewHolderUI(View v) {
        super(v);
        mView = v;
        tv_nombre_jornada = (TextView) v.findViewById(R.id.tv_nombre_jornada);
        tv_puntos = (TextView) v.findViewById(R.id.tv_puntos);
        tv_jugador1 = (TextView) v.findViewById(R.id.tv_jugador1);
        tv_jugador2 = (TextView) v.findViewById(R.id.tv_jugador2);
        tv_jugador3 = (TextView) v.findViewById(R.id.tv_jugador3);
        tv_jugador4 = (TextView) v.findViewById(R.id.tv_jugador4);
        tv_jugador5 = (TextView) v.findViewById(R.id.tv_jugador5);
        tv_jugado = (TextView) v.findViewById(R.id.tv_jugado);
    }
}
