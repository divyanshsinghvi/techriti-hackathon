package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Locale;

public class Hindi1Activity extends AppCompatActivity {


    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        toSpeechUs = new TextToSpeech(this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int i) {
                result = toSpeechUs.setLanguage(new Locale("hin"));
            }
        });
    }
    public void TTS(View view){

        text = "वह योजना चुनें, जिसके लिए आप अपनी पात्रता जानना चाहते हैं।" +
                "आवास के लिए प्रथम चेकबॉक्स चुनें।" +
                "वित्तीय के लिए दूसरा चेकबॉक्स चुनें।" +
                "शिक्षात्मक के लिए तीसरा चेकबॉक्स चुनें।" +
                "अन्य के लिए अंतिम चेकबॉक्स चुनें।";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }
    public void nexti(View view){
        Intent intent = new Intent(this,Hindi2Activity.class);
        startActivity(intent);
        toSpeechUs.stop();

    }
    public void previous(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        toSpeechUs.stop();

    }
}
