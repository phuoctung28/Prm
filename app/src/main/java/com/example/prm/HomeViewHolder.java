package com.example.prm;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTextView;

    public HomeViewHolder(@NonNull View itemView, HomeListAdapter adapter) {
        super(itemView);

        homeItemView = itemView.findViewById(R.id.home_item);

        this.mAdapter = adapter;

        itemView.setOnClickListener(this);
    }

    public void bind(String name) {
        nameTextView.setText(name);
    }

    @Override
    public void onClick(View view) {

    }

}
