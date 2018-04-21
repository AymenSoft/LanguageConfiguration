# LanguageConfiguration

<p>1-Create Variables Class Java to save shared preferences, and add language variable inside</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#808080;">//SharedPreferences
</span><span style="color:#cc7832;">public static </span>SharedPreferences <span style="color:#9876aa;font-style:italic;">sharedpreferences</span><span style="color:#cc7832;">;
</span><span style="color:#808080;">//User SharedPreferences
</span><span style="color:#cc7832;">public static final </span>String <span style="color:#9876aa;font-style:italic;">USERSESSION </span>= <span style="color:#6a8759;">&quot;usersession&quot; </span><span style="color:#cc7832;">;
public static final </span>String <span style="color:#9876aa;font-style:italic;">LANGUAGEPREFERENCES </span>= <span style="color:#6a8759;">&quot;language_preferences&quot; </span><span style="color:#cc7832;">;</span></pre>
<p>2-Create Launch Class Java extend Application to controle application 
language on startup</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#cc7832;">public class </span>Launch <span style="color:#cc7832;">extends </span>Application</pre>
<p>3-Add Launch Class to Manifest.xml</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#9876aa;">android</span><span style="color:#bababa;">:name=</span><span style="color:#6a8759;">&quot;.Launch&quot;</span></pre>
<p>4-after creating strings.xml languages, add buttons to change language and 
save it in shared preferences</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#9876aa;">btnEN</span>.setOnClickListener(<span style="color:#cc7832;">new </span>View.OnClickListener() {
    <span style="color:#bbb529;">@Override
    </span><span style="color:#cc7832;">public void </span><span style="color:#ffc66d;">onClick</span>(View v) {
        changeLanguage(<span style="color:#6a8759;">&quot;en&quot;</span>)<span style="color:#cc7832;">;
    </span>}
})<span style="color:#cc7832;">;

</span><span style="color:#9876aa;">btnAr</span>.setOnClickListener(<span style="color:#cc7832;">new </span>View.OnClickListener() {
    <span style="color:#bbb529;">@Override
    </span><span style="color:#cc7832;">public void </span><span style="color:#ffc66d;">onClick</span>(View v) {
        changeLanguage(<span style="color:#6a8759;">&quot;ar&quot;</span>)<span style="color:#cc7832;">;
    </span>}
})<span style="color:#cc7832;">;</span></pre>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="color:#cc7832;">public void </span><span style="color:#ffc66d;">changeLanguage</span>(String lang){

    Variables.<span style="color:#9876aa;font-style:italic;">sharedpreferences </span>= getSharedPreferences(Variables.<span style="color:#9876aa;font-style:italic;">USERSESSION</span><span style="color:#cc7832;">, </span><span style="color:#9876aa;font-style:italic;">MODE_PRIVATE</span>)<span style="color:#cc7832;">;
    </span>SharedPreferences.Editor editor = Variables.<span style="color:#9876aa;font-style:italic;">sharedpreferences</span>.edit()<span style="color:#cc7832;">;
    </span>editor.putString(Variables.<span style="color:#9876aa;font-style:italic;">LANGUAGEPREFERENCES</span><span style="color:#cc7832;">,</span>lang)<span style="color:#cc7832;">;
    </span>editor.apply()<span style="color:#cc7832;">;

    </span>Resources resources = getResources()<span style="color:#cc7832;">;

    </span><span style="color:#9876aa;">locale</span>=<span style="color:#cc7832;">new </span>Locale(lang)<span style="color:#cc7832;">;

    </span>Configuration configuration = resources.getConfiguration()<span style="color:#cc7832;">;
    </span>configuration.setLocale(<span style="color:#9876aa;">locale</span>)<span style="color:#cc7832;">;
    </span>getBaseContext().getResources().updateConfiguration(configuration<span style="color:#cc7832;">,
            </span>getBaseContext().getResources().getDisplayMetrics())<span style="color:#cc7832;">;
    </span>recreate()<span style="color:#cc7832;">;

</span>}</pre>
<p>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
</p>
