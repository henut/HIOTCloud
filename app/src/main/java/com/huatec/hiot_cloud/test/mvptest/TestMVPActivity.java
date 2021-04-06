package com.huatec.hiot_cloud.test.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.test.mvptest.module.User;

public class TestMVPActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        Log.d("tag","test");
        final EditText etUerName = findViewById(R.id.et_user_name);
        final EditText etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);
        final User user = new User();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            //登录
            @Override
            public void onClick(View v) {
                //mvc 做法，在这做身份校验
                user.setUserName(etUerName.getText().toString());
                user.setPassword(etPassword.getText().toString());
                login(user);
            }
        });
    }

    private void login(User user) {
        if("hjd".equals(user.getUserName()) && "29".equals(user.getPassword())){
            Toast.makeText(this, "登录成功",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "登录失败",Toast.LENGTH_SHORT).show();
        }
    }
}