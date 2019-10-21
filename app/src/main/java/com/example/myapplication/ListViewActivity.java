package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private ListView lv;
    List<User> users=new ArrayList<>();
    UserAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        lv=findViewById(R.id.lv);


        for (int i = 0; i < 10; i++) {
            User u=new User();
            u.setUname("john"+i);
            u.setAge(i);
            users.add(u);
        }


//        ArrayAdapter<String> adapter
//                =new ArrayAdapter<String>(this,R.layout.text_layout,data);
        adapter=new UserAdapter(this,R.layout.user_layout,users);
        lv.setAdapter(adapter);


    }

    public void delete(View view) {
        users.remove(0);
        adapter.notifyDataSetChanged();

    }
}
