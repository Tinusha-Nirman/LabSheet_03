package com.example.labsheet03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    // call when user tap send button
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageAvtivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();

        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
}
