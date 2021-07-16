package com.yawjalik.steinsboard;

import android.content.Intent;
import android.media.SoundPool;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SoundPoolManager.instantiate(this);
        final Intent i = new Intent(this, MainActivity.class);

        final TextView textview = findViewById(R.id.textViewLoading);
        final int totalSamples = 80;

        SoundPoolManager.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {

                // System.out.println("lmao.LOADING " + sampleId);
                if (sampleId <= totalSamples) {
                    textview.setText("Loading... " + (sampleId * 100 / totalSamples) + "%");
                }
                if (sampleId == totalSamples)
                {
                    // System.out.println("lmao.LOAD COMPLETE");
                    startActivity(i);
                    finish();
                }
            }
        });
    }

    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.anim.fade_in, R.anim.nothing);
    }
}