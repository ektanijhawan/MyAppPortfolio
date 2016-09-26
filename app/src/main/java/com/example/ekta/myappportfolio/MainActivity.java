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
    /*    int id = v.getId();
        switch (id) {
            case R.id.btnPopularMovies:
                Toast.makeText(this, this.getString(R.string.info_popular_movies), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnStockHawk:
                Toast.makeText(this, this.getString(R.string.info_stock_hawk), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnBuildItBigger:
                Toast.makeText(this, this.getString(R.string.info_build_it_bigger), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnMakeYourAppMaterial:
                Toast.makeText(this, this.getString(R.string.info_make_your_app_material), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGoUbiquitous:
                Toast.makeText(this, this.getString(R.string.info_go_ubiquitous), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCapstone:
                Toast.makeText(this, this.getString(R.string.info_capstone), Toast.LENGTH_SHORT).show();

                break;

        }
        */
        Button button=(Button) v;
        String appName= button.getText().toString();
        Toast.makeText(this, this.getString(R.string.button_will) +" "+appName+" "+ this.getString(R.string.app), Toast.LENGTH_SHORT).show();
    }

}
