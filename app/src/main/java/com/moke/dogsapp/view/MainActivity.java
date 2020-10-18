package com.moke.dogsapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.moke.dogsapp.R;

public class MainActivity extends AppCompatActivity {

    /*
    * heirarchy of back button of the app and physical device are different
    * when clicking the back button on the app it returns to the previous hierarchy of the tree segment
    * unlike from phone device back button it returns back to level 0 hierarchy which means going to previous main page
    * */

    // declare variable
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hides the appbar
        setContentView(R.layout.activity_main);

        // getting the fragment id
        navController = Navigation.findNavController(this, R.id.fragment);
        // and setup ActionBar arrow with NavControl class
        NavigationUI.setupActionBarWithNavController(this, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
//        return super.onSupportNavigateUp();

        // navigate the back button to the previous hierarchy
        return NavigationUI.navigateUp(navController, (DrawerLayout) null);
    }
}