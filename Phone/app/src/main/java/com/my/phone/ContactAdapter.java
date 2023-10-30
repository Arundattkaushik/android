package com.my.phone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> contactModels;

    public ContactAdapter(Context context, ArrayList<ContactModel> contactModels) {
        this.context = context;
        this.contactModels = contactModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_model, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contIcon.setImageResource(contactModels.get(position).contImage);
        holder.contNumber.setText(contactModels.get(position).contNumber);
        holder.contTitle.setText(contactModels.get(position).contName);

        holder.updateContactRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.alert_dialog_box);
                EditText name = dialog.findViewById(R.id.editName);
                EditText number = dialog.findViewById(R.id.editNumber);
                Button btnAction = dialog.findViewById(R.id.action_button);
                TextView dialogTitle = dialog.findViewById(R.id.alertBox_title);

                dialogTitle.setText("Update Contact");
                btnAction.setText("Update");
                number.setText(contactModels.get(holder.getAdapterPosition()).contNumber);
                name.setText(contactModels.get(holder.getAdapterPosition()).contName);


                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String updatedName ="", updatedNumber="";
                        if (!name.getText().toString().equals("")){
                            updatedName = name.getText().toString();
                        }
                        else {
                            Toast.makeText(context, "Name field can't empty!", Toast.LENGTH_SHORT).show();
                        }

                        if (!number.getText().toString().equals("")){
                            updatedNumber = number.getText().toString();
                        }
                        else {
                            Toast.makeText(context, "Number field can't empty!", Toast.LENGTH_SHORT).show();
                        }

                        contactModels.set(holder.getAdapterPosition(), new ContactModel(R.drawable.pngwing_com, updatedName, updatedNumber));
                        notifyItemChanged(holder.getAdapterPosition());
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        holder.updateContactRow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle(R.string.delete_dialog_box_text)
                        .setMessage(R.string.delete_dialog_confirmation_text)
                        .setIcon(R.drawable.baseline_delete_24)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                              contactModels.remove(holder.getAdapterPosition());
                              notifyItemRemoved(holder.getAdapterPosition());
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView contIcon;
        TextView contTitle, contNumber;
        LinearLayout updateContactRow;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            updateContactRow = itemView.findViewById(R.id.contact_model_);
            contIcon = itemView.findViewById(R.id.contact_icon);
            contTitle = itemView.findViewById(R.id.contact_title);
            contNumber = itemView.findViewById(R.id.contact_number_id);
        }
    }
}
