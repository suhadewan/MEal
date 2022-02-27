package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton calendar;
    private ImageButton receipt;
    private ImageButton ingredients;
    private ImageButton alarm;
    private ImageButton user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        calendar = findViewById(R.id.ibCalendar);
        receipt = findViewById(R.id.ibReceipt);
        ingredients = findViewById(R.id.ibIngredients);
        alarm = findViewById(R.id.ibAlarm);
        user = findViewById(R.id.ibUser);

        ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, AddIngredientsActivity.class);
                startActivity(intent);
            }
        });



    }
}