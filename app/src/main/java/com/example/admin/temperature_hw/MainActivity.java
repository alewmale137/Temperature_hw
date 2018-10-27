package com.example.admin.temperature_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.temperature_hw.model.Body;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button CtoFButton = findViewById(R.id.buttonCtoF);
        CtoFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.textView_show);
                EditText tempEditText = findViewById(R.id.editText);

                String temp = tempEditText.getText().toString();
                Body b = new Body(Integer.parseInt(temp));

                String fah = String.format("%.2f",b.CtoF());
                show.setText(fah);

            }
        });

        Button FtoCButton = findViewById(R.id.buttonFtoC);
        FtoCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.textView_show);
                EditText tempEditText = findViewById(R.id.editText);

                String temp = tempEditText.getText().toString();
                Body b = new Body(Integer.parseInt(temp));

                String fah = String.format("%.2f",b.FtoC());
                show.setText(fah);

            }
        });

    }
}