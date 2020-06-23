package com.example.apkapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ReserveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        ListView listview;
        ReserveAdapter adapter;

        // Adapter 생성
        adapter = new ReserveAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.reserve_list);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.logo),
                "안동 문화24 주차장", "06.09(화) 오전 11:00 - 오후 02:30 (3시간30분)");
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.logo),
                "안동 공용 주차장", "05.22(금) 오후 05:00 - 오후 09:00 (4시간)");

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
