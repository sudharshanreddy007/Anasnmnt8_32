package com.example.user.anasnmnt8_3;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating myadapter object
        MyAdapter adp=new MyAdapter(MainActivity.this);
        gridView=(GridView)findViewById(R.id.mygridview);
        gridView.setAdapter(adp);
        //Sets the data behind this ListView.
    }

}