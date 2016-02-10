package com.bilalyaq00b.programmingforyou.java_package;

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

public class ShowJavaCode extends AppCompatActivity {

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
                setTitle("Basic Syntax");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText = getString(R.string.javaBasicSyntax);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Loops");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText1 = getString(R.string.javaLoops);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Arrays");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText2 = getString(R.string.javaArrays);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;
            case 3:
                setTitle("Java Applet Pie Chart");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText3 = getString(R.string.javaAppletPieChart);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("Java Applet Clock");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText4 = getString(R.string.javaAppletClock);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("Java Applet Color Chooser");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText5 = getString(R.string.javaAppletColorChooser);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("Project: A Ball Moving Around the Window");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText6 = getString(R.string.javaProjectAballMovingRoundTheWindow);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                setTitle("Project: School management System");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText7 = getString(R.string.javaProjectSchoolManagementSystem);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                setTitle("Project: Simple Calculator");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText8 = getString(R.string.javaProjectCalculator);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
            case 9:
                setTitle("Project: Scientific Calculator");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText9 = getString(R.string.javaProjectScientificCalculator);
                Spanned result9 = Html.fromHtml(formattedText9);
                view.setText(result9);
                break;
            case 10:
                setTitle("Project: Create GUI for Bank Account Simulation");
                imageView.setImageResource(R.drawable.java_h1);  String formattedText10 = getString(R.string.javaProjectCreateGUIForbankAccountSimulation);
                Spanned result10 = Html.fromHtml(formattedText10);
                view.setText(result10);
                break;
        }
    }
}
