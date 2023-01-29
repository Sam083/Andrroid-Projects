package com.example.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    String[] animals;
    int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_item);
        animals = new String[]{"Dog", "Cow", "Cat", "Goat", "Rabbit", "Bull", "OX", "Donkey",
                 "Lion", "Tiger", "Elephant", "Pig", "Leopard", "Puma", "Fox", "Wolf"};


        images = new int[]{R.drawable.dog, R.drawable.cow, R.drawable.cat, R.drawable.goat,
                R.drawable.rabbit, R.drawable.bull, R.drawable.ox, R.drawable.donkey,
                R.drawable.lion, R.drawable.tiger, R.drawable.elephant,
                R.drawable.pig, R.drawable.leopard, R.drawable.puma, R.drawable.fox, R.drawable.wolf};

        listView.setOnItemClickListener(this);
        AnimalAdapter adapter = new AnimalAdapter();
        listView.setAdapter(adapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    class AnimalAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return animals.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if(view==null)
                view = getLayoutInflater().inflate(R.layout.one_item_design,viewGroup,false);
            ImageView animalImage = view.findViewById(R.id.animalImage);
            TextView animalName = view.findViewById(R.id.animal_name);
            animalImage.setImageResource(images[position]);
            animalName.setText(animals[position]);
            return view;
        }
    }
}
