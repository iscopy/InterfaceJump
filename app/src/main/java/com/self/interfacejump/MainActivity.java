package com.self.interfacejump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn_default = findViewById(R.id.btn_default);
        Button btn_default1 = findViewById(R.id.btn_default1);
        Button btn_default2 = findViewById(R.id.btn_default2);
        Button btn_default3 = findViewById(R.id.btn_default3);
        Button btn_default4 = findViewById(R.id.btn_default4);

        btn_default.setOnClickListener(this);
        btn_default1.setOnClickListener(this);
        btn_default2.setOnClickListener(this);
        btn_default3.setOnClickListener(this);
        btn_default4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_default:
                startActivity(new Intent(MainActivity.this, AfterJumpActivity.class));
                break;
            case R.id.btn_default1:
                startActivity(new Intent(MainActivity.this, AfterJumpActivity.class));
                overridePendingTransition(android.R.anim.fade_in,0);
                break;
            case R.id.btn_default2:
                startActivity(new Intent(MainActivity.this, AfterJumpActivity.class));
                overridePendingTransition(android.R.anim.fade_out,0);
                break;
            case R.id.btn_default3:
                startActivity(new Intent(MainActivity.this, AfterJumpActivity.class));
                overridePendingTransition(android.R.anim.slide_in_left,0);
                break;
            case R.id.btn_default4:
                startActivity(new Intent(MainActivity.this, AfterJumpActivity.class));
                overridePendingTransition(android.R.anim.slide_out_right,0);
                break;
        }
    }
}
