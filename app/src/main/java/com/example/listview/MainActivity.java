package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<AoThun> aoThunList;
    private CustomerAoThunAdapter aoThunAdapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {
        aoThunList =  new ArrayList<>();
        addData();
        aoThunAdapter = new CustomerAoThunAdapter(this,R.layout.item_listview,aoThunList);
        listView = findViewById(R.id.lvAoThun);
        listView.setAdapter(aoThunAdapter);
    }

    private void addData() {
        aoThunList.add(new AoThun(R.drawable.aothun,"Google",80));
        aoThunList.add(new AoThun(R.drawable.aothun,"Google",80));
        aoThunList.add(new AoThun(R.drawable.aothun,"Google",80));
        aoThunList.add(new AoThun(R.drawable.aothun,"Google",80));



    }
}