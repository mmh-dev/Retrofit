package com.example.retrofit2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter <RepoAdapter.Holder> {

    List<Repo> repoList;
    Context context;

    public RepoAdapter (Context context, List<Repo> repoList){
        this.repoList = repoList;
        this.context = context;
    }

    public static class Holder extends RecyclerView.ViewHolder {

        TextView name, link;
        ImageView avatar;

        public Holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            link = itemView.findViewById(R.id.link);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.repo_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoAdapter.Holder holder, int position) {
        holder.name.setText(repoList.get(position).getName());
        holder.link.setText(repoList.get(position).getLink());

        Picasso.get()
                .load(repoList.get(position).getOwner().getAvatarUrl())
                .into(holder.avatar);
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }
}
