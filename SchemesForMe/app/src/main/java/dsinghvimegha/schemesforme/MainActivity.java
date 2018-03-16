package dsinghvimegha.schemesforme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
