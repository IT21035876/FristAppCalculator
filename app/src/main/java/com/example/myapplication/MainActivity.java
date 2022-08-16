package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the programming with view in the layout

        et=findViewById(R.id.edYear);
        btn=findViewById(R.id.button);
        tv=findViewById(R.id.tvage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer birthYear = Integer.parseInt(et.getText().toString());
                Integer currentYear= Calendar.getInstance().get(Calendar.YEAR);
                Integer age=currentYear-birthYear;

                tv.setText("Your Age is"+age+" Years");
            }
        });
    }
}