package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageView resultstatus;
    Button contbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent_to_res = getIntent();
        Bundle bundle_to_res = intent_to_res.getExtras();

        resultstatus = findViewById(R.id.resultstatus);
        resultstatus.setImageResource(bundle_to_res.getInt("imgchk"));
        contbtn = findViewById(R.id.contbtn);
        final int nextqnum = bundle_to_res.getInt("qnum") + 1;
        final String category = bundle_to_res.getString("category");

        contbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, QuestionActivity.class);
                Bundle bundle = new Bundle();

                bundle.putInt("qnum", nextqnum);
                intent.putExtra("category", category);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }

}
