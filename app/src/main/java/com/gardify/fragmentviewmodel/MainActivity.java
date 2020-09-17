package com.gardify.fragmentviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fragA = findViewById(R.id.fragment_a);
        Button fragB = findViewById(R.id.fragment_b);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_a, new FragmentA())
                .commit();

        fragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container_a, new FragmentA())
                        .commit();
            }
        });
        fragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container_a, new FragmentB())
                        .commit();
            }
        });

    }
}