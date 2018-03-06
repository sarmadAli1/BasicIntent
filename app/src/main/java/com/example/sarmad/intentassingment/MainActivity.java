package com.example.sarmad.intentassingment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sarmad.intentassingment.Model.Student;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button mbtNext;
    EditText metName, metEmail;
    Student ostd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();

    }

    private void Init() {
        mbtNext = (Button) findViewById(R.id.btNext);
        metName = (EditText) findViewById(R.id.etName);
        metEmail = (EditText) findViewById(R.id.etEmail);
        ostd = new Student();
        mbtNext.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btNext:
                Toast.makeText(this, metName.getText().toString(), Toast.LENGTH_SHORT).show();
                ostd.setName(metName.getText().toString());
                ostd.setEmail(metEmail.getText().toString());

                Intent in = new Intent(MainActivity.this, DetailActivity.class);
                in.putExtra("Student", ostd);
                startActivity(in);


        }
    }


}