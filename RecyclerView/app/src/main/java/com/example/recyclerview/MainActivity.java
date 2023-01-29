package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int[]images; String[]placeName;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        initData();

        PlaceAdapter placeAdapter = new PlaceAdapter(this,images,placeName);
        recyclerView.setAdapter(placeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        /*recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
        /*recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));*/
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        /*recyclerView.setLayoutManager(new GridLayoutManager(this,2,LinearLayoutManager.HORIZONTAL,false));*/
        /*recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));*/

        //Steps to implement recycler view
        //TODO 1: prepare the data
        //TODO 2: add the recycler view to the project
        //TODO 3: prepare one row design
        //TODO 4: create an adapter that populate the data on the recycler view
        // TODO 5: set up a layoutmanager on the Recyclerview to arrange the items in the way you want it
        //      - LinearLayoutManager
        //      - GridLayoutManager
        //      - StaggeredGridLayoutManager

    }

    private void initData() {
        images = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
                R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};

        placeName = new String[]{"Manali, Himachal Pradesh","Dharamshala, Himachal Pradesh",
        "McLeod Ganj, Himachal Pradesh","Dalhousie, Himachal Pradesh","Shillong, Meghalaya",
        "Mussoorie, Uttarakhand","Auli, Uttarakhand","Nainital, Uttarakhand",
                "Srinagar, Jammu & Kashmir","Leh-Ladakh, Jammu & Ladakh"};
    }
}