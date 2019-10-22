package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {
    private List<User> users;
    private int rs;
    public UserAdapter(@NonNull Context context, int resource,List<User> users) {
        super(context, resource);
        this.rs=resource;
        this.users=users;
    }


    @Override
    public int getCount() {
        return users.size();
    }

    @Nullable
    @Override
    public User getItem(int position) {
        return users.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        if(convertView==null) {
            Log.i("中", position + ".....");
            convertView = LayoutInflater.from(this.getContext()).inflate(this.rs, parent, false);
            TextView nameTv=convertView.findViewById(R.id.nameTv);
            TextView ageTv=convertView.findViewById(R.id.ageTv);
            convertView.setTag(R.id.nameTv,nameTv);
            convertView.setTag(R.id.ageTv,ageTv);
        }

        User user= getItem(position);
        ((TextView)convertView.getTag(R.id.nameTv)).setText(user.getUname());
        ((TextView)convertView.getTag(R.id.ageTv)).setText(user.getAge()+"");

        return convertView;
    }
}
