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

public class English5Activity extends AppCompatActivity {

    TextToSpeech toSpeechUs;
    int result;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english5);
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
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    ((globalClass)getApplication()).setLoan(1);
                break;
            case R.id.radioButton7:
                if (checked)
                    ((globalClass)getApplication()).setLoan(2);
                break;
            case R.id.radioButton6:
                if (checked)
                    ((globalClass)getApplication()).setLoan(3);
                break;
            case R.id.radioButton3:
                if (checked)
                    ((globalClass)getApplication()).setLoan(4);
                break;
        }
    }
    public void TTS(View view){

        text = "Choose Your Loan Requirement. " +
                "For less than 3 lakh select first checkbox." +
                "Between 3 to 6 lakh select second checkbox." +
                "Between 6 to 10 lakh select third checkbox." +
                "more than 10 lakh select last option.";
        toSpeechUs.setSpeechRate(0.8f);
        toSpeechUs.speak(text, TextToSpeech.QUEUE_FLUSH,null);


    }


    public void next(View view){
        if(((globalClass)getApplication()).income == 1 )
        {
            if(((globalClass)getApplication()).loan == 1 ) {
                Intent intent = new Intent(this, Lt3Activity.class);
                startActivity(intent);
            }
            else if(((globalClass)getApplication()).loan == 2 ) {
                Intent intent = new Intent(this, Lt6Activity.class);
                startActivity(intent);
            }
            else  if(((globalClass)getApplication()).loan == 3 ) {
                Intent intent = new Intent(this, Lt10Activity.class);
                startActivity(intent);
            }
        }
        else  if(((globalClass)getApplication()).income == 2 )
        {
                Intent intent = new Intent(this, Mig1Activity.class);
                startActivity(intent);
        }

        else  if(((globalClass)getApplication()).income == 3 )
        {
            Intent intent = new Intent(this, Mig2Activity.class);
            startActivity(intent);
        }

    }
    public void previous(View view) {
        Intent intent = new Intent(this, English4Activity.class);
        startActivity(intent);

    }

}
