package com.itsmesou.hgrtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Collection;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B1=(ImageButton)findViewById(R.id.button1);
        B2=(ImageButton)findViewById(R.id.button2);
        B3=(ImageButton)findViewById(R.id.button3);
        B4=(ImageButton)findViewById(R.id.button4);
        B5=(ImageButton)findViewById(R.id.button5);
        B6=(ImageButton)findViewById(R.id.button6);
        B7=(ImageButton)findViewById(R.id.button7);
        B8=(ImageButton)findViewById(R.id.button8);
        B9=(ImageButton)findViewById(R.id.button9);
        B10=(ImageButton)findViewById(R.id.button10);
        B11=(ImageButton)findViewById(R.id.button11);
        B12=(ImageButton)findViewById(R.id.button12);
        B13=(ImageButton)findViewById(R.id.button13);
        B14=(ImageButton)findViewById(R.id.button14);
        B15=(ImageButton)findViewById(R.id.button15);
        B16=(ImageButton)findViewById(R.id.button16);

        //arrays
        Integer[] images= {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5, R.drawable.m6, R.drawable.m7, R.drawable.m8,
                R.drawable.m9, R.drawable.m10, R.drawable.m11, R.drawable.m12, R.drawable.m13, R.drawable.m14, R.drawable.m15, R.drawable.m16
        };
        //array which will be assigned to buttons
        Integer[] current=images;

        //Shuffling array
        for(int i=0; i<current.length;i++)
        {
            int index=(int)(Math.random() * current.length);
            Integer temp= current[i];
            current[i]=current[index];
            current[index]=temp;

        }
        int i=0;
        B1.setBackgroundResource(current[i]);
        B2.setBackgroundResource(current[i+1]);
        B3.setBackgroundResource(current[i+2]);
        B4.setBackgroundResource(current[i+3]);
        B5.setBackgroundResource(current[i+4]);
        B6.setBackgroundResource(current[i+5]);
        B7.setBackgroundResource(current[i+6]);
        B8.setBackgroundResource(current[i+7]);
        B9.setBackgroundResource(current[i+8]);
        B10.setBackgroundResource(current[i+9]);
        B11.setBackgroundResource(current[i+10]);
        B12.setBackgroundResource(current[i+11]);
        B13.setBackgroundResource(current[i+12]);
        B14.setBackgroundResource(current[i+13]);
        B15.setBackgroundResource(current[i+14]);
        B16.setBackgroundResource(current[i+15]);


    }

    public void Button1(View view)
    {
        Toast.makeText(MainActivity.this,"Button 1",Toast.LENGTH_SHORT).show();


    }
    public void Button2(View view)
    {
        Toast.makeText(MainActivity.this,"Button 2",Toast.LENGTH_SHORT).show();

    }
    public void Button3(View view)
    {
        Toast.makeText(MainActivity.this,"Button 3",Toast.LENGTH_SHORT).show();

    }
    public void Button4(View view)
    {
        Toast.makeText(MainActivity.this,"Button 4",Toast.LENGTH_SHORT).show();

    }
    public void Button5(View view)
    {
        Toast.makeText(MainActivity.this,"Button 5",Toast.LENGTH_SHORT).show();

    }
    public void Button6(View view)
    {
        Toast.makeText(MainActivity.this,"Button 6",Toast.LENGTH_SHORT).show();

    }
    public void Button7(View view)
    {
        Toast.makeText(MainActivity.this,"Button 7",Toast.LENGTH_SHORT).show();

    }
    public void Button8(View view)
    {
        Toast.makeText(MainActivity.this,"Button 8",Toast.LENGTH_SHORT).show();

    }
    public void Button9(View view)
    {
        Toast.makeText(MainActivity.this,"Button 9",Toast.LENGTH_SHORT).show();

    }
    public void Button10(View view)
    {
        Toast.makeText(MainActivity.this,"Button 10",Toast.LENGTH_SHORT).show();

    }
    public void Button11(View view)
    {
        Toast.makeText(MainActivity.this,"Button 11",Toast.LENGTH_SHORT).show();

    }
    public void Button12(View view)
    {
        Toast.makeText(MainActivity.this,"Button 12",Toast.LENGTH_SHORT).show();

    } public void Button13(View view)
    {
        Toast.makeText(MainActivity.this,"Button 13",Toast.LENGTH_SHORT).show();

    }
    public void Button14(View view)
    {
        Toast.makeText(MainActivity.this,"Button 14",Toast.LENGTH_SHORT).show();

    }
    public void Button15(View view)
    {
        Toast.makeText(MainActivity.this,"Button 15",Toast.LENGTH_SHORT).show();

    } public void Button16(View view)
    {
        Toast.makeText(MainActivity.this,"Button 16",Toast.LENGTH_SHORT).show();

    }


}