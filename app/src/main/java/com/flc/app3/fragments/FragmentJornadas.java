package com.flc.app3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flc.app3.R;
import com.flc.app3.adapter.MyAdapter;
import com.flc.app3.pojo.ItemViaje;
import com.flc.app3.pojo.Jornada;

import java.util.ArrayList;


public class FragmentJornadas extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Jornada> listaJornadas;

    public FragmentJornadas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jornadas, container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);

        // Si tenemos claro que el layout que hemos utilizado
        // para pintar un elemento de la lista, no varía de dimensiones
        // es recomendable poner la siguiente línea de código, que
        // permite al recycler saber que las dimensiones no cambian
        // y por tanto se ahorra el tener que hacer cálculos a la
        // hora de reutilizar las vistas
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //TextView ejemplo = (TextView)v.findViewById(R.id.textViewEjemplo);
        //ejemplo.setText("Jornadas");


        listaJornadas = new ArrayList();
        listaJornadas.add(new Jornada("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));
        listaJornadas.add(new Jornada("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));
        listaJornadas.add(new Jornada("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));


        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(listaJornadas);
        mRecyclerView.setAdapter(mAdapter);

        // CON ESTA LÍNEA DE CÓDIGO INDICO QUE ESTE FRAGMENT
        // TIENE UN MENÚ DE OPCIONES QUE DEBE SOBREESCRIBIR AL DEL ACTIVITY
        setHasOptionsMenu(true);
        return v;
    }

}
