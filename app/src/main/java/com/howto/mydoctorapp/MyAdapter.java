package com.howto.mydoctorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context mContext;
    List<AppModel> mList;

    public MyAdapter(Context mContext, List<AppModel> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.card_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.title.setText(mList.get(position).getTitle());
        holder.thumbnail.setImageResource(mList.get(position).getImg_thumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(mContext, "Clicked "+mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView thumbnail;

        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            thumbnail = itemView.findViewById(R.id.thumbnail);

            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
