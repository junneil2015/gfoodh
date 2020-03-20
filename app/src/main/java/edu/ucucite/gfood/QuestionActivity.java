package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuestionActivity extends AppCompatActivity {
    ImageView foodimg;
    TextView lvlnum;
    Button choice1, choice2, choice3, choice4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent =  getIntent();
        Bundle bundle = intent.getExtras();

        String qans = bundle.get("qans").toString();
        int qnum = bundle.getInt("qnum");

        foodimg = findViewById(R.id.foodimg);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        choice4 = findViewById(R.id.choice4);
        lvlnum = findViewById(R.id.lvlname);

        lvlnum.setText("LEVEL " + qnum);
        foodimg.setImageResource(bundle.getInt("image"));
        choice1.setText(bundle.get("choice1").toString());
        choice2.setText(bundle.get("choice2").toString());
        choice3.setText(bundle.get("choice3").toString());
        choice4.setText(bundle.get("choice4").toString());

    }

    public void choice1(View view) {
    }

    public void choice2(View view) {
    }

    public void choice3(View view) {
    }

    public void choice4(View view) {
    }
}
