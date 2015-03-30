package com.example.kdsreng.simpleconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText editText_enteranumer;
    Button button_c2f;
    Button button_f2c;
    TextView textView_showresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_enteranumer = (EditText) findViewById(R.id.id_edittext_enteranumber);
        button_c2f = (Button) findViewById(R.id.id_btn_c2f);
        button_f2c = (Button) findViewById(R.id.id_btn_f2c);
        textView_showresult = (TextView) findViewById(R.id.id_textview_showresult);

    }


    public void F2C(View view) {
        double celcius = 0.0;
        double fahrenheit = 0.0;
        fahrenheit = Double.parseDouble(editText_enteranumer.getText().toString());
        celcius = (5.0 / 9.0) * (fahrenheit - 32);

        String formatResult = String.format("%.02f", fahrenheit);

        textView_showresult.setText(formatResult + "" + ((char) 0x00B0) + "C");

        Toast.makeText(this, "Convert From F to C", Toast.LENGTH_SHORT).show();

    }

    public void C2F(View view) {
        double celcius = 0.0;
        double fahrenheit = 0.0;
        celcius = Double.parseDouble(editText_enteranumer.getText().toString());
        fahrenheit = (9.0 / 5.0) * celcius + 32;

        String formatResult = String.format("%.02f", celcius);

        textView_showresult.setText(formatResult + "" + ((char) 0x00B0) + "F");

        Toast.makeText(this, "Convert From C to F", Toast.LENGTH_SHORT).show();

    }
}
