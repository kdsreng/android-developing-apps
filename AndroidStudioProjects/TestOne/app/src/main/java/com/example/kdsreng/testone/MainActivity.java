package com.example.kdsreng.testone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.id_edittext_enteranumber);
    }



    public void doubleIt(View view) {
        int x = Integer.parseInt(editText.getText().toString());
        editText.setText((2*x) + "");
    }

    public void tripleIt(View view) {
        int x = Integer.parseInt(editText.getText().toString());
        editText.setText((3*x) + "");
    }
}
