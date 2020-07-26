package com.jasonzhu.resist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    EditText txtname, txtemail, txtnumber, txtpassword;
    DatabaseReference reff;
    ImageButton btnsave;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        txtname=(EditText)findViewById(R.id.text_input);
        txtemail=(EditText)findViewById(R.id.text_input2);
        txtnumber=(EditText)findViewById(R.id.text_input3);
        txtpassword=(EditText)findViewById(R.id.text_input4);
        btnsave = (ImageButton)findViewById(R.id.sign_up_button);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        btnsave.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                    member.setName(txtname.getText().toString().trim());
                    member.setEmail(txtemail.getText().toString().trim());
                    member.setNumber(txtnumber.getText().toString().trim());
                    member.setPassword(txtpassword.getText().toString().trim());
                    reff.push().setValue(member);
                    startActivity(new Intent(SignUp.this, MainActivity.class));
            }
        });
    }
}
