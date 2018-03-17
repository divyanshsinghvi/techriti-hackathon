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

public class English1Activity extends AppCompatActivity {


    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english1);
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

        text = "Choose Scheme you want to know your eligibility for. " +
                "For Housing press select first checkbox." +
                "For Financial press select second checkbox." +
                "For Educational select third checkbox." +
                "For Other select last option.";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }

    public void next(View view){
        Intent intent = new Intent(this, English2Activity.class);
        startActivity(intent);

    }

    public void previous(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
