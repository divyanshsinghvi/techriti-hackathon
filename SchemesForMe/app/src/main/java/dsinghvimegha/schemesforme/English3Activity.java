package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

import java.util.Locale;

public class English3Activity extends AppCompatActivity {

    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english3);
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

        text = "Choose Your Category. " +
                "For Scheduled Caste select first checkbox." +
                "For General select second checkbox." +
                "For Scheduled Tribe select third checkbox." +
                "For Other Backward Classes select last option.";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    ((globalClass)getApplication()).setCategory(1);
                    break;
            case R.id.radioButton7:
                if (checked)
                    ((globalClass)getApplication()).setCategory(2);
                    break;
            case R.id.radioButton6:
                if (checked)
                    ((globalClass)getApplication()).setCategory(3);
                    break;
            case R.id.radioButton3:
                if (checked)
                    ((globalClass)getApplication()).setCategory(4);
                    break;
        }
    }

    public void next(View view){
        Intent intent = new Intent(this, English4Activity.class);
        startActivity(intent);
        toSpeechUs.stop();

    }
    public void previous(View view){
        Intent intent = new Intent(this, English2Activity.class);
        startActivity(intent);
        toSpeechUs.stop();

    }
}
