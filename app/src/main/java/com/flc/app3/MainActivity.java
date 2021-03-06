package com.flc.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.flc.app3.pojo.Batalla;
import com.flc.app3.pojo.Jornada;
import com.flc.app3.pojo.Post;
import com.flc.app3.pojo.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button ir;
    Button meterDatos;
    private TextView mensajeTextView;
    private EditText mensajeEditView;
    private EditText userId;
    private EditText userName;
    private EditText title;

    DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mensajeRef = ref.child("mensaje");
    DatabaseReference userRef = ref.child("user");
    DatabaseReference postRef = ref.child("post");
    DatabaseReference jornadasRef = ref.child("jornadas");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ir = (Button) findViewById(R.id.button);
        meterDatos = (Button) findViewById(R.id.id_meterdatos);
        mensajeTextView = (TextView) findViewById(R.id.mensajeTextView);
        mensajeEditView = (EditText) findViewById(R.id.mensajeEditView);
        userId = (EditText) findViewById(R.id.id_userid);
        userName = (EditText) findViewById(R.id.id_username);
        title = (EditText) findViewById(R.id.id_title);

        //Desabilitar boton de meter datos
        //meterDatos.setEnabled(false);

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TabsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        mensajeRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);

                mensajeTextView.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void modificar(View view){
        String mensaje = mensajeEditView.getText().toString();
        mensajeRef.setValue(mensaje);
        mensajeEditView.setText("");
    }

    public void meterdatos(View view){
        /*String userIdText = userId.getText().toString();
        String usernameText = userName.getText().toString();
        String titleText = title.getText().toString();
        String bodyText = "body";*/

        //writeNewPost(userIdText,usernameText,titleText,bodyText);
        //writeNewUser(userIdText,nameText,emailText);
         Jornada j1 = new Jornada();
        j1.setNombre("Jornada 3");
        j1.setImg("https://firebasestorage.googleapis.com/v0/b/liga-wkhl.appspot.com/o/torneomontfort.jpg?alt=media&token=73e69551-5095-499a-841a-d66f47011131");
        j1.setPtsEncabezado("2000 puntos");

        j1.setJugLocal1("Jky");
        j1.setJugVisi1("Luisma");
        j1.setJugLocal2("Capi");
        j1.setJugVisi2("Ale B.");
        j1.setDescansa("Ale C.");
        j1.setJugada(false);
        j1.setCommentJugada("Aún por determinar");

        //Enfrentamiento 1
        j1.setEjerLocal1("Altos elfos");
        j1.setEjerVisi1("Enanos");
        j1.setMapa1("-");
        j1.setVencedor1("-");
        j1.setPtsLocal1(0);
        j1.setPtsVisi1(0);
        j1.setDif1(0);
        j1.setFecha1("Fecha aún por fijar");
        j1.setYoutube1("link youtube");
        j1.setComment1("comentarios");

        //Enfrentamiento 2
        j1.setEjerLocal2("Bretonia");
        j1.setEjerVisi2("Condes vampiros");
        j1.setMapa2("-");
        j1.setVencedor2("-");
        j1.setPtsLocal2(0);
        j1.setPtsVisi2(0);
        j1.setDif2(0);
        j1.setFecha2("Fecha aún por fijar");
        j1.setYoutube2("link youtube");
        j1.setComment2("comentarios");

        writeNewJornada(j1);
    }

    private void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);
        userRef.child("users").child(userId).setValue(user);
    }

    private void writeNewPost(String userId, String username, String title, String body) {
        // Create new post at /user-posts/$userid/$postid and at
        // /posts/$postid simultaneously
        String key = postRef.child("posts").push().getKey();
        Post post = new Post(userId, username, title, body);
        Map<String, Object> postValues = post.toMap();

        Map<String, Object> childUpdates = new HashMap<>();
        //childUpdates.put("/posts/" + key, postValues);
        childUpdates.put(key, postValues);
        //childUpdates.put("/user-posts/" + userId + "/" + key, postValues);

        postRef.updateChildren(childUpdates);
    }

    private void writeNewJornada(Jornada jornada) {
        // Create new post at /user-posts/$userid/$postid and at
        // /posts/$postid simultaneously
        String key = jornadasRef.child("jor").push().getKey();
        //Post post = new Post(userId, username, title, body);
        Map<String, Object> postValues = jornada.toMap();

        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put(key, postValues);
        //childUpdates.put("/user-posts/" + userId + "/" + key, postValues);

        jornadasRef.updateChildren(childUpdates);
    }
}
