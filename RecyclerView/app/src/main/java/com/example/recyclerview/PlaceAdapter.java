package com.example.recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * What is the responsibility of an Adapter class of Recycler view?
 * 1. It has to create an item that holds the data
 * 2. Populate this item on the recycler view
 * 3. Update and reuse the resources
 **/

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    //Todo: get the data that has to be populated

    private Context context;
    private int place_posters[];
    private String place_name[];

    public PlaceAdapter(Context context, int[] place_posters, String[] place_name) {
        this.context = context;
        this.place_posters = place_posters;
        this.place_name = place_name;
    }
    /*onCreateViewHolder(...) is responsible for creating an layout item and displaying it on recycler view */
    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_row_design,parent,false);
        return new PlaceViewHolder(v);

    }
    /*onBindViewHolder() is responsible of populating the data on the Recyclerview items based on the position*/
    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.p.setImageResource(place_posters[position]);
        holder.t.setText(place_name[position]);
    }
    /*getItemCount() returns the count of total items that are going to be displayed on the Recyclerview*/
    @Override
    public int getItemCount() {

        return place_name.length;
    }


    /*Here we establish the connections*/
    public class PlaceViewHolder extends RecyclerView.ViewHolder {

        ImageView p;
        TextView t;
        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            p = itemView.findViewById(R.id.imageView);
            t = itemView.findViewById(R.id.placenametv);
        }
    }
}
