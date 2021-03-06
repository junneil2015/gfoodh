package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }


    public void onclkdrinks(View view) {
        Intent intent = new Intent(CategoriesActivity.this, LevelsActivity.class);
        intent.putExtra("category", "drinks");
        startActivity(intent);
    }

    public void onclkfoods(View view) {
        Intent intent = new Intent(CategoriesActivity.this, LevelsActivity.class);
        intent.putExtra("category", "foods");
        startActivity(intent);
    }
}
