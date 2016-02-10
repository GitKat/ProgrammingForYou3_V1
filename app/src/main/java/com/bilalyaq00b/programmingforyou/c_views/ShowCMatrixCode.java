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

public class ShowCMatrixCode extends AppCompatActivity {
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
                setTitle("Addition Of Two Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText = getString(R.string.additionOfTwoMatrix);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Subtraction  Of Two Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText1 = getString(R.string.subtractionOfTwoMatrix);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Multiplication Of Two Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText2 = getString(R.string.matrixMultiplication);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Transpose Of A Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText3 = getString(R.string.transpose);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("Sum Of Diagonal Elements");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText4 = getString(R.string.sumOfDiagonal);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("Display Lower Triangular Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText5 = getString(R.string.lowerTraiangular);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("Display Upper Triangular Matrix");
                imageView.setImageResource(R.drawable.c_h1);  String formattedText6 = getString(R.string.upperTriangular);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
        }
    }
}
