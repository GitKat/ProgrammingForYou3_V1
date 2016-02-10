package com.bilalyaq00b.programmingforyou.java_package;

/**
 * Created by Ahmad on 7/22/2015.
 */
import java.util.ArrayList;
import java.util.List;

//import com.example.code.ListLanguage.MyListAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bilalyaq00b.programmingforyou.R;

public class Javaa extends AppCompatActivity {
    private List<JavaLanguage> myJavaLanguage = new ArrayList<JavaLanguage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        populateLanguageList();
        populateListView();
        registerClickCallback();
    }





    private void registerClickCallback() {
        // TODO Auto-generated method stub
        ListView list = (ListView)findViewById(R.id.javaListView1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(Javaa.this, ShowJavaCode.class);
                        newActivity.putExtra("position",0);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(Javaa.this, ShowJavaCode.class);
                        newActivity1.putExtra("position",1);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(Javaa.this, ShowJavaCode.class);
                        newActivity2.putExtra("position",2);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(Javaa.this, ShowJavaCode.class);
                        startActivity(newActivity3);
                        break;

                }
            }

        });
    }




    private void populateLanguageList() {
        // TODO Auto-generated method stub
        myJavaLanguage.add(new JavaLanguage("Basic Syntax"));
        myJavaLanguage.add(new JavaLanguage("Loops"));
        myJavaLanguage.add(new JavaLanguage("Arrays"));
        myJavaLanguage.add(new JavaLanguage("Projects"));
    }

    private void populateListView() {
        ArrayAdapter<JavaLanguage> adapter = new MyListAdapter();
        ListView list = (ListView)findViewById(R.id.javaListView1);
        list.setAdapter(adapter);

    }
    private class MyListAdapter extends ArrayAdapter<JavaLanguage>{
        public MyListAdapter(){
            super(Javaa.this,R.layout.all_view,myJavaLanguage);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.all_view,parent,false);
            }
            JavaLanguage currentLanguage = myJavaLanguage.get(position);

            //	ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            //imageView.setImageResource(currentLanguage.getIconID());
            TextView makeText = (TextView)itemView.findViewById(R.id.txtAllView2);
            makeText.setText(currentLanguage.getJavaLanguageList());
            return itemView;
        }
    }












}
