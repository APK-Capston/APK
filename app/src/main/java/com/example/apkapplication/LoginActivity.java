package com.example.apkapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText cnum_login=(EditText)findViewById(R.id.cnum);
        final EditText phnum_login=(EditText)findViewById(R.id.phnum);
        cnum_login.setImeOptions(EditorInfo.IME_ACTION_DONE);
        cnum_login.setOnEditorActionListener(new TextView.OnEditorActionListener()
        {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId==EditorInfo.IME_ACTION_DONE){

                }

                return false;
            }
        });

        ImageButton log=(ImageButton)findViewById(R.id.log_btn);
        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(phnum_login.getText().toString().equals("1234")&&cnum_login.getText().toString().equals("1234")) {
                    Intent intent = new Intent(getApplication(), MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), R.string.login_error_toast, Toast.LENGTH_LONG).show();
                }
            }
        });

        ImageButton reg=(ImageButton)findViewById(R.id.reg_btn);
        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), RegistrationActivity.class);
                startActivity(intent);
            }
        });

        ImageButton skip=(ImageButton)findViewById(R.id.skip_btn);
        skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
