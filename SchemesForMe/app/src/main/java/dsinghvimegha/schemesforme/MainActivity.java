package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech toSpeechUs,toSpeechHi;
    int result;
    int result2;
    String text;
    String text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toSpeechUs = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int i) {
                result = toSpeechUs.setLanguage(Locale.UK);
            }
        });
        toSpeechHi = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int i) {
                result = toSpeechHi.setLanguage(new Locale("hin","IN"));
            }
        });
    }

    public void TTS(View view){

        text = "For English Press Orange Color Button";
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);
        text2 = "Hindi ke liye हरी बटन दबाएं";
        toSpeechHi.speak(text2, TextToSpeech.QUEUE_FLUSH,null);

    }
    public void english(View view){
        Intent intent = new Intent(this, English1Activity.class);
        startActivity(intent);

    }

    public void hindi(View view){
        Intent intent = new Intent(this, Hindi1Activity.class);
        startActivity(intent);

    }

    public void tamil(View view){
        Intent intent = new Intent(this, Tamil1Activity.class);

        startActivity(intent);

    }
}
