package com.flc.app3.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.flc.app3.R;
import com.flc.app3.ScrollingJornadaActivity;
import com.flc.app3.TabsActivity;
import com.flc.app3.m_FireBase.FirebaseHelper;
import com.flc.app3.m_UI.MyAdapterUI;
import com.flc.app3.m_UI.MyViewHolderUI;
import com.flc.app3.pojo.Jornada;
import com.flc.app3.pojo.JornadaVieja;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class FragmentJornadas extends Fragment {

    //DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    //DatabaseReference mRef = ref.child("jornadas");
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://liga-wkhl.firebaseio.com/jornadas");

    private ArrayList<Jornada> mItems = new ArrayList<>();
    //private ListView mListView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<JornadaVieja> listaJornadas;


    // Instrucciones tutorial
    DatabaseReference db;
    FirebaseHelper helper;
    MyAdapterUI adapterUI;
    RecyclerView rv;

    // (End) Instrucciones tutorial

    public FragmentJornadas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jornadas, container, false);

        // Instrucciones tutorial
        // Inicializar rv
        rv = (RecyclerView) v.findViewById(R.id.recyclerView_Jornadas);

        //rv.setHasFixedSize(true); // permite al recycler saber que las dimensiones no cambian
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        //Inicializar firebase
        db = FirebaseDatabase.getInstance().getReference();
        helper = new FirebaseHelper(db);

        // AdapterUI
        adapterUI = new MyAdapterUI(getContext(),helper.retrieve());
        rv.setAdapter(adapterUI);
        // (End) Instrucciones tutorial

        setHasOptionsMenu(true); // Indica que este fragment tiene un menú de opciones que debe sobreescribir al del activity
        //Toast.makeText(getContext(),"ArrayListJornada: "+helper.retrieve().size(),Toast.LENGTH_SHORT).show();
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        db = db.child("jornadas");
        FirebaseRecyclerAdapter<Jornada,MyViewHolder_UI> adapter = new FirebaseRecyclerAdapter<Jornada, MyViewHolder_UI>(Jornada.class,R.layout.recycler_item_jornada,MyViewHolder_UI.class,db) {
            @Override
            protected void populateViewHolder(MyViewHolder_UI holder, final Jornada model, int position) {
                holder.tv_nombre_jornada.setText(model.getNombre());
                holder.tv_puntos.setText(model.getPtsEncabezado());
                holder.tv_jugador1.setText(model.getJugLocal1());
                holder.tv_jugador2.setText(model.getJugVisi1());
                holder.tv_jugador3.setText(model.getJugLocal2());
                holder.tv_jugador4.setText(model.getJugVisi2());
                holder.tv_jugador5.setText(model.getDescansa());
                holder.tv_jugado.setText(model.getCommentJugada());
                Picasso.with(getContext()).load(model.getImg()).resize(75,75).centerCrop().into(holder.tv_img);
                //holder.mTextView.setText(mDataset.get(i).getCiudad());
                //holder.imagenCiudad.setImageResource(mDataset.get(i).getImagen());
                //holder.puntuacionTextView.setText(String.valueOf(mDataset.get(i).getPuntuacion()));

                if(model.getJugLocal1().equalsIgnoreCase("-")){
                    holder.l1.setVisibility(View.INVISIBLE);
                    holder.l3.setVisibility(View.INVISIBLE);
                }

                holder.mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getContext(),ScrollingJornadaActivity.class);
                        //String objectId = mDataset.get(i).getObjectId();
                        //intent.putExtra("objectId",objectId);

                        // pasar parámetros a otro intent
                        intent.putExtra("nombre", model.getNombre());
                        intent.putExtra("img", model.getImg());
                        intent.putExtra("ptsEncabezado", model.getPtsEncabezado());

                        intent.putExtra("jugLocal1", model.getJugLocal1());
                        intent.putExtra("jugVisi1", model.getJugVisi1());
                        intent.putExtra("jugLocal2", model.getJugLocal2());
                        intent.putExtra("jugVisi2", model.getJugVisi2());
                        intent.putExtra("descansa", model.getDescansa());
                        intent.putExtra("jugada", model.isJugada());
                        intent.putExtra("commentJugada", model.getCommentJugada());

                        intent.putExtra("ejerLocal1", model.getEjerLocal1());
                        intent.putExtra("ejerVisi1", model.getEjerVisi1());
                        intent.putExtra("mapa1", model.getMapa1());
                        intent.putExtra("vencedor1", model.getVencedor1());
                        intent.putExtra("ptsLocal1", model.getPtsLocal1());
                        intent.putExtra("ptsVisi1", model.getPtsVisi1());
                        intent.putExtra("dif1", model.getDif1());
                        intent.putExtra("fecha1", model.getFecha1());
                        intent.putExtra("youtube1", model.getYoutube1());
                        intent.putExtra("comment1", model.getComment1());

                        intent.putExtra("ejerLocal2", model.getEjerLocal2());
                        intent.putExtra("ejerVisi2", model.getEjerVisi2());
                        intent.putExtra("mapa2", model.getMapa2());
                        intent.putExtra("vencedor2", model.getVencedor2());
                        intent.putExtra("ptsLocal2", model.getPtsLocal2());
                        intent.putExtra("ptsVisi2", model.getPtsVisi2());
                        intent.putExtra("dif2", model.getDif2());
                        intent.putExtra("fecha2", model.getFecha2());
                        intent.putExtra("youtube2", model.getYoutube2());
                        intent.putExtra("comment2", model.getComment2());



                        getContext().startActivity(intent);
                        getActivity().finish();

                    }
                });
            }
        };
        rv.setAdapter(adapter);

    }

    public static class MyViewHolder_UI extends RecyclerView.ViewHolder{
        public TextView tv_nombre_jornada;
        public TextView tv_puntos;
        public TextView tv_jugador1;
        public TextView tv_jugador2;
        public TextView tv_jugador3;
        public TextView tv_jugador4;
        public TextView tv_jugador5;
        public TextView tv_jugado;
        public ImageView tv_img;
        public View mView;
        public LinearLayout l1, l2, l3;

        public MyViewHolder_UI(View v) {
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
            tv_img = (ImageView) v.findViewById(R.id.img_jornada);
            l1 = (LinearLayout) v.findViewById(R.id.linear1);
            l2 = (LinearLayout) v.findViewById(R.id.linear2);
            l3 = (LinearLayout) v.findViewById(R.id.linear3);
        }
    }



}
