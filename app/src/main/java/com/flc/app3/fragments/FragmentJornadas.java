package com.flc.app3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flc.app3.R;


public class FragmentJornadas extends Fragment {

    public FragmentJornadas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jornadas, container, false);

        TextView ejemplo = (TextView)v.findViewById(R.id.textViewEjemplo);
        ejemplo.setText("Jornadas");

        // CON ESTA LÍNEA DE CÓDIGO INDICO QUE ESTE FRAGMENT
        // TIENE UN MENÚ DE OPCIONES QUE DEBE SOBREESCRIBIR AL DEL ACTIVITY
        setHasOptionsMenu(true);
        return v;
    }

}
