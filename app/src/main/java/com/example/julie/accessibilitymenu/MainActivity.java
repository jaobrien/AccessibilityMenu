package com.example.julie.accessibilitymenu;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener
{

    //For the log
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References the button elements in the activity_main.xml file
        ImageButton settingsButton = (ImageButton)findViewById(R.id.settingsButton);

        //Listen for clicks
        settingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            //Go to settings
            case R.id.settingsButton:
                Intent intent = new Intent();
                intent.setAction("android.settings.ACCESSIBILITY_SETTINGS");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
