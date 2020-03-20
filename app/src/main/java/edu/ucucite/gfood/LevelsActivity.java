package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelsActivity extends AppCompatActivity {

    private gfoodchoices gfoodchoices = new gfoodchoices();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
    }

    public void onclklvl1(View view) {
        get_to_q(1);
    }
    public void onclklvl2(View view) {
        get_to_q(2);
    }
    public void onclklvl3(View view) {
        get_to_q(3);
    }
    public void onclklvl4(View view) {
        get_to_q(4);
    }
    public void onclklvl5(View view) {
        get_to_q(5);
    }
    public void onclklvl6(View view) {
        get_to_q(6);
    }
    public void onclklvl7(View view) {
        get_to_q(7);
    }
    public void onclklvl8(View view) {
        get_to_q(8);
    }
    public void onclklvl9(View view) {
        get_to_q(9);
    }
    public void onclklvl10(View view) {
        get_to_q(10);
    }

    public void get_to_q(int qnum){
        Intent intent = new Intent(LevelsActivity.this, QuestionActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("image", gfoodchoices.getimg(qnum));
        bundle.putInt("qnum", qnum);
        intent.putExtra("qans", gfoodchoices.getcorrans(qnum));
        intent.putExtra("choice1", gfoodchoices.getchoice1(qnum));
        intent.putExtra("choice2", gfoodchoices.getchoice2(qnum));
        intent.putExtra("choice3", gfoodchoices.getchoice3(qnum));
        intent.putExtra("choice4", gfoodchoices.getchoice4(qnum));
        intent.putExtras(bundle);
        startActivity(intent);
    }



}
