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

public class ShowCConversionCode extends AppCompatActivity {
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
        switch (intValue) {
            case 0:
                setTitle("C code for binary to decimal conversion");
                imageView.setImageResource(R.drawable.c_h1);

                String formattedText = getString(R.string.binary2deci);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("C program to convert binary to octal");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText1 = getString(R.string.binary2octal);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("C program for Binary to Hexadecimal");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText2 = getString(R.string.binary2hexa);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle(" Decimal to binary conversion  ");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText3 = getString(R.string.deci2binary);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("C code for decimal to octal  ");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText4 = getString(R.string.deci2octal);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("C code to convert decimal to hexadecimal ");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText5 = getString(R.string.deci2hexa);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("C program to convert octal to Binary");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText6 = getString(R.string.octal2binary);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                setTitle("C code to convert octal number to decimal number");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText7 = getString(R.string.octal2deci);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                setTitle("C program for hexadecimal to binary conversion");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText8 = getString(R.string.hexa2binary);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
        }
    }
}

