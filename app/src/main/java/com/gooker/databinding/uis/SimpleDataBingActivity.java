package com.gooker.databinding.uis;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gooker.databinding.R;
import com.gooker.databinding.databinding.ActivitySimpleDataBingBinding;
import com.gooker.databinding.domain.User;

import java.util.Date;

public class SimpleDataBingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_simple_data_bing);
        ActivitySimpleDataBingBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple_data_bing);
        User u = new User(20, "zhangsan", 'f', new Date(), "北京市");
        dataBinding.setUser(u);
    }


}
