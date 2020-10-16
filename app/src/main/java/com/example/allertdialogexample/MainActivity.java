package com.example.allertdialogexample;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName, email, project;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.edit_text_firstName);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.edit_text_email);
        project = findViewById(R.id.edit_text_project);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });
    }

    public void signUp() {
       /* if (firstName.getText().toString().isEmpty()) {
            firstName.setText("fill this please");
            firstName.requestFocus();
            firstName.clearFocus();
            firstName.getText().clear();
        } else if (lastName.getText().toString().isEmpty()) {
            lastName.setText("please fill this");
            lastName.requestFocus();
            lastName.clearFocus();
            lastName.getText().clear();
        } else if (email.getText().toString().isEmpty()) {
            email.setText("please fill this");
            email.requestFocus();
            email.clearFocus();
            email.getText().clear();
        } else if (project.getText().toString().isEmpty()) {
            project.setText("please fill this");
            project.requestFocus();
            project.clearFocus();
        } else if (firstName.getText().toString().equalsIgnoreCase("ukeme") && lastName.getText().toString().equalsIgnoreCase("Elijah")
                && email.getText().toString().equalsIgnoreCase("ukemedmet@gmail.com") && project.getText().toString().equalsIgnoreCase("no")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new NotificationFragment()).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new FailureFragment()).commit();*/
            AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Are you sure that you want to submit this?");
            alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //Toast.makeText(MainActivity.this,"Submission Successful",Toast.LENGTH_SHORT).show();

                      if (firstName.getText().toString().equalsIgnoreCase("ukeme") && lastName.getText().toString().equalsIgnoreCase("Elijah")
                    && email.getText().toString().equalsIgnoreCase("ukemedmet@gmail.com") && project.getText().toString().equalsIgnoreCase("no")) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new SuccessFragment()).commit();
            } else {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new FailureFragment()).commit();
                   // firstName.getText().clear();
                   // lastName.getText().clear();
                   // email.getText().clear();
                   // project.getText().clear();
                }}
            });
            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }



