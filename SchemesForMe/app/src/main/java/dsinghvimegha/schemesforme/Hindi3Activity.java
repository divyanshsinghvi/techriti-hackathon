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

public class Hindi3Activity extends AppCompatActivity {


    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi3);
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

        text = "वह योजना चुनें, जिसके लिए आप अपनी पात्रता जानना चाहते हैं" +
                "अनुसूचित जाति  के लिए प्रथम चेकबॉक्स चुनें" +
                "सामान्य के लिए दूसरा चेकबॉक्स चुनें" +
                "अनुसूचित जनजाति के लिए तीसरा चेकबॉक्स चुनें" +
                "अन्य पिछड़े वर्ग के लिए अंतिम चेकबॉक्स चुनें";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton7:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioButton3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radioButton5:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radioButton6:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
    public void next(View view){
        Intent intent = new Intent(this, Hindi4Activity.class);
        startActivity(intent);

    }
    public void previous(View view){
        Intent intent = new Intent(this, Hindi2Activity.class);
        startActivity(intent);

    }
}
