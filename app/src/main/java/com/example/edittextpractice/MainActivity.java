package com.example.edittextpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayHello(View v) {
        TextView text = (TextView) findViewById(R.id.txv);
        EditText input = (EditText) findViewById(R.id.edit);

        String output = input.getText().toString();

        if (output.length() == 0) {
            text.setText(R.string.hello);
        }
        else {
            output = output + ", Hello";
            text.setText(output);
        }

    }
}
