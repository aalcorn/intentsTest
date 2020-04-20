package com.example.intentstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView latText = findViewById(R.id.latText);
                TextView longText = findViewById(R.id.longText);

                String lat = String.valueOf(latText.getText());
                String lon = String.valueOf(longText.getText());

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("lat", lat);
                intent.putExtra("lon", lon);
                startActivity(intent);
            }
        });
    }
}
