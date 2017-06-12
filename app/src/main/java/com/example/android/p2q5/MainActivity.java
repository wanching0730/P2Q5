package com.example.android.p2q5;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

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
        arrayList.add(new SalesAgent("wan ching", "www.youtube.com", "tel:0164558863"));
        arrayList.add((new SalesAgent("wan fang", "www.youtube.com", "tel:0164558878")));
        arrayList.add((new SalesAgent("wan theng", "www.youtube.com", "tel:0164559999")));
        arrayList.add((new SalesAgent("jason", "www.youtube.com", "tel:0161234567")));
        arrayList.add((new SalesAgent("john", "www.youtube.com", "tel:0168888888")));

        listView = (ListView) findViewById(R.id.list_view);
        adapter = new AgentAdapter(this, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final SalesAgent agent = arrayList.get(position);

                TextView phone_field = (TextView)view.findViewById(R.id.phone);
                phone_field.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(agent.getPhone()));
                        startActivity(intent);
                    }
                });
            }
        });







    }
}
