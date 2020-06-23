package com.example.apkapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        ImageButton map=(ImageButton)findViewById(R.id.map_btn);
        map.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), GoMapActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ImageButton home=(ImageButton)findViewById(R.id.home_btn);
        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton services=(ImageButton)findViewById(R.id.services_btn);
        services.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ServicesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton modify=(ImageButton)findViewById(R.id.modify_btn);
        modify.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ModifyActivity.class);
                startActivity(intent);
            }
        });

        Button notice=(Button)findViewById(R.id.notice_btn);
        notice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), NoticeActivity.class);
                startActivity(intent);
            }
        });

        Button reserve=(Button)findViewById(R.id.reserve_btn);
        reserve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ReserveActivity.class);
                startActivity(intent);
            }
        });

        Button lately=(Button)findViewById(R.id.lately_btn);
        lately.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), LatelyActivity.class);
                startActivity(intent);
            }
        });

        Button favorite=(Button)findViewById(R.id.favorite_btn);
        favorite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), FavoriteActivity.class);
                startActivity(intent);
            }
        });

        Button push=(Button)findViewById(R.id.push_btn);
        push.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PUSH 버튼 작동", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("로그아웃 하시겠습니까?");

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onBackPressed();
                finish();
            }
        });
        builder.setNegativeButton("아니오", null);

        builder.show();
    }
}
