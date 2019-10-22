package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserRcAdapter
        extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
   class MyHolder extends RecyclerView.ViewHolder{
        TextView nameTv;
        TextView ageTv;
        Button deleteBtn;
       public MyHolder(@NonNull View itemView) {
           super(itemView);
           nameTv=itemView.findViewById(R.id.nameTv);
           ageTv=itemView.findViewById(R.id.ageTv);
           deleteBtn=itemView.findViewById(R.id.deleteBtn);

       }
   }

    private List<User> users;

    public UserRcAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyHolder holder=null;
       View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_layout,parent,false);
       holder=new MyHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder holder1=(MyHolder)holder;
        User user=users.get(position);
        holder1.nameTv.setText(user.getUname());
        holder1.ageTv.setText(user.getAge()+"");
        holder1.deleteBtn.setTag(position);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

}
