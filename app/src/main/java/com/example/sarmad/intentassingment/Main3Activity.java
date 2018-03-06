package com.example.sarmad.intentassingment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sarmad.intentassingment.Model.Student;

public class Main3Activity extends AppCompatActivity {
  TextView mtvUser,mtvUAns,mtvEmail,mtvEAns,mtvInfo,mtvIAns;
  Student ostd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mtvUser=(TextView) findViewById(R.id.tvUser);
        mtvEmail=(TextView) findViewById(R.id.tvEmail);
        mtvInfo=(TextView) findViewById(R.id.tvInfo);
        mtvUAns=(TextView) findViewById(R.id.tvUAns);
        mtvEAns=(TextView) findViewById(R.id.tvEAns);
        mtvIAns=(TextView) findViewById(R.id.tvIAns);

        Bundle extras = getIntent().getExtras();
        ostd=(Student) extras.getSerializable("Student");
        mtvUAns.setText(ostd.getName().toString());
        mtvEAns.setText(ostd.getEmail().toString());
        mtvIAns.setText(ostd.getInfo().toString());
    }
}
