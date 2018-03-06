package com.example.sarmad.intentassingment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sarmad.intentassingment.Model.Student;

public class DetailActivity extends AppCompatActivity {

     Button mbtNext;
     EditText metInfo;

   Student ostd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        metInfo = (EditText) findViewById(R.id.etInfo);
        mbtNext=(Button)findViewById(R.id.btNext);
        Bundle extras = getIntent().getExtras();

        ostd=(Student) extras.getSerializable("Student");
        Toast.makeText(this,ostd.getName(),Toast.LENGTH_SHORT).show();
        Toast.makeText(this,ostd.getEmail(),Toast.LENGTH_SHORT).show();








       // is detailActivity sy Main 3 py bejhny k ly
        mbtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ostd.setInfo(metInfo.getText().toString());
                Intent in =new Intent(DetailActivity.this,Main3Activity.class);
                in.putExtra("Student",ostd);
                startActivity(in);
            }
        });


       //Class k bagair aisy intent krty hain
       // String name=extras.get("name").toString();
      //  String Roll=extras.get("Roll").toString();
       // Toast.makeText(this,metName.getText(),Toast.LENGTH_SHORT).show();
       // Toast.makeText(this,metEmail.getText(),Toast.LENGTH_SHORT).show();





    }
}
