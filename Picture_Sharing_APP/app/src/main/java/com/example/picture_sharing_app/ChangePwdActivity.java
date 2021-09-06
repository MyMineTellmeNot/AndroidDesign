package com.example.picture_sharing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePwdActivity extends AppCompatActivity {
    private EditText etchangePwd;
    private EditText etconchangePwd;
    private EditText etorignPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pwd);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.changepwd_toolbar);
        setSupportActionBar(myToolbar);
        etchangePwd = findViewById(R.id.et_cnewpwd);
        etconchangePwd = findViewById(R.id.et_cconnewpwd);
        etorignPwd = findViewById(R.id.et_orginpwd);
        Button btRegister = findViewById(R.id.bt_register);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {  //返回按钮点击事件
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChangePwdActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
    }
}