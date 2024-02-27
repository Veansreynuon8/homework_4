package com.nuon.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGetDetail = (Button) findViewById(R.id.btn_get_detail);
        btnGetDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PersonalDetail.class);
                startActivityForResult(intent,1);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView txt_tell_all_information = (TextView) findViewById(R.id.text_detail);
        if (requestCode == 1){
            if(resultCode == RESULT_OK){
                String strGetDetail =
                        "Name: " + data.getStringExtra("FirstName" )  + " " +
                                data.getStringExtra("SureName" ) + "\n\n" +
                                "State: " + data.getStringExtra("State") + "\n\n" +
                                "Suburb: " + data.getStringExtra("Suburb");
                txt_tell_all_information.setText(strGetDetail);
            }
        }
    }
}