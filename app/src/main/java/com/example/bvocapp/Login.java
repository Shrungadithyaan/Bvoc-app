package com.example.bvocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText email, password;
    boolean passwordvisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        //password eye
        //email = findViewById(R.id.et_email);
//        password = findViewById(R.id.et_pass);
//
//        password.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                final int Right = 2;
//                if(event.getAction()==MotionEvent.ACTION_UP){
//                    if(event.getRawX()>=password.getRight()-password.getCompoundDrawables()[Right].getBounds().width()){
//                        int selection=password.getSelectionEnd();
//                        if(passwordvisible){
//                            //set drawable image here
//                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_visibility_off_24,0);
//                            //for hide password
//                            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
//                            passwordvisible = false;
//                        }else{
//                            //set drawable image here
//                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_visibility_24,0);
//                            //for visible password
//                            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//                            passwordvisible = true;
//                        }
//                        password.setSelection(selection);
//                        return true;
//                    }
//                }
//                return false;
//            }
//        });


    }

}