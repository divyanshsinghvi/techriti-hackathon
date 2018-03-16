package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech toSpeech;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int i) {
                result = toSpeech.setLanguage(Locale.UK);
                }
        });
    }

    public void TTS(View view){
        text = "Hello लिंग";
        toSpeech.speak(text, TextToSpeech.QUEUE_FLUSH,null);

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
