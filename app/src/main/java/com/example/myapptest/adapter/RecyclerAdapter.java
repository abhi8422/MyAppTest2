package com.example.myapptest.adapter;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapptest.R;
import com.example.myapptest.model.Results;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    Results[] results;

    public RecyclerAdapter(Results[] results) {
        this.results = results;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_value,viewGroup,false);
        return new RecyclerViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        Results result=results[i];
        recyclerViewHolder.name.setText(result.getName());
        recyclerViewHolder.members.setText(result.getMembers());
        recyclerViewHolder.info.setText(Html.fromHtml(result.getDescription(),Html.FROM_HTML_MODE_COMPACT));

    }

    @Override
    public int getItemCount() {
        return results.length;
    }
}
