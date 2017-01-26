package com.peacecorps.malaria.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SplashActivity.this, UserMedicineSettingsFragmentActivity.class);
        startActivity(intent);
        finish();
    }
}
