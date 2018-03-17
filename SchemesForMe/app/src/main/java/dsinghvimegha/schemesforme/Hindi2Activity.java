package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Hindi2Activity extends AppCompatActivity {


    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi2);
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
    }
    public void TTS(View view){

        text = "वह योजना चुनें, जिसके लिए आप अपनी पात्रता जानना चाहते हैं\n" +
                "3 से 6 लाख के लिए प्रथम चेकबॉक्स चुनें" +
                "3 लाख से कम के लिए दूसरा चेकबॉक्स चुनें" +
                "6 से 12 लाख के लिए तीसरा चेकबॉक्स चुनें" +
                "12 से 18 लाख के लिए अंतिम चेकबॉक्स चुनें";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }

    public void next(View view){
        Intent intent = new Intent(this, Hindi3Activity.class);
        startActivity(intent);

    }

    public void previous(View view){
        Intent intent = new Intent(this, Hindi1Activity.class);
        startActivity(intent);

    }
}
