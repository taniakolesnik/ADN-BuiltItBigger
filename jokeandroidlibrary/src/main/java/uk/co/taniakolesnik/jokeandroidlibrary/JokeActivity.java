package uk.co.taniakolesnik.jokeandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        if (savedInstanceState != null){
            joke = savedInstanceState.getString(getString(R.string.joke_key));
        } else {
            Intent intent = getIntent();
            joke = intent.getStringExtra(getString(R.string.joke_extra));
        }

        TextView textView = (TextView) findViewById(R.id.joke_text_view);
        textView.setText(joke);

        Button button = (Button) findViewById(R.id.joke_close_buton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(getString(R.string.joke_key), joke);
    }

}
