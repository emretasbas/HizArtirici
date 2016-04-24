package com.example.envy_m6.hizartirici;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn1, btn2;
    int sayi;
    int sayiEkle = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);
        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);

        btn2.setEnabled(false);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sayi<10){
                    sayi++;
                }else if (sayi>=10){
                    sayi += sayiEkle;
                }
                if (sayi>0 && sayi%10==0){
                    btn2.setEnabled(true);
                }

                tv.setText("Sayı: " + sayi);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                artirici();
                btn2.setEnabled(false);
            }
        });

    }

    public void artirici(){
        for (int i=0;i<sayi;i++){
            if (i%10==0){
                sayiEkle++;
            }
        }
    }
}
