package com.example.lenovo.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_cinderella,bt_snowwhite, bt_rapunzel, bt_sleepingbeauty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bt_cinderella = (Button) findViewById(R.id.bt_cinderella);
       bt_snowwhite = (Button) findViewById(R.id.bt_snowwhite);

        bt_cinderella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CinderellaActivity.class);
                startActivity(intent);
            }
        });

        bt_snowwhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SnowActivity.class);
                startActivity(intent);
            }
        });
    }
}
