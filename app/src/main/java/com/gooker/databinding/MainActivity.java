package com.gooker.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gooker.databinding.uis.ListViewDataBingActivity;
import com.gooker.databinding.uis.SimpleDataBingActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSimpleDb).setOnClickListener(this);
        findViewById(R.id.btnListDb).setOnClickListener(this);

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btnSimpleDb:
                intent = new Intent(this, SimpleDataBingActivity.class);
                break;
            case R.id.btnListDb:
                intent = new Intent(this, ListViewDataBingActivity.class);
                break;
        }
        if (null != intent) {
            startActivity(intent);
        }
    }
}
