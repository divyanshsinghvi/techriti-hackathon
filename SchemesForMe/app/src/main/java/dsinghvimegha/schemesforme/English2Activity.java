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

public class English2Activity extends AppCompatActivity {

    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english2);
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
                result = toSpeechUs.setLanguage(Locale.UK);
            }
        });
    }
    public void TTS(View view){

        text = "Choose your annual income range. " +
                "For less than 3 Lakh select first checkbox." +
                "Between 3 to 6 Lakh select second checkbox." +
                "Between 6 to 12 Lakh select third checkbox." +
                "Bettween 12 to 18 Lakh select last option.";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }

    public void next(View view){
        Intent intent = new Intent(this, English3Activity.class);
        startActivity(intent);

    }
    public void previous(View view){
        Intent intent = new Intent(this, English1Activity.class);
        startActivity(intent);

    }
}
