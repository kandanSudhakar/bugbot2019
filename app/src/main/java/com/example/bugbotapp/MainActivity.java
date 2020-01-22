package com.example.bugbotapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonForward = findViewById(R.id.buttonForward);
        Button buttonBackward = findViewById(R.id.buttonBackward);
        Button buttonLeft = findViewById(R.id.buttonLeft);
        Button buttonRight = findViewById(R.id.buttonRight);

        buttonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send forward command to controller class
                Snackbar.make(view, "Send forward command", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send backward command to controller class
                Snackbar.make(view, "Send backward command", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send left command to controller class
                Snackbar.make(view, "Send left command", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Send right command to controller class
                Snackbar.make(view, "Send right command", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
