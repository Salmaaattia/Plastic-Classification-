package com.example.camerapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity3 extends AppCompatActivity {

    ListView fields;
    Map<String, Object> map = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        String className =  (String) data.get("class");


        FirebaseFirestore db = FirebaseFirestore.getInstance();
        fields = findViewById(R.id.mobile_list);
        final ArrayList<String> arrayList= new ArrayList<>();
        final ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        fields.setAdapter(arrayAdapter);

        fields.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String indx = arrayList.get(position);
                String value = (String) map.get(indx);
                Intent i = new Intent(Activity3.this,  activity4.class);
                i.putExtra("data", value);
                startActivity(i);
            }
        });
        DocumentReference docRef = db.collection("Plastic Products").document(className);
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Log.d("test", "DocumentSnapshot data: " + document.getData());
                        map = document.getData();
                        List<String> keys = new ArrayList<String>(document.getData().keySet());
                        for(String key : keys){
                            Log.d("test", key);
                            arrayList.add(key);
                            arrayAdapter.notifyDataSetChanged();
                        }
                    } else {
                        Log.d("test", "No such document");
                    }
                } else {
                    Log.d("test", "get failed with ", task.getException());
                }
            }
        });


    }
}
