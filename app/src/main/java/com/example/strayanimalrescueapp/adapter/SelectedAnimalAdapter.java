package com.example.strayanimalrescueapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.strayanimalrescueapp.AnimalDetails;
import com.example.strayanimalrescueapp.R;
import com.example.strayanimalrescueapp.model.SelectedAnimal;

import java.util.List;

public class SelectedAnimalAdapter extends RecyclerView.Adapter<SelectedAnimalAdapter.SelectedAnimalViewHolder> {

    Context context;
    List<SelectedAnimal> selectedAnimalList;

    public SelectedAnimalAdapter(Context context, List<SelectedAnimal> selectedAnimalList) {
        this.context = context;
        this.selectedAnimalList = selectedAnimalList;
    }

    @NonNull
    @Override
    public SelectedAnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_selected_animal, parent, false);
        return new SelectedAnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectedAnimalViewHolder holder, final int position) {
        holder.name.setText(selectedAnimalList.get(position).getName());
        holder.description.setText(selectedAnimalList.get(position).getDescription());
        holder.location.setText(selectedAnimalList.get(position).getLocation());
        /*holder.status.setText(selectedAnimalList.get(position).getStatus());
        holder.neuteredStatus.setText(selectedAnimalList.get(position).getNeuteredStatus());
        holder.feeding.setText(selectedAnimalList.get(position).getFeeding());*/
        holder.bg.setBackgroundResource(selectedAnimalList.get(position).getImageURL());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, AnimalDetails.class);
                i.putExtra("name",selectedAnimalList.get(position).getName());
                i.putExtra("image",selectedAnimalList.get(position).getImageURL());
                i.putExtra("desc",selectedAnimalList.get(position).getDescription());
                i.putExtra("location",selectedAnimalList.get(position).getLocation());
                i.putExtra("status",selectedAnimalList.get(position).getStatus());
                i.putExtra("neutered",selectedAnimalList.get(position).getNeuteredStatus());
                i.putExtra("feed",selectedAnimalList.get(position).getFeeding());

                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return selectedAnimalList.size();
    }

    public static class SelectedAnimalViewHolder extends RecyclerView.ViewHolder{
        TextView name, description, location;
        ConstraintLayout bg;

        public SelectedAnimalViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.animal_name);
            description = itemView.findViewById(R.id.description);
            location = itemView.findViewById(R.id.animal_location);
            bg = itemView.findViewById(R.id.selected_layout);
        }
    }
}
