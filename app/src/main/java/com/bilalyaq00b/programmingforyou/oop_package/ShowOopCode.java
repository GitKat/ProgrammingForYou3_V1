package com.bilalyaq00b.programmingforyou.oop_package;

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

public class ShowOopCode extends AppCompatActivity {
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
                setTitle("Classes And Objects");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText = getString(R.string.oopClassesAndObjects);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Inheritance in C++");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText1 = getString(R.string.oopInheritance);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Function And Operator Overloading");

                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText2 = getString(R.string.oopFunctionAndOperatorOverloading);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Polymorphism And Virtual Functions");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText3 = getString(R.string.oopPolymorphismAndVirtualFunctions);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("Data Abstraction");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText4 = getString(R.string.oopDataAbstraction);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("Encapsulation");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText5 = getString(R.string.oopEncapsulation);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("Namespaces");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText6 = getString(R.string.oopNameSpaces);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                setTitle("File Handling And Streams");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText7 = getString(R.string.oopFileHandling);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                setTitle("OOP Solved Assignment 1");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText8 = getString(R.string.oopAss1);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
            case 9:
                setTitle("OOP Solved Assignment 2");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText9 = getString(R.string.oopAss2);
                Spanned result9 = Html.fromHtml(formattedText9);
                view.setText(result9);
                break;
            case 10:
                setTitle("OOP Solved Assignment 3");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText10 = getString(R.string.oopAss3);
                Spanned result10 = Html.fromHtml(formattedText10);
                view.setText(result10);
                break;
            case 11:
                setTitle("OOP Solved Assignment 4");
                imageView.setImageResource(R.drawable.cpp_h2);
                String formattedText11 = getString(R.string.oopAss4);
                Spanned result11 = Html.fromHtml(formattedText11);
                view.setText(result11);
                break;
        }
    }
}
