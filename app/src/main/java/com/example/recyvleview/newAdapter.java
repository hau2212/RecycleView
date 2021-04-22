package com.example.recyvleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class newAdapter extends RecyclerView.Adapter<newAdapter.viewHolder> {
List<fromFood> list;
Context context;

    public newAdapter(List<fromFood> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_from,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
fromFood fromFoods = list.get(position);
holder.text1.setText(fromFoods.getText1());
        holder.text2.setText(fromFoods.getText2());
        holder.text3.setText(fromFoods.getText3());
        holder.text4.setText(fromFoods.getText4());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        private TextView text1;
        private TextView text2;
        private TextView text3;
        private TextView text4;
        private ImageView ImgShow;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.NameStore3);
            text2 = itemView.findViewById(R.id.Adress3);
            text3 = itemView.findViewById(R.id.Discount4);
            text4 = itemView.findViewById(R.id.MoreDiscount);
            ImgShow = itemView.findViewById(R.id.ImgFood2);
        }
        }
}
