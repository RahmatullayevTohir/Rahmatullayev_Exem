package com.example.rahmatullayev_exem.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rahmatullayev_exem.R;
import com.example.rahmatullayev_exem.listener.onButtomReachedListener;
import com.example.rahmatullayev_exem.user.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<User> users;

    public CustomAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_one,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);
    }
    @Override
    public int getItemCount() {
        return users.size();
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(View view) {
            super(view);
        }
    }

    public void setUsers(List<User> students) {
        this.users.addAll(students);
        notifyDataSetChanged();
    }
}