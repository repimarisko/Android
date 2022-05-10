package com.example.alphaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fld_2;
    EditText fld_1;

    Button btn_proses;
    TextView txt_hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_hasil = (TextView) findViewById(R.id.txt_hasil);
        fld_1 = (EditText) findViewById(R.id.fld_1);
        fld_2 = (EditText) findViewById(R.id.fld_2);
        btn_proses= (Button)findViewById(R.id.btn_proses);
        btn_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_nama,data_nobp;

                data_nama = String.valueOf(fld_1.getText());
                data_nobp = String.valueOf(fld_2.getText());

                txt_hasil.setText("Nama anda adalah"+data_nama+"\n"+
                                  "NoBp anda adalah"+data_nobp);
            }
        });

    }
}