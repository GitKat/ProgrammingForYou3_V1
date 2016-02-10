package com.bilalyaq00b.programmingforyou.ds_package;

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

public class ShowDataStructureCode extends AppCompatActivity {

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
                setTitle("Stack With OOP and Exceptional Handling");
                String formattedText = getString(R.string.DSStackWithOOPandExceptionHandlingConcept);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                setTitle("Binary Tree Implementation");
                String formattedText1 = getString(R.string.DSBinarytreeimplementation);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                setTitle("Queue Implementation Using Linked List");
                String formattedText2 = getString(R.string.DSQueueimplemetationUsingLinkedList);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                setTitle("Stack implementation As A Class");
                String formattedText3 = getString(R.string.DSStackImplementaionAsAClass);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                setTitle("Employee management Database");
                String formattedText4 = getString(R.string.DSEmployeeManagementDataBase);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                setTitle("Implementing Queue As A Class");
                String formattedText5 = getString(R.string.DSImplemetationQueueAsAClass);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                setTitle("Graphs Program");
                String formattedText6 = getString(R.string.DSGraphs);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
         case 7:
             setTitle("Files And Folders Using Data Structures ");
             String formattedText7 = getString(R.string.FilesandFoldersusingDataStructure);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
           case 8:
               setTitle("Linked List Sample Assignment 1");
               String formattedText8 = getString(R.string.DSlinkedList1);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
            case 9:
                setTitle("Linked List Sample Assignment 2");
                String formattedText9 = getString(R.string.DSlinkedList2);
                Spanned result9 = Html.fromHtml(formattedText9);
                view.setText(result9);
                break;
            case 10:
                setTitle("Data Structure Assignment 1");
                String formattedText10 = getString(R.string.DSAssignment1);
                Spanned result10 = Html.fromHtml(formattedText10);
                view.setText(result10);
                break;
            case 11:
                setTitle("Data Structure Assignment 2");
                String formattedText11 = getString(R.string.DSAssignment2);
                Spanned result11 = Html.fromHtml(formattedText11);
                view.setText(result11);
                break;


        }

    }
}

