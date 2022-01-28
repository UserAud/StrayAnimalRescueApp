package com.example.strayanimalrescueapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.strayanimalrescueapp.R;
import com.example.strayanimalrescueapp.model.StreetStars;

import java.util.List;

public class StreetStarsAdapter extends RecyclerView.Adapter<StreetStarsAdapter.StreetStarsViewHolder> {

    Context context;
    List<StreetStars> streetStarsList;

    public StreetStarsAdapter(Context context, List<StreetStars> streetStarsList) {
        this.context = context;
        this.streetStarsList = streetStarsList;
    }

    @NonNull
    @Override
    public StreetStarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_street_stars, parent, false);
        return new StreetStarsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StreetStarsViewHolder holder, int position) {

        holder.streetStarsView.setImageResource(streetStarsList.get(position).getImageurl());
    }

    @Override
    public int getItemCount() {
        return streetStarsList.size();
    }

    public static class StreetStarsViewHolder extends RecyclerView.ViewHolder{

        ImageView streetStarsView;
        public StreetStarsViewHolder(@NonNull View itemView) {
            super(itemView);

            streetStarsView = itemView.findViewById(R.id.streetStars);
        }
    }
}
