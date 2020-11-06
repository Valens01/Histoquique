package com.example.histoquique;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    DatabaseReference mrefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listview);

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YY  hh:mm:ss a ");
        final String  today = dateFormat.format(date).toString();

        ArrayList<Story> arrayList= new ArrayList<>();


      //  arrayList.add(new Story("Math","vous avez payer une somme",today,"HTG","5678"));

        mrefs = FirebaseDatabase.getInstance().getReference();

        mrefs.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {



            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });







        StoryAdaptor storyAdaptor = new StoryAdaptor(this,R.layout.list_row,arrayList);

        listView.setAdapter(storyAdaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"click",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,HistoriqueDetail.class);
                startActivity(intent);

            }
        });



    }





}