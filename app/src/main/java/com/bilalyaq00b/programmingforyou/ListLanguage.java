package com.bilalyaq00b.programmingforyou;

import java.util.ArrayList;
import java.util.List;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.bilalyaq00b.programmingforyou.c_package.C;
import com.bilalyaq00b.programmingforyou.c_package.Cplusplus;
import com.bilalyaq00b.programmingforyou.ds_package.dataStructure;
import com.bilalyaq00b.programmingforyou.java_package.J;
import com.bilalyaq00b.programmingforyou.oop_package.oop;

public class ListLanguage extends AppCompatActivity  {
    private List<language> myLanguage = new ArrayList<language>();

    /*public class ListLanguage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private List<language> myLanguage = new ArrayList<language>();*/

    // static final int DRAWER_DELAY = 300;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/


        setTitle("Programming Solved Code");
        populateLanguageList();
        populateListView();
        registerClickCallback();

        //Turn me On
        //new Handler().postDelayed(openDrawerRunnable(), DRAWER_DELAY);


      /*  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        */
    }





    private void registerClickCallback() {
        // TODO Auto-generated method stub
        ListView list = (ListView) findViewById(R.id.languageListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(ListLanguage.this, C.class);
                        startActivity(newActivity);
/*  Working
                        Intent newActivity = new Intent(ListLanguage.this, C.class);


                        String transitionName = getString(R.string.transition_string);
                        View viewStart = findViewById(R.id.languageListView);

                        ActivityOptionsCompat options =

                                ActivityOptionsCompat.makeSceneTransitionAnimation(ListLanguage.this, viewStart, transitionName);

                        ActivityCompat.startActivity(ListLanguage.this, newActivity, options.toBundle());*/

                        break;
                    case 1:
                        Intent newActivity1 = new Intent(ListLanguage.this, oop.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(ListLanguage.this, J.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(ListLanguage.this, dataStructure.class);
                        startActivity(newActivity3);
                        break;
                    /*case 4:
                        Intent newActivity4 = new Intent(ListLanguage.this, oop.class);
                        startActivity(newActivity4);
                        break;*/
                }
            }
        });
    }

    private void populateLanguageList() {
        // TODO Auto-generated method stub
        myLanguage.add(new language("C Language", R.drawable.c_1));
        myLanguage.add(new language("C++ & OOP", R.drawable.c_pp));
        myLanguage.add(new language("Java", R.drawable.java));
        myLanguage.add(new language("Data Structures", R.drawable.ds));
        //   myLanguage.add(new language("Object Oriented Programming", R.drawable.oop));

    }

    private void populateListView() {
        ArrayAdapter<language> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.languageListView);
        list.setAdapter(adapter);

    }

    private class MyListAdapter extends ArrayAdapter<language> {
        public MyListAdapter() {
            super(ListLanguage.this, R.layout.language_view, myLanguage);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.language_view, parent, false);
            }
            language currentLanguage = myLanguage.get(position);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.item_icon);
            imageView.setImageResource(currentLanguage.getIconID());
            TextView makeText = (TextView) itemView.findViewById(R.id.txtLanguage);
            makeText.setText(currentLanguage.getLanguageName());
            return itemView;
        }
    }

   /* @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {
          *//*  Intent newActivity4 = new Intent(ListLanguage.this, oop.class);
            startActivity(newActivity4);*//*

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/

    /*private Runnable openDrawerRunnable() {
        return new Runnable() {

            @Override
            public void run() {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(Gravity.LEFT);
            }
        };
    }*/

}

