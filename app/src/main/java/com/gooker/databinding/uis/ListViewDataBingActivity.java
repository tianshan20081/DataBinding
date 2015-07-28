package com.gooker.databinding.uis;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gooker.databinding.R;
import com.gooker.databinding.adapter.UserAdapter;
import com.gooker.databinding.databinding.ActivityListViewDataBingBinding;
import com.gooker.databinding.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListViewDataBingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_view_data_bing);
//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        ActivityListViewDataBingBinding bingBinding = DataBindingUtil.setContentView(this, R.layout.activity_list_view_data_bing);
        List<User> datas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            datas.add(new User(i, "name", 'a', new Date(), "北京" + i));
        }
        UserAdapter adapter = new UserAdapter(this, datas);
        bingBinding.setAdapter(adapter);


    }


}
