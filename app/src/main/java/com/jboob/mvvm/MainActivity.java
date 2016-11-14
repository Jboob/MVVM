package com.jboob.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.jboob.mvvm.MainActivityBinding;
import com.jboob.mvvm.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User("Test", "User");
        binding.setUser(user);
    }
}
