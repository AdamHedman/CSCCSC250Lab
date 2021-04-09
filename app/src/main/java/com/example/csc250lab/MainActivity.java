package com.example.csc250lab;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText aValue;
    private EditText bValue;
    private TextView cValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.aValue = this.findViewById(R.id.aValue);
        this.bValue = this.findViewById(R.id.bValue);
        this.cValue = this.findViewById(R.id.cValue);

    }

    public void onCalcbuttonclicked(view V)
    {
        this.cValue.setText("");
        this.aValue.getText();
        this.bValue.getText();
    }
    Integer aValue = Integer.valueOf(this.aValue.getText().toString());
    Integer bValue = Integer.valueOf(this.bValue.getText().toString());

    int cValue = 0;

    (bValue * bValue) + (aValue * aValue) = cValue;
    double answer = math.squrt(cValue)


    private Object getText(View aLength) {
    }

}