package com.bilalyaq00b.programmingforyou.c_views;

/**
 * Created by Ahmad on 7/22/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import com.bilalyaq00b.programmingforyou.R;

public class ShowCSearchingCode extends AppCompatActivity {
    int size = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neew);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        final TextView view = (TextView) findViewById(R.id.samleText);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                size = size + 3;
                view.setTextSize(size);
            }
        });
        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size = size - 3;
                view.setTextSize(size);
            }
        });
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("position", 0);
        switch(intValue){
            case 0:
                setTitle("Linear Search");
                String formattedText = getString(R.string.linearSearch);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Binary Search");
                String formattedText1 = getString(R.string.binarySearch);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;
        }
    }
}

