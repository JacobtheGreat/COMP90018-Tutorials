package com.example.firstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.firstdemo.databinding.ActivityMain2Binding;
import com.example.firstdemo.databinding.ActivityMainBinding;


public class Main2Activity extends AppCompatActivity {
    public static String RECEIVED_MESSAGE = "received message";
    private ActivityMain2Binding binding;

//    @BindView(R.id.previous_message)
//    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main2);

//        ButterKnife.bind(this);

        Intent intent = getIntent();
        binding.previousMessage.setText(intent.getStringExtra(MainActivity.MESSAGE));
    }

    @Override
    public void onBackPressed() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra(RECEIVED_MESSAGE, "Hello from the second activity.");
        setResult(RESULT_OK, returnIntent);

        super.onBackPressed();
    }
}
