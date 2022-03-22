package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SENDMSG = "com.example.duastelas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMsg(View view){
        Intent it = new Intent(this,ActivityReceive.class);

        EditText txt = (EditText) findViewById(R.id.sendMsg);
        String msg = txt.getText().toString();
        it.putExtra(SENDMSG, msg);

        startActivity(it);
    }
}