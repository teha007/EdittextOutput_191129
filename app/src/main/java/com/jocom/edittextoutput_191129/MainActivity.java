package com.jocom.edittextoutput_191129;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.xeoh.android.texthighlighter.TextHighlighter;

public class MainActivity extends AppCompatActivity {

    EditText search;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        textView = findViewById(R.id.text);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TextHighlighter()
                        .setBackgroundColor(Color.parseColor("#FFFF00"))
                        .setForegroundColor(Color.RED)
                        .addTarget(textView)
                        .highlight(search.getText().toString(),TextHighlighter.BASE_MATCHER);

            }
        });
    }
}
