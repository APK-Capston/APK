package com.example.apkapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {
    static final String[] LIST_MENU={"\n[공지] APK(Andong Parking) 약관 개정 안내(서비스 이용약관, 위치기반 서비스 이용 약관)\n",
    "\n[공지] 주차장 좌석 예약 오류 수정\n","\n[긴급 공지] APK 최신버전 업데이트 필요 안내\n",
            "\n[긴급 공지] APK 20.06.09 정기점검 안내\n"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simple_list_item_1, LIST_MENU) ;

        ListView listview = (ListView) findViewById(R.id.notice_list) ;
        listview.setAdapter(adapter) ;
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                String strText = (String) parent.getItemAtPosition(position) ;

                // TODO : use strText
            }
        }) ;

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