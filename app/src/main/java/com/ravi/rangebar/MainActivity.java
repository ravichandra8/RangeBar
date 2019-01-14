package com.ravi.rangebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;


public class MainActivity extends AppCompatActivity {

    //For External seekbar
    private RangeBar mRangeBar;
    private TextView rangebarTv;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRangeBar = (RangeBar) findViewById(R.id.rangebar1);
        rangebarTv = (TextView) findViewById(R.id.t2);
        textView=(TextView)findViewById(R.id.t1);


        mRangeBar.setSeekPinByIndex(18);//Inital progress value

        //For the text inside the Pin(Bubble)
        mRangeBar.setPinTextColor(getResources().getColor(R.color.colorPrimary));

        //For the selector of Rangebar
        mRangeBar.setSelectorColor(getResources().getColor(R.color.colorAccent));
        //For the small pins of Rangebar
        mRangeBar.setTickColor(getResources().getColor(R.color.colorAccent));

        //Color of the line after seeking
        mRangeBar.setConnectingLineColor(getResources().getColor(R.color.colorAccent));

        //Color of the pin(Bubble)
        mRangeBar.setPinColor(getResources().getColor(R.color.colorAccent));

        //When you change the progress of Rangebar
        mRangeBar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
              textView.setText(leftPinValue+"-");
                rangebarTv.setText(rightPinValue);

            }
        });



    }
}
