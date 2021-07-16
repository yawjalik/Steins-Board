package com.yawjalik.steinsboard;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MoekaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeka);
    }

    public void playSound(View v)
    {
        SoundPoolManager.playSound(v);
    }

    public void back(View v)
    {
        finish();
    }
}