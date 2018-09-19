package com.example.sherin.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private String dist1 = "Not Found";
    private TextView tvTitle, tvDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle = getIntent().getExtras();//j value pass korci se gulo recive korbe

        if (bundle != null) {
            dist1 = bundle.getString("dist");// recieve
        }

        initView();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvDistId);
        tvDetails = findViewById(R.id.tvDetailsId);
        tvTitle.setText(dist1);

        if (dist1.equalsIgnoreCase("dhaka")) {
            String s = getResources().getString(R.string.Dhaka);
            tvDetails.setText(s);
        } else if (dist1.equalsIgnoreCase("khulna")) {
            String s = getResources().getString(R.string.khulna);
            tvDetails.setText(s);
        }
    }

    //jodi kno phn a back a na jawa jai ta hole use korbo a ta
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {//home button
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

