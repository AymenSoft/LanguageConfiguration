package com.aymensoft.languageconfiguration;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnAr, btnEN;

    Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEN=findViewById(R.id.btn_en);
        btnAr=findViewById(R.id.btn_ar);

        btnEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage("en");
            }
        });

        btnAr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage("ar");
            }
        });

    }

    public void changeLanguage(String lang){

        Variables.sharedpreferences = getSharedPreferences(Variables.USERSESSION, MODE_PRIVATE);
        SharedPreferences.Editor editor = Variables.sharedpreferences.edit();
        editor.putString(Variables.LANGUAGEPREFERENCES,lang);
        editor.apply();

        Resources resources = getResources();

        locale=new Locale(lang);

        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        getBaseContext().getResources().updateConfiguration(configuration,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();

    }

}
