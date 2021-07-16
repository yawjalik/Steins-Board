package com.yawjalik.steinsboard;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String version = "v";
        Context context = getApplicationContext();
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version += pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        TextView textViewVersion = findViewById(R.id.textViewVersion);
        textViewVersion.setText(version);
    }

    public void launchNewActivity(View v)
    {
        Intent i;
        switch(v.getId())
        {
            case R.id.imageViewOkarin:
                i = new Intent(this, OkarinActivity.class);
                break;

            case R.id.imageViewMayushii:
                i = new Intent(this, MayushiiActivity.class);
                break;

            case R.id.imageViewDaru:
                i = new Intent(this, DaruActivity.class);
                break;

            case R.id.imageViewKurisu:
                i = new Intent(this, KurisuActivity.class);
                break;

            case R.id.imageViewMoeka:
                i = new Intent(this, MoekaActivity.class);
                break;

            case R.id.imageViewLukako:
                i = new Intent(this, LukakoActivity.class);
                break;

            case R.id.imageViewFaris:
                i = new Intent(this, FarisActivity.class);
                break;

            case R.id.imageViewSuzuha:
                i = new Intent(this, SuzuhaActivity.class);
                break;

            default:
                i = new Intent(this, Credits.class);
        }

        startActivity(i);
    }

    public void playSound(View v)
    {
        SoundPoolManager.playSound(v);
    }

    public void unavailable(View v)
    {
        Toast.makeText(this, "Available maybe in another worldline", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SoundPoolManager.cleanUp();

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

}