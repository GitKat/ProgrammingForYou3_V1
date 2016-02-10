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

public class ShowCNumberCode extends AppCompatActivity {
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
                setTitle("Sum of Digit");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText = getString(R.string.sumofDigits);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Power Of A Number");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText1 = getString(R.string.power);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Add Two Numbers Without using + operator");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText2 = getString(R.string.addTwoNumbers);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Find The Largest Number");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText3 = getString(R.string.findLargest);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("Calculate Generic Root");

                imageView.setImageResource(R.drawable.c_h1);  String formattedText4 = getString(R.string.genericRoot);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("Subtract Two Numbers Without using - operator");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText5 = getString(R.string.subtract);

                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("Find The Largest Number Among 3");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText6 = getString(R.string.largestAmongThree);

                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                setTitle("Prime Factor");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText7 = getString(R.string.primeFactor);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                setTitle("Count The Number Of Digits");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText8 = getString(R.string.countNumberOfDigits);

                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
            case 9:
                setTitle("Print ASCII Values");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText9 = getString(R.string.printAcii);

                Spanned result9 = Html.fromHtml(formattedText9);
                view.setText(result9);
                break;
            case 10:
                setTitle("Check whether a number is Strong or Not");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText10 = getString(R.string.checkStrong);
                Spanned result10 = Html.fromHtml(formattedText10);
                view.setText(result10);
                break;
            case 11:
                setTitle("Extract Digits From Integer");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText11 = getString(R.string.extractDigits);
                Spanned result11 = Html.fromHtml(formattedText11);
                view.setText(result11);
                break;
            case 12:
                setTitle("Check Even Or Odd");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText12 = getString(R.string.checkEven);
                Spanned result12 = Html.fromHtml(formattedText12);
                view.setText(result12);
                break;
            case 13:
                setTitle("Find NCR factor");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText13 = getString(R.string.ncr);
                Spanned result13 = Html.fromHtml(formattedText13);
                view.setText(result13);
                break;
            case 14:
                setTitle("Multiplication Of A Table");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText14 = getString(R.string.multiplication);
                Spanned result14 = Html.fromHtml(formattedText14);
                view.setText(result14);
                break;
            case 15:
                setTitle("Generate Fibonacci Series");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText15 = getString(R.string.generatefibo);
                Spanned result15 = Html.fromHtml(formattedText15);
                view.setText(result15);
                break;
            case 16:
                setTitle("Generate Fibonacci Series Using Array");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText16 = getString(R.string.generatefiboUsingArray);
                Spanned result16 = Html.fromHtml(formattedText16);
                view.setText(result16);
                break;


        }

    }
}
