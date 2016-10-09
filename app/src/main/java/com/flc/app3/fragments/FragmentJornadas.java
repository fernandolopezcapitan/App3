package com.flc.app3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.flc.app3.R;
import com.flc.app3.adapter.AdapterJornada;
import com.flc.app3.adapter.MyAdapter;
import com.flc.app3.pojo.Jornada;
import com.flc.app3.pojo.JornadaVieja;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class FragmentJornadas extends Fragment {

    //DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    //DatabaseReference mRef = ref.child("jornadas");
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://liga-wkhl.firebaseio.com/jornadas");



    private ArrayList<Jornada> mItems = new ArrayList<>();
    private ListView mListView;
    //private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<JornadaVieja> listaJornadas;

    public FragmentJornadas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jornadas, container, false);

        mListView = (ListView) v.findViewById(R.id.listView);
        //mRecyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);

        // Si tenemos claro que el layout que hemos utilizado
        // para pintar un elemento de la lista, no varía de dimensiones
        // es recomendable poner la siguiente línea de código, que
        // permite al recycler saber que las dimensiones no cambian
        // y por tanto se ahorra el tener que hacer cálculos a la
        // hora de reutilizar las vistas
        //mRecyclerView.setHasFixedSize(true);
        //mLayoutManager = new LinearLayoutManager(getActivity());
        //mRecyclerView.setLayoutManager(mLayoutManager);

        //TextView ejemplo = (TextView)v.findViewById(R.id.textViewEjemplo);
        //ejemplo.setText("Jornadas");


        /*listaJornadas = new ArrayList();
        listaJornadas.add(new JornadaVieja("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));
        listaJornadas.add(new JornadaVieja("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));
        listaJornadas.add(new JornadaVieja("Jornada1","Altos elfos", "Condes vampiros", "Orcos y Goblins", "Hombres lagarto", "Bretonia", "2000 puntos", "No disputada", false));
        */

        // specify an adapter (see also next example)
        //mAdapter = new MyAdapter(listaJornadas);
        //mRecyclerView.setAdapter(mAdapter);

        // CON ESTA LÍNEA DE CÓDIGO INDICO QUE ESTE FRAGMENT
        // TIENE UN MENÚ DE OPCIONES QUE DEBE SOBREESCRIBIR AL DEL ACTIVITY
        setHasOptionsMenu(true);
        return v;
    }

    /*@Override
    public void onStart() {
        super.onStart();

        FirebaseListAdapter<Jornada> adapter = new FirebaseListAdapter<Jornada>(
                this,
                Jornada.class,
                R.layout.recycler_item_jornada,
                databaseReference
        ) {
            @Override
            protected void populateView(View view, Jornada jornada, int i) {

            }
        };

    }*/

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
            tv_ejercito1 = (TextView) v.findViewById(R.id.tv_ejercito1);
            tv_ejercito2 = (TextView) v.findViewById(R.id.tv_ejercito2);
            tv_ejercito3 = (TextView) v.findViewById(R.id.tv_ejercito3);
            tv_ejercito4 = (TextView) v.findViewById(R.id.tv_ejercito4);
            tv_ejercito5 = (TextView) v.findViewById(R.id.tv_ejercito5);
            tv_jugado = (TextView) v.findViewById(R.id.tv_jugado);
            //imagenCiudad = (ImageView)v.findViewById(R.id.imagen_ciudad);
        }
    }
}
