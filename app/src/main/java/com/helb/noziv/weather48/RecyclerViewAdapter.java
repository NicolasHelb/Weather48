package com.helb.noziv.weather48;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

import static com.helb.noziv.weather48.Helper.getHour;
import static com.helb.noziv.weather48.Helper.getImageId;

public class  RecyclerViewAdapter extends RecyclerView.Adapter< RecyclerViewAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private List<Forecast> imageModelArrayList;
    private Context mContext;


    public  RecyclerViewAdapter(Context context, List<Forecast> imageModelArrayList){

        mContext = context;
        inflater = (LayoutInflater) LayoutInflater.from(mContext);
        this.imageModelArrayList = imageModelArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.iv.setImageResource(getImageId(mContext,imageModelArrayList.get(position).getIconCode().toString()));
        holder.phrase.setText(imageModelArrayList.get(position).getPhrase32char());
        holder.time.setText(getHour(imageModelArrayList.get(position).getFcstValidLocal()));
        holder.temp.setText(imageModelArrayList.get(position).getFeelsLike().toString()+" °C");
        holder.jour.setText(imageModelArrayList.get(position).getDow());
    }

    @Override
    public int getItemCount() {
        return imageModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView phrase;
        TextView time;
        TextView temp;
        TextView jour;
        ImageView iv;

        public MyViewHolder(View itemView) {
            super(itemView);

            temp = (TextView) itemView.findViewById(R.id.tvTemp);
            time = (TextView) itemView.findViewById(R.id.tvTime);
            jour = (TextView) itemView.findViewById(R.id.tvjour);
            phrase = (TextView) itemView.findViewById(R.id.tvPhrase);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
