package com.example.picture_sharing_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText etnewPwd;
    private EditText etnewAccount;
    private EditText etconnewPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.register_toolbar);
        setSupportActionBar(myToolbar);
        etconnewPwd = findViewById(R.id.et_connewpwd);
        etnewPwd = findViewById(R.id.et_newpwd);
        etnewAccount=findViewById(R.id.et_newaccount);
        Button btChange=findViewById(R.id.bt_changepwd);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {  //返回按钮点击事件
            @Override
            public void onClick(View v) {
                Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}