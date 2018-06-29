package com.example.deivisleung.pokercardapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SmallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small);
        setupbackButton();

    }

    private void setupbackButton() {
        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //terminate and return to previous activity
                finish();
            }
        });
    }

    public static Intent makeSmallIntent(Context smallContext) {
        return new Intent(smallContext, SmallActivity.class);
    }


}
