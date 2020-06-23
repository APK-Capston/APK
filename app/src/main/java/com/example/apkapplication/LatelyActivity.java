package com.example.apkapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LatelyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lately);

        ListView listview;
        LatelyAdapter adapter;

        // Adapter 생성
        adapter = new LatelyAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.lately_list);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem("안동 문화24 주차장", "41/100");
        // 두 번째 아이템 추가.
        adapter.addItem("안동 공용 주차장", "74/150");
        adapter.addItem("옥동 공용 주차장", "139/150");
        adapter.addItem("□□ 주차장", "98/120");

        ImageButton back=(ImageButton)findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }
        });
    }
}
