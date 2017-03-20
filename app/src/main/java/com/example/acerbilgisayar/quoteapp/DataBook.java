package com.example.acerbilgisayar.quoteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

import static com.example.acerbilgisayar.quoteapp.R.id.normal;

public class DataBook extends AppCompatActivity {
    static int count = 0;
    static int randomNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_book);
        RelativeLayout touch = (RelativeLayout) findViewById(R.id.touch);
        RelativeLayout touch2 = (RelativeLayout) findViewById(R.id.touch);
        final TextView dataText = (TextView) findViewById(R.id.quote);
        final TextView meaningText = (TextView) findViewById(R.id.person);
        final TextView welcomeText = (TextView) findViewById(R.id.welcome);
        final ArrayList<Word> dataList = new ArrayList<Word>();

        Word data4 = new Word("4Based around separate development stages with the outputs to be produced at each of these stages planned in advance.  ", "4Plan-driven");
        dataList.add(data4);
        Word data1 = new Word("1Specification, design, implementation and testing are interleaved and the outputs from the development process are decided through a process of negotiation during the software development process. ", "1Agile");
        dataList.add(data1);
        Word data2 = new Word("2Process of checking the requirements for validity, consistency, completeness, realism and verifiability.  ", "2Requirements validation");
        dataList.add(data2);
        Word data3 = new Word("3Plan-driven model. Separate and distinct phases of specification and development. ", "3Waterfall Model");
        dataList.add(data3);
        Word data5 = new Word("5Specification, development and validation are interleaved. May be plan-driven or agile. ", "5Incremental Development");
        dataList.add(data5);

        final Random rand =new Random() ;
        final Word q = dataList.get(count);
        touch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                welcomeText.setText("");
                dataText.setText("");
                Word q = dataList.get(count);
                Log.i("kontrol","count:"+count);
                meaningText.setText(q.getMeaning());
                randomNum=count;
                count=0+rand.nextInt(5);
                while(randomNum==count){
                    count=0+rand.nextInt(5);
                }
                Log.i("kontrol","randomNum:"+randomNum);
                Log.i("kontrol","countClickSon="+count);
            }

        });
        touch.setOnLongClickListener(new  View.OnLongClickListener() {
            public boolean onLongClick(View view){
                Word q = dataList.get(randomNum);
                Log.i("kontrol","CountLong="+count);
                Log.i("kontrol","randNumLong="+randomNum);
                dataText.setText(q.getWord());
                return true;
            }
        }

        );
    }
}
