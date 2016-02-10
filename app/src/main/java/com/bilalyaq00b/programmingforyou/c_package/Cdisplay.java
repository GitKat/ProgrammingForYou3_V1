package com.bilalyaq00b.programmingforyou.c_package;

/**
 * Created by Ahmad on 7/22/2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bilalyaq00b.programmingforyou.R;
import com.bilalyaq00b.programmingforyou.c_views.ShowCArrayCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCAssignmentCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCComplexCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCConversionCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCGamesCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCLcmCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCMatrixCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCNumberCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCProjectCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCSearchingCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCSortingCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCStringCode;
import com.bilalyaq00b.programmingforyou.c_views.ShowCSwappingCode;


public class Cdisplay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_list_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        //TextView view = (TextView)findViewById(R.id.samleText);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("position", 0);
        switch (intValue) {
            case 0:
                // click on Assignment then display 2 options solved and unsolved Assignment
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.assignments));
                final ListView lv = (ListView) findViewById(R.id.list);
                lv.setAdapter(adapter);

                setTitle("Assignments");
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity.putExtra("position", 0);


                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;
                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;
                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCAssignmentCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;
                        }
                    }

                });
                break;

		 /*
          *
		 String formattedText = getString(R.string.htmlFormattedText);
		 Spanned result = Html.fromHtml(formattedText);
		 view.setText(result);*/


            case 1:
                // Click on tutorials , then show the list of tutorials e,g Array , for loops etc
                ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numberList));
                ListView lv1 = (ListView) findViewById(R.id.list);
                lv1.setAdapter(adapter1);

                setTitle("Numbers");

                lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;
                            case 7:
                                Intent newActivity7 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity7.putExtra("position", 7);
                                startActivity(newActivity7);
                                break;


                            case 8:
                                Intent newActivity8 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity8.putExtra("position", 8);
                                startActivity(newActivity8);
                                break;
                            case 9:
                                Intent newActivity9 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity9.putExtra("position", 9);
                                startActivity(newActivity9);
                                break;


                            case 10:
                                Intent newActivity10 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity10.putExtra("position", 10);
                                startActivity(newActivity10);
                                break;
                            case 11:
                                Intent newActivity11 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity11.putExtra("position", 11);
                                startActivity(newActivity11);
                                break;

                            case 12:
                                Intent newActivity12 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity12.putExtra("position", 12);
                                startActivity(newActivity12);
                                break;
                            case 13:
                                Intent newActivity13 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity13.putExtra("position", 13);
                                startActivity(newActivity13);
                                break;


                            case 14:
                                Intent newActivity14 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity14.putExtra("position", 14);
                                startActivity(newActivity14);
                                break;
                            case 15:
                                Intent newActivity15 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity15.putExtra("position", 15);
                                startActivity(newActivity15);
                                break;


                            case 16:
                                Intent newActivity16 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity16.putExtra("position", 16);
                                startActivity(newActivity16);
                                break;
                            case 17:
                                Intent newActivity17 = new Intent(Cdisplay.this, ShowCNumberCode.class);
                                newActivity17.putExtra("position", 17);
                                startActivity(newActivity17);
                                break;


                        }
                    }

                });


                break;
            //	 setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.cList1)));
         /* String formattedText1 = getString(R.string.htmlFormattedText);
		 Spanned result1 = Html.fromHtml(formattedText1);
		 view.setText(result1);*/

            case 2:

                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arrayList));
                ListView lv2 = (ListView) findViewById(R.id.list);
                lv2.setAdapter(adapter2);

                setTitle("Arrays");

                lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // which tutorials either array or loops in C
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCArrayCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                        }
                    }

                });


                //	 setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.cList2)));
		 /*  String formattedText2 = getString(R.string.Text);
		 Spanned result2 = Html.fromHtml(formattedText2);
		 view.setText(result2);*/


                break;
            case 3:

                //for sorting list
                ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sortingList));
                ListView lv3 = (ListView) findViewById(R.id.list);
                lv3.setAdapter(adapter3);

                setTitle("Sorting");

                lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // which tutorials either array or loops in C
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCSortingCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;

                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCSortingCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;

                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCSortingCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;

                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCSortingCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;
                            case 4:

                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCSortingCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;


                        }
                    }

                });
                break;
            case 4:

                //for matrix list
                ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.matrixList));
                ListView lv4 = (ListView) findViewById(R.id.list);
                lv4.setAdapter(adapter4);

                setTitle("Matrix");

                lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // which tutorials either array or loops in C
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCMatrixCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;

                        }
                    }

                });
                break;
            case 5:
                ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.swappingList));
                ListView lv5 = (ListView) findViewById(R.id.list);
                lv5.setAdapter(adapter5);
                setTitle("Swapping");
                lv5.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // which tutorials either array or loops in C
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCSwappingCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCSwappingCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCSwappingCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                        }
                    }

                });
                break;
            case 6:
                ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.strings));
                ListView lv6 = (ListView) findViewById(R.id.list);
                lv6.setAdapter(adapter6);

                setTitle("Strings");

                lv6.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;
                            case 7:
                                Intent newActivity7 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity7.putExtra("position", 7);
                                startActivity(newActivity7);
                                break;


                            case 8:
                                Intent newActivity8 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity8.putExtra("position", 8);
                                startActivity(newActivity8);
                                break;
                            case 9:
                                Intent newActivity9 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity9.putExtra("position", 9);
                                startActivity(newActivity9);
                                break;


                            case 10:
                                Intent newActivity10 = new Intent(Cdisplay.this, ShowCStringCode.class);
                                newActivity10.putExtra("position", 10);
                                startActivity(newActivity10);
                                break;

                        }
                    }

                });
                break;
            case 7:
                ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.conversions));
                ListView lv7 = (ListView) findViewById(R.id.list);
                lv7.setAdapter(adapter7);
                setTitle("Conversions");

                lv7.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;
                            case 7:
                                Intent newActivity7 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity7.putExtra("position", 7);
                                startActivity(newActivity7);
                                break;


                            case 8:
                                Intent newActivity8 = new Intent(Cdisplay.this, ShowCConversionCode.class);
                                newActivity8.putExtra("position", 8);
                                startActivity(newActivity8);
                                break;
                        }
                    }

                });
                break;
            case 8:
                ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.complex));
                ListView lv8 = (ListView) findViewById(R.id.list);
                lv8.setAdapter(adapter8);

                setTitle("Complex");
                lv8.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCComplexCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCComplexCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCComplexCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                        }
                    }

                });
                break;
            case 9:

                ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.lcmHcf));
                ListView lv9 = (ListView) findViewById(R.id.list);
                lv9.setAdapter(adapter9);

                setTitle("LMC, HCF, GCD");
                lv9.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCLcmCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCLcmCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCLcmCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                        }
                    }

                });
                break;
            case 10:

                ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.searching));
                ListView lv10 = (ListView) findViewById(R.id.list);

                lv10.setAdapter(adapter10);
                setTitle("Searching");
                lv10.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCSearchingCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCSearchingCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                        }
                    }

                });
                break;
            case 11:
                // Click on tutorials , then show the list of tutorials e,g Array , for loops etc
                ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.games));
                ListView lv11 = (ListView) findViewById(R.id.list);
                lv11.setAdapter(adapter11);

                setTitle("C Games ");
                lv11.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;
                            case 7:
                                Intent newActivity7 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity7.putExtra("position", 7);
                                startActivity(newActivity7);
                                break;


                            case 8:
                                Intent newActivity8 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity8.putExtra("position", 8);
                                startActivity(newActivity8);
                                break;
                            case 9:
                                Intent newActivity9 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity9.putExtra("position", 9);
                                startActivity(newActivity9);
                                break;


                            case 10:
                                Intent newActivity10 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity10.putExtra("position", 10);
                                startActivity(newActivity10);
                                break;
                            case 11:
                                Intent newActivity11 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity11.putExtra("position", 11);
                                startActivity(newActivity11);
                                break;

                            case 12:
                                Intent newActivity12 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity12.putExtra("position", 12);
                                startActivity(newActivity12);
                                break;
                            case 13:
                                Intent newActivity13 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity13.putExtra("position", 13);
                                startActivity(newActivity13);
                                break;


                            case 14:
                                Intent newActivity14 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity14.putExtra("position", 14);
                                startActivity(newActivity14);
                                break;
                            case 15:
                                Intent newActivity15 = new Intent(Cdisplay.this, ShowCGamesCode.class);
                                newActivity15.putExtra("position", 15);
                                startActivity(newActivity15);
                                break;


                        }
                    }

                });


                break;
            case 12:
                // Click on tutorials , then show the list of tutorials e,g Array , for loops etc
                ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.projects));
                ListView lv12 = (ListView) findViewById(R.id.list);
                lv12.setAdapter(adapter12);

                setTitle("Projects");
                lv12.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                            long id) {
                        // TODO Auto-generated method stub
                        switch (position) {  // numbers program......add two numbers, largest number, prime factor
                            case 0:
                                Intent newActivity = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity.putExtra("position", 0);
                                startActivity(newActivity);
                                break;
                            case 1:
                                Intent newActivity1 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity1.putExtra("position", 1);
                                startActivity(newActivity1);
                                break;


                            case 2:
                                Intent newActivity2 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity2.putExtra("position", 2);
                                startActivity(newActivity2);
                                break;
                            case 3:
                                Intent newActivity3 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity3.putExtra("position", 3);
                                startActivity(newActivity3);
                                break;


                            case 4:
                                Intent newActivity4 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity4.putExtra("position", 4);
                                startActivity(newActivity4);
                                break;
                            case 5:
                                Intent newActivity5 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity5.putExtra("position", 5);
                                startActivity(newActivity5);
                                break;


                            case 6:
                                Intent newActivity6 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity6.putExtra("position", 6);
                                startActivity(newActivity6);
                                break;
                            case 7:
                                Intent newActivity7 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity7.putExtra("position", 7);
                                startActivity(newActivity7);
                                break;


                            case 8:
                                Intent newActivity8 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity8.putExtra("position", 8);
                                startActivity(newActivity8);
                                break;
                            case 9:
                                Intent newActivity9 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity9.putExtra("position", 9);
                                startActivity(newActivity9);
                                break;


                            case 10:
                                Intent newActivity10 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity10.putExtra("position", 10);
                                startActivity(newActivity10);
                                break;
                            case 11:
                                Intent newActivity11 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity11.putExtra("position", 11);
                                startActivity(newActivity11);
                                break;

                            case 12:
                                Intent newActivity12 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity12.putExtra("position", 12);
                                startActivity(newActivity12);
                                break;
                            case 13:
                                Intent newActivity13 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity13.putExtra("position", 13);
                                startActivity(newActivity13);
                                break;


                            case 14:
                                Intent newActivity14 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity14.putExtra("position", 14);
                                startActivity(newActivity14);
                                break;
                            case 15:
                                Intent newActivity15 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity15.putExtra("position", 15);
                                startActivity(newActivity15);
                                break;


                            case 16:
                                Intent newActivity16 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity16.putExtra("position", 16);
                                startActivity(newActivity16);
                                break;
                            case 17:
                                Intent newActivity17 = new Intent(Cdisplay.this, ShowCProjectCode.class);
                                newActivity17.putExtra("position", 17);
                                startActivity(newActivity17);
                                break;


                        }
                    }

                });


                break;
        }
    }


}
