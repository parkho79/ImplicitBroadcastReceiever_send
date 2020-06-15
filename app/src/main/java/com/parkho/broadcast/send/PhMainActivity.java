package com.parkho.broadcast.send;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class PhMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_broadcast).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View a_view) {
                Intent intent = new Intent("com.parkho.broadcat.send.parkho");
                sendBroadcast(intent);
            }
        });
    }
}