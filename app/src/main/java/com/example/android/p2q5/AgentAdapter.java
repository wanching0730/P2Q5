package com.example.android.p2q5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 12/6/2017.
 */

public class AgentAdapter extends ArrayAdapter<SalesAgent> {

    public AgentAdapter(Activity context, ArrayList<SalesAgent> agents){
        super(context, 0, agents);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //change background colours
        listItemView.setBackgroundColor(getContext().getResources().getColor(R.color.colorSkyBlue));

        final SalesAgent currentAgent = getItem(position);

        TextView name_field = (TextView) listItemView.findViewById(R.id.name);
        TextView website_field = (TextView) listItemView.findViewById(R.id.website);
        TextView phone_field = (TextView) listItemView.findViewById(R.id.phone);

        name_field.setText(currentAgent.getName());
        website_field.setText(currentAgent.getWebsite());
        phone_field.setText(currentAgent.getPhone());
//        phone_field.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(Intent.ACTION_DIAL);
//                        intent.setData(Uri.parse(currentAgent.getPhone()));
//                        getContext().startActivity(intent);
//                    }
//                });

        return listItemView;
    }
}

