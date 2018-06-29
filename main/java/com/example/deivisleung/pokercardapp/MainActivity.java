package com.example.deivisleung.pokercardapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupLaunchButton();

    }
    private void setupLaunchButton(){
        Button smallButton = (Button) findViewById(R.id.smallButton);
        smallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You selected small", Toast.LENGTH_SHORT).show();
                // Launch small activity
                //Intent intent = new Intent(MainActivity.this, SmallActivity.class);
                Intent smallIntent = SmallActivity.makeSmallIntent(MainActivity.this);
                startActivity(smallIntent);
            }
        });
    }
}
