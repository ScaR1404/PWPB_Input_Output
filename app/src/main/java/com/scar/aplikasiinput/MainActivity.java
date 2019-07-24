package com.scar.aplikasiinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eNama;
    private EditText eAlamat;
    private EditText eBarang;
    private EditText eJumlah;
    private Button bTombol;
    private TextView tOutputNama;
    private TextView tOutputAlamat;
    private TextView tOutputBarang;
    private TextView tOutputJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.idnama);
        eAlamat = findViewById(R.id.idalamat);
        eBarang = findViewById(R.id.idbarang);
        eJumlah = findViewById(R.id.idjumlah);
        bTombol = findViewById(R.id.btombol);
        tOutputNama = findViewById(R.id.tOutputNama);
        tOutputAlamat = findViewById(R.id.tOutputAlamat);
        tOutputBarang = findViewById(R.id.tOutputBarang);
        tOutputJumlah = findViewById(R.id.tOutputJumlah);

        bTombol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btombol) ;
        String inputNama = eNama.getText().toString();
        String inputAlamat = eAlamat.getText().toString();
        String inputBarang = eBarang.getText().toString();
        String inputJumlah = eJumlah.getText().toString();

        if (inputNama.length()==0){
            eNama.setError("Data tidak boleh kosong");
        } else {
            tOutputNama.setText(inputNama);
        } if (inputAlamat.length()==0){
            eAlamat.setError("Data tidak boleh kosong");
        } else {
            tOutputAlamat.setText(inputAlamat);
        } if (inputBarang.length()==0){
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputBarang.setText(inputBarang);
        } if (inputJumlah.length()==0){
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputJumlah.setText(inputJumlah);
        }
    }
}
