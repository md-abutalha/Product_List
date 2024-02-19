package com.talhadroidlab.productlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView myListView;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.myListView);

        hashMap = new HashMap<>();
        hashMap.put("Product Name","Wireless Bluetooth Headphones");
        hashMap.put("Price","$49.99");
        hashMap.put("Description","Enjoy immersive sound quality with these sleek wireless headphones. Perfect for music lovers and audiophiles alike.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("Product Name","Smartphone Camera Lens Kit");
        hashMap.put("Price","$29.99");
        hashMap.put("Description","Elevate your smartphone photography with this lens kit. Includes wide-angle, macro, and fisheye lenses for creative versatility.");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Product Name","Portable Power Bank Charger");
        hashMap.put("Price","$19.99");
        hashMap.put("Description","Stay charged on-the-go with this compact power bank charger. Compatible with smartphones, tablets, and other USB devices.");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Product Name","Portable Power Bank Charger");
        hashMap.put("Price","$19.99");
        hashMap.put("Description","Stay charged on-the-go with this compact power bank charger. Compatible with smartphones, tablets, and other USB devices.");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Product Name","Stainless Steel Water Bottle");
        hashMap.put("Price","$14.99");
        hashMap.put("Description","Keep hydrated in style with this durable stainless steel water bottle. Perfect for outdoor adventures or daily use.");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Product Name","Fitness Tracker Watch");
        hashMap.put("Price"," $39.99");
        hashMap.put("Description","Monitor your daily activity and stay motivated with this sleek fitness tracker watch. Tracks steps, calories burned, and sleep patterns.");
        arrayList.add(hashMap);


        myAdapter myAdapter = new myAdapter();
        myListView.setAdapter(myAdapter);
    }

    private class myAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return arrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = LayoutInflater.from(getApplicationContext());
            View myView = layoutInflater.inflate(R.layout.product_layout, parent, false);
//            ImageView imageView = myView.findViewById(R.id.imageView);
            TextView tvName = myView.findViewById(R.id.tvName);
            TextView tvPrice = myView.findViewById(R.id.tvPrice);
            TextView tvDescription = myView.findViewById(R.id.tvDescription);

            HashMap<String, String> hashMap = arrayList.get(position);
            String name = hashMap.get("Product Name");
            String price = hashMap.get("Price");
            String description = hashMap.get("Description");

            tvName.setText(name);
            tvPrice.setText(price);
            tvDescription.setText(description);

            return myView;
        }
    }
}
