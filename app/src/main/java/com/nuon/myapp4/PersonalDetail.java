package com.nuon.myapp4;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
public class PersonalDetail extends AppCompatActivity {
    EditText firstNameEditText,sureNameEditText,stateEditText,suburbEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);
        firstNameEditText = (EditText) findViewById(R.id.editTextFirstName);
        sureNameEditText = (EditText) findViewById(R.id.editTextSureName);
        stateEditText = (EditText) findViewById(R.id.editTextState);
        suburbEditText = (EditText) findViewById(R.id.editTextSuburb);
        Button btnSaveReturn =(Button) findViewById(R.id.btn_save_display);
        btnSaveReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("FirstName", firstNameEditText.getText().toString());
                intent.putExtra("SureName", sureNameEditText.getText().toString());
                intent.putExtra("State", stateEditText.getText().toString());
                intent.putExtra("Suburb", suburbEditText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
    public void onBackPressed () {
        Log.i("Result Detail", "Back Button Pressed");
        firstNameEditText = (EditText) findViewById(R.id.editTextFirstName);
        sureNameEditText = (EditText) findViewById(R.id.editTextSureName);
        stateEditText = (EditText) findViewById(R.id.editTextState);
        suburbEditText = (EditText) findViewById(R.id.editTextSuburb);
        Intent intent = new Intent();
        intent.putExtra("FirstNameValue", firstNameEditText.getText().toString());
        intent.putExtra("SureNameValue", sureNameEditText.getText().toString());
        intent.putExtra("StateValue", stateEditText.getText().toString());
        intent.putExtra("SuburbValue", suburbEditText.getText().toString());
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }
}
