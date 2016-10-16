package com.flc.app3.m_FireBase;

import com.flc.app3.pojo.Jornada;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

/**
 * Created by Fernando López on 15/10/2016.
 */

public class FirebaseHelper {
    DatabaseReference db;
    Boolean saved = true; //null
    ArrayList<Jornada> jornadaArrayList = new ArrayList<>();

    // Pass DataBase reference
    public FirebaseHelper(DatabaseReference db) {
        this.db = db;
    }

    // Write if not null
    public Boolean save (Jornada jornada){
        if(jornada == null){
            saved = false;
        }else{
            try {
                db.child("jornadas").push().setValue(jornada);
                saved = true;
            }catch (DatabaseException e){
                e.printStackTrace();
                saved = false;
            }
        }
        return saved;
    }

    //Implement fetch data and fill arraylist
    public void fetchData (DataSnapshot dataSnapshot){
        jornadaArrayList = new ArrayList<>();
        for (DataSnapshot ds : dataSnapshot.getChildren()){
            Jornada jornada = ds.getValue(Jornada.class);
            jornadaArrayList.add(jornada);
        }
    }

    // Read by hooking onto database operation callbacks
    // Leer enganchando en las devoluciones de llamada operación de base de datos
    public ArrayList<Jornada> retrieve (){
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return jornadaArrayList;
    }

}
