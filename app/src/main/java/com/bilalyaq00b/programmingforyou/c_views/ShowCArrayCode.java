package com.bilalyaq00b.programmingforyou.c_views;

/**
 * Created by Ahmad on 7/22/2015.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;

import com.bilalyaq00b.programmingforyou.R;

public class ShowCArrayCode extends AppCompatActivity {

    int size = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neew);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       /* getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);*/
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
                setTitle("Find The Largest Element In An Array");
                imageView.setImageResource(R.drawable.cpp_h2);

                String formattedText = getString(R.string.findLargest);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Find The Second Largest Element In An Array");
                String formattedText1 = getString(R.string.findSecondLargest);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Find The Second Smallest Element In An Array");
                String formattedText2 = getString(R.string.findSecondSmallest);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Remove Duplicate Elements In An Array");
                String formattedText3 = getString(R.string.removeDuplicate);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:

                setTitle("Delete Element From An Array At Desired Position");
                String formattedText4 = getString(R.string.deleteElement);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:

                setTitle("Insert Element From An Array At Desired Position");
                String formattedText5 = getString(R.string.insertElemet);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

