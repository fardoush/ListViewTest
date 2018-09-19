package com.example.sherin.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewId);

        final String[] dist= getResources().getStringArray(R.array.dist);

        final ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.tvItemId,dist);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 /* adapterView.getSelectedItem();
                adapterView.getItemAtPosition(i);*/
                String selected=dist[i];

                // Toast.makeText(MainActivity.this, ""+selected, Toast.LENGTH_SHORT).show();

                //Go Details Activity
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("dist",selected);//data niye jawar jonno//data pass next page a
                startActivity(intent);
            }
        });

    }

}
