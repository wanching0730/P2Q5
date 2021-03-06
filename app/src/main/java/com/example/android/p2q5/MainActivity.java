package com.example.android.p2q5;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private AgentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<SalesAgent> arrayList = new ArrayList<SalesAgent>();
        arrayList.add(new SalesAgent("wan ching", "http://www.hkdrama.com", "tel:0164558863"));
        arrayList.add((new SalesAgent("wan fang", "http://www.google.com", "tel:0164558878")));
        arrayList.add((new SalesAgent("wan theng", "http://www.youtube.com", "tel:0164559999")));
        arrayList.add((new SalesAgent("jason", "http://www.utar.com", "tel:0161234567")));
        arrayList.add((new SalesAgent("john", "http://www.github.com", "tel:0168888888")));

        listView = (ListView) findViewById(R.id.list_view);
        adapter = new AgentAdapter(this, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final SalesAgent agent = arrayList.get(position);

                Toast.makeText(MainActivity.this, agent.getName() + " is selected", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
