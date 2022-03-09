package ru.mirea.shteyn.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button ButtonOk;
    private Button ButtonCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        ButtonOk = (Button) findViewById(R.id.btnOk);
        ButtonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener OclBtnCancel = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");

            }
        };

        ButtonOk.setOnClickListener(oclBtnOk);
        ButtonCancel.setOnClickListener(OclBtnCancel);
    }
}