package com.binoccoder.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<User> userList;
    Context context;

    public MyAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_user, parent,false);
       MyViewHolder holder=new MyViewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.userName.setText(userList.get(position).getName());
        holder.userDate.setText(String.valueOf(userList.get(position).getDateOfElection()));
        Glide.with(this.context).load(userList.get(position).getImageUrl()).into(holder.userImage);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView userImage;
        TextView userName, userDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage=itemView.findViewById(R.id.iv_one_line_userImage);
            userName=itemView.findViewById(R.id.tv_one_line_user_name);
            userDate=itemView.findViewById(R.id.tv_one_line_user_date);
        }
    }
}
