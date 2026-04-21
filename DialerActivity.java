package com.example.portfolioapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DialerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);

        findViewById(R.id.btnCall).setOnClickListener(v -> {
            String num = ((android.widget.EditText)findViewById(R.id.etNumber)).getText().toString();
            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:" + num));
            startActivity(i);
        });
    }
}
