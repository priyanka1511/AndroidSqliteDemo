package com.example.androidsqlitedemo.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidsqlitedemo.R;
import com.example.androidsqlitedemo.dao.MyController;
import com.example.androidsqlitedemo.model.User;

public class AddStudentActivity extends AppCompatActivity {
    EditText sName,fName,contact,number;
    private void init(){
        sName=findViewById(R.id.sName);
        fName=findViewById(R.id.fName);
        contact=findViewById(R.id.phone);
        number=findViewById(R.id.no);
        MyController.init(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        init();

    }
    public void onClick(View view){
        User user=new User();
        user.setsName(sName.getText().toString());
        user.setContact(contact.getText().toString());
        user.setfName(fName.getText().toString());
        user.setNumber(number.getText().toString());
        long a = MyController.addUser(user);
        if(a>0){
            Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }


    }
}
