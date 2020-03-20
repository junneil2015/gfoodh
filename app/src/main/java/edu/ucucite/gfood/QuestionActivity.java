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
    private gdrinkchoices gdrinkchoices = new gdrinkchoices();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();


        final int qnum = bundle.getInt("qnum");
        final String category = bundle.getString("category");
        String qans = gfoodchoices.getcorrans(qnum);

        foodimg = findViewById(R.id.foodimg);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        choice4 = findViewById(R.id.choice4);
        lvlnum = findViewById(R.id.lvlname);

        lvlnum.setText("LEVEL " + qnum);
        if (category.equals("foods")) {
            foodimg.setImageResource(gfoodchoices.getimg(qnum));
            choice1.setText(gfoodchoices.getchoice1(qnum));
            choice2.setText(gfoodchoices.getchoice2(qnum));
            choice3.setText(gfoodchoices.getchoice3(qnum));
            choice4.setText(gfoodchoices.getchoice4(qnum));
        } else {
            foodimg.setImageResource(gdrinkchoices.getimg(qnum));
            choice1.setText(gdrinkchoices.getchoice1(qnum));
            choice2.setText(gdrinkchoices.getchoice2(qnum));
            choice3.setText(gdrinkchoices.getchoice3(qnum));
            choice4.setText(gdrinkchoices.getchoice4(qnum));
        }

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans;
                if (category.equals("foods")) {
                    myans = gfoodchoices.getchoice1(qnum);
                } else {
                    myans = gdrinkchoices.getchoice1(qnum);
                }
                submitans(qnum, myans, category);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans;
                if (category.equals("foods")) {
                    myans = gfoodchoices.getchoice2(qnum);
                } else {
                    myans = gdrinkchoices.getchoice2(qnum);
                }
                submitans(qnum, myans, category);
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans;
                if (category.equals("foods")) {
                    myans = gfoodchoices.getchoice3(qnum);
                } else {
                    myans = gdrinkchoices.getchoice3(qnum);
                }
                submitans(qnum, myans, category);
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myans;
                if (category.equals("foods")) {
                    myans = gfoodchoices.getchoice4(qnum);
                } else {
                    myans = gdrinkchoices.getchoice4(qnum);
                }
                submitans(qnum, myans, category);
            }
        });


    }


    public void submitans(int qnum, String myans, String category) {
        Intent intent_to_res = new Intent(QuestionActivity.this, ResultActivity.class);
        Bundle bundle_res = new Bundle();
        if (category.equals("foods")) {
            if (gfoodchoices.getcorrans(qnum).equals(myans)) {
                bundle_res.putInt("imgchk", R.drawable.ic_check_circle);
                bundle_res.putInt("qnum", qnum);
            } else {
                bundle_res.putInt("imgchk", R.drawable.ic_cancel);
                bundle_res.putInt("qnum", qnum);
            }
        }else {
            if (gdrinkchoices.getcorrans(qnum).equals(myans)) {
                bundle_res.putInt("imgchk", R.drawable.ic_check_circle);
                bundle_res.putInt("qnum", qnum);
            }else {
                bundle_res.putInt("imgchk", R.drawable.ic_cancel);
                bundle_res.putInt("qnum", qnum);
            }
        }
        intent_to_res.putExtra("category", category);


        intent_to_res.putExtras(bundle_res);
        startActivity(intent_to_res);
    }
}
