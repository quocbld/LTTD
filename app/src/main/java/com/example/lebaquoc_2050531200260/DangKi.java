package com.example.lebaquoc_2050531200260;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangKi extends AppCompatActivity {
    Button  btnDangKi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);
        btnDangKi = (Button) findViewById(R.id.btnback);
        btnDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangKi.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}