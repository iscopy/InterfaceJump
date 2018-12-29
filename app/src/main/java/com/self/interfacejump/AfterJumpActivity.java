package com.self.interfacejump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterJumpActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_jump);

        Button btn_default = findViewById(R.id.btn_default);
        Button btn_default1 = findViewById(R.id.btn_default1);
        Button btn_default2 = findViewById(R.id.btn_default2);
        Button btn_default3 = findViewById(R.id.btn_default3);
        Button btn_default4 = findViewById(R.id.btn_default4);
        Button btn_default5 = findViewById(R.id.btn_default5);
        Button btn_default6 = findViewById(R.id.btn_default6);

        btn_default5.setOnClickListener(this);
        btn_default6.setOnClickListener(this);
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
                finish();
                break;
            case R.id.btn_default1:
                finish();
                overridePendingTransition(android.R.anim.fade_in,0);
                break;
            case R.id.btn_default2:
                finish();
                overridePendingTransition(android.R.anim.fade_out,0);
                break;
            case R.id.btn_default3:
                finish();
                overridePendingTransition(android.R.anim.slide_in_left,0);
                break;
            case R.id.btn_default4:
                finish();
                overridePendingTransition(android.R.anim.slide_out_right,0);
                break;
            case R.id.btn_default5:
                finish();
                overridePendingTransition(R.anim.anim_in,0);
                break;
            case R.id.btn_default6:
                finish();
                overridePendingTransition(R.anim.anim_out,0);
                break;
        }
    }
}
