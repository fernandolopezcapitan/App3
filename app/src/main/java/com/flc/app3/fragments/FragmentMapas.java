package com.flc.app3.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flc.app3.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMapas extends Fragment {


    public FragmentMapas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mapas, container, false);

        TextView ejemplo = (TextView)v.findViewById(R.id.textViewEjemplo);
        ejemplo.setText("Mapas");

        // CON ESTA LÍNEA DE CÓDIGO INDICO QUE ESTE FRAGMENT
        // TIENE UN MENÚ DE OPCIONES QUE DEBE SOBREESCRIBIR AL DEL ACTIVITY
        setHasOptionsMenu(true);
        return v;
    }

}
