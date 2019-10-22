package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    List<User> users;
    UserRcAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        users=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User u=new User();
            u.setUname("john"+i);
            u.setAge(i);
            users.add(u);
        }

        RecyclerView rv=findViewById(R.id.rv);
        adapter=new UserRcAdapter(users);
        LinearLayoutManager manager=new LinearLayoutManager(this);
       // manager.setOrientation(RecyclerView.Orientation.);
       rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
    }

    public void delete(View view){
        int index=(Integer) view.getTag();
        users.remove(index);
        adapter.notifyDataSetChanged();
    }
}
