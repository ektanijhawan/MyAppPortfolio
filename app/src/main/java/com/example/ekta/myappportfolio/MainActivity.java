package com.example.ekta.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

        Button button=(Button) v;
        String appName= button.getText().toString();
        Toast.makeText(this, this.getString(R.string.button_will) +" "+appName+" "+ this.getString(R.string.app), Toast.LENGTH_SHORT).show();
    }

}
