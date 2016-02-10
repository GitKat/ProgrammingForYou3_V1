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
import android.widget.ImageView;
import android.widget.TextView;

import com.bilalyaq00b.programmingforyou.R;

public class ShowCSortingCode extends AppCompatActivity {
    int size = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neew);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
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
                setTitle("Bubble Sort");
                imageView.setImageResource(R.drawable.ds_h2);

                String formattedText = getString(R.string.bubbleSort);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Merge Sort");
                imageView.setImageResource(R.drawable.ds_h2);  String formattedText1 = getString(R.string.mergeSort);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Selection Sort");
                imageView.setImageResource(R.drawable.ds_h2);  String formattedText2 = getString(R.string.selectionSort);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Quick Sort");
                imageView.setImageResource(R.drawable.ds_h2);  String formattedText3 = getString(R.string.quickSort);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;

            case 4:
                setTitle("Insertion Sort");
                imageView.setImageResource(R.drawable.ds_h2);  String formattedText4 = getString(R.string.insertionSort);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("NOTHING");
                imageView.setImageResource(R.drawable.ds_h2);  String formattedTextn = getString(R.string.insertionSort);
                Spanned resultn = Html.fromHtml(formattedTextn);
                view.setText(resultn);
                break;


        }
    }
}

