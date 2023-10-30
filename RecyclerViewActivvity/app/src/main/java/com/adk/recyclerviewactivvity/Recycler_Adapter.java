package com.adk.recyclerviewactivvity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.Recycler_ViewHolder> {

    private RecyclerItems[] recyclerItems;

    public Recycler_Adapter(RecyclerItems[] recyclerItems) {
        this.recyclerItems = recyclerItems;
    }

    @Override
    public int getItemCount() {
        return recyclerItems.length;
    }

    @NonNull
    @Override
    public Recycler_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items, parent, false);

        return new Recycler_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycler_ViewHolder holder, int position) {
        holder.bind(recyclerItems[position]);
    }

    static class Recycler_ViewHolder extends RecyclerView.ViewHolder{

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public Recycler_ViewHolder(@NonNull View itemView){
            super(itemView);
            appImage = itemView.findViewById(R.id.image_item_1);
            appTitle = itemView.findViewById(R.id.project_title);
            appDescription = itemView.findViewById(R.id.project_description);
        }

        public void bind(RecyclerItems items){
            appTitle.setText(items.title);
            appDescription.setText(items.description);
            appImage.setImageResource(items.id);
        }
    }
}
