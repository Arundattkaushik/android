package com.adk.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    ListItem[] itemListArray;

    public ItemAdapter(ListItem[] itemListArray) {
        this.itemListArray = itemListArray;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(itemListArray[position]);
    }

    @Override
    public int getItemCount() {
        return itemListArray.length;
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView cardIcon;
        TextView cardTitle;
        TextView cardDescription;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cardIcon = itemView.findViewById(R.id.list_item_card_icon);
            cardTitle = itemView.findViewById(R.id.list_item_card_title);
            cardDescription = itemView.findViewById(R.id.list_item_card_description);
        }

        public void bind(ListItem listItem){
            cardIcon.setImageResource(listItem.itemIcon);
            cardTitle.setText(listItem.itemTitle);
            cardDescription.setText(listItem.itemDescription);
        }
    }
}
