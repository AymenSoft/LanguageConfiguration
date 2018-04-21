package com.aymensoft.languageconfiguration;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class Launch extends Application {

    String sLanguage;

    Locale firstLaunchLocale;

    @Override
    public void onCreate() {
        super.onCreate();
        //read User SharedPreferences
        Variables.sharedpreferences=getSharedPreferences(Variables.USERSESSION, MODE_PRIVATE);
        sLanguage=Variables.sharedpreferences.getString(Variables.LANGUAGEPREFERENCES, "default");
        firstLaunchLocale=new Locale(sLanguage);
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(firstLaunchLocale);
        getBaseContext().getResources().updateConfiguration(configuration,
                getBaseContext().getResources().getDisplayMetrics());
    }
}
