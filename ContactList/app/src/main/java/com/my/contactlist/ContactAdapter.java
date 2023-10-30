package com.my.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {


    String title, number, image;
    Context context;
    ArrayList<ContactModel> contactModels;

    public ContactAdapter(Context context, ArrayList<ContactModel> contactModels) {
        this.context = context;
        this.contactModels = contactModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contImage.setImageResource(contactModels.get(holder.getAdapterPosition()).image);
        hol
    }

    @Override
    public int getItemCount() {
        return contactModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView contTitle, contNumber;
        ImageView contImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contTitle = itemView.findViewById(R.id.Contact_title);
            contNumber = itemView.findViewById(R.id.contact_number);
            contImage = itemView.findViewById(R.id.contact_image);
        }
    }
}
