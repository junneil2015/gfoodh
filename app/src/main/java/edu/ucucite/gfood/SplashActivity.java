package edu.ucucite.gfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        loaderbar();
        splasher();
    }

    public void loaderbar() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter += 1;
                progressBar.setProgress((counter));
            }
        };
        t.schedule(tt, 0, 100);
    }


    public void splasher() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);
                finish();

            }
        }, 5000);
    }
}
