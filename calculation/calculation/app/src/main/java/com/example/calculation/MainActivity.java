package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btcong, bttru, btnhan, btchia;
    private EditText editA, editB;
    private ListView lv_history;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcong = findViewById(R.id.cong);
        bttru = findViewById(R.id.tru);
        btnhan = findViewById(R.id.nhan);
        btchia = findViewById(R.id.chia);

        btcong.setOnClickListener(this);
        bttru.setOnClickListener(this);
        btnhan.setOnClickListener(this);
        btchia.setOnClickListener(this);

        editA = findViewById(R.id.edit_a);
        editB = findViewById(R.id.edit_b);

        lv_history = findViewById(R.id.lv_history);
        arrayList = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        lv_history.setAdapter(arrayAdapter);
    }
    public  void onClick(View view){
        float a = Float.parseFloat(editA.getText().toString());
        float b = Float.parseFloat(editB.getText().toString());
        float kq;
        if(view == btcong){
            kq = a+b;
            arrayList.add(a + " + " + b + " = " + kq);
            arrayAdapter.notifyDataSetChanged();
        }
        if(view == bttru){
            kq = a-b;
            arrayList.add(a + " - " + b + " = " + kq);
            arrayAdapter.notifyDataSetChanged();
        }
        if(view == btnhan){
            kq = a*b;
            arrayList.add(a + " * " + b + " = " + kq);
            arrayAdapter.notifyDataSetChanged();
        }
        if(view == btchia){
            kq = a/b;
            arrayList.add(a + " / " + b + " = " + kq);
            arrayAdapter.notifyDataSetChanged();
        }
    }
}