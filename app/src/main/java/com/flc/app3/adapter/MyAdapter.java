package com.flc.app3.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flc.app3.R;
import com.flc.app3.ScrollingJornadaActivity;
import com.flc.app3.pojo.JornadaVieja;

import java.util.ArrayList;

/**
 * Created by Fernando López on 07/10/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.JornadaViewHolder>{

    Context context;
    private ArrayList<JornadaVieja> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class JornadaViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tv_nombre_jornada;
        public TextView tv_puntos;
        public TextView tv_ejercito1;
        public TextView tv_ejercito2;
        public TextView tv_ejercito3;
        public TextView tv_ejercito4;
        public TextView tv_ejercito5;
        public TextView tv_jugado;
        public View mView;
        //public ImageView imagenCiudad;

        public JornadaViewHolder(View v) {

            super(v);
            mView = v;
            tv_nombre_jornada = (TextView) v.findViewById(R.id.tv_nombre_jornada);
            tv_puntos = (TextView) v.findViewById(R.id.tv_puntos);
            tv_ejercito1 = (TextView) v.findViewById(R.id.tv_jugador1);
            tv_ejercito2 = (TextView) v.findViewById(R.id.tv_jugador2);
            tv_ejercito3 = (TextView) v.findViewById(R.id.tv_jugador3);
            tv_ejercito4 = (TextView) v.findViewById(R.id.tv_jugador4);
            tv_ejercito5 = (TextView) v.findViewById(R.id.tv_jugador5);
            tv_jugado = (TextView) v.findViewById(R.id.tv_jugado);

            //imagenCiudad = (ImageView)v.findViewById(R.id.imagen_ciudad);

        }
    }
    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<JornadaVieja> myDataset) {
        mDataset = myDataset;
    }
    // Create new views (invoked by the layout manager)
    @Override
    public JornadaViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_jornada, parent, false);
        // set the view's size, margins, paddings and layout parameters
        context = v.getContext();
        JornadaViewHolder vh = new JornadaViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(JornadaViewHolder holder, int i) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.tv_nombre_jornada.setText(mDataset.get(i).getNombre());
        holder.tv_puntos.setText(mDataset.get(i).getPts());
        holder.tv_ejercito1.setText(mDataset.get(i).getEj1());
        holder.tv_ejercito2.setText(mDataset.get(i).getEj2());
        holder.tv_ejercito3.setText(mDataset.get(i).getEj3());
        holder.tv_ejercito4.setText(mDataset.get(i).getEj4());
        holder.tv_ejercito5.setText(mDataset.get(i).getE5());
        holder.tv_jugado.setText(mDataset.get(i).getComment());
        //holder.mTextView.setText(mDataset.get(i).getCiudad());
        //holder.imagenCiudad.setImageResource(mDataset.get(i).getImagen());
        //holder.puntuacionTextView.setText(String.valueOf(mDataset.get(i).getPuntuacion()));
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,ScrollingJornadaActivity.class);
                //String objectId = mDataset.get(i).getObjectId();
                //intent.putExtra("objectId",objectId);
                context.startActivity(intent);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
