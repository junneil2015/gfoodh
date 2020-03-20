package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class QuestionActivity extends AppCompatActivity {
    ImageView foodimg;
    TextView lvlnum;
    Button choice1, choice2, choice3, choice4;
    private gfoodchoices gfoodchoices = new gfoodchoices();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();


        final int qnum = bundle.getInt("qnum");
        String qans = gfoodchoices.getcorrans(qnum);

        foodimg = findViewById(R.id.foodimg);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        choice4 = findViewById(R.id.choice4);
        lvlnum = findViewById(R.id.lvlname);

        lvlnum.setText("LEVEL " + qnum);
        foodimg.setImageResource(gfoodchoices.getimg(qnum));
        choice1.setText(gfoodchoices.getchoice1(qnum));
        choice2.setText(gfoodchoices.getchoice2(qnum));
        choice3.setText(gfoodchoices.getchoice3(qnum));
        choice4.setText(gfoodchoices.getchoice4(qnum));

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans = gfoodchoices.getchoice1(qnum);
               submitans(qnum, myans);
           //     Toast.makeText(QuestionActivity.this, "1", Toast.LENGTH_SHORT).show();
             //   Intent intent_to_res = new Intent(QuestionActivity.this, ResultActivity.class);
               /// startActivity(intent_to_res);


            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans = gfoodchoices.getchoice2(qnum);
                submitans(qnum, myans);
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans = gfoodchoices.getchoice3(qnum);
                submitans(qnum, myans);
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans = gfoodchoices.getchoice4(qnum);
                submitans(qnum, myans);
            }
        });

    }


    public void submitans(int qnum, String myans) {
        Intent intent_to_res = new Intent(QuestionActivity.this, ResultActivity.class);
        Bundle bundle_res = new Bundle();

        if (gfoodchoices.getcorrans(qnum).equals(myans)){
            bundle_res.putInt("imgchk", R.drawable.ic_check_circle);
            bundle_res.putInt("qnum", qnum);
        }else{
            bundle_res.putInt("imgchk", R.drawable.ic_cancel);
            bundle_res.putInt("qnum", qnum);
        }
        intent_to_res.putExtras(bundle_res);
        startActivity(intent_to_res);
    }
}
