package com.example.attendancesheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.attendancesheet.R;
import com.example.attendancesheet.TeacherLogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.click) {
            Intent intent = new Intent(MainActivity.this, TeacherLogin.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.click2) {
            Intent intent = new Intent(MainActivity.this, StudentLogin.class);
            startActivity(intent);


        }
    }
}
