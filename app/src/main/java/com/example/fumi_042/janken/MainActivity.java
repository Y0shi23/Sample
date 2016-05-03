package com.example.fumi_042.janken;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Button> buttonLists = new ArrayList<Button>(){
            {
                add((Button)findViewById(R.id.button01));
                add((Button)findViewById(R.id.button02));
                add((Button)findViewById(R.id.button03));
            }
        };
        buttonLists.get(0).setOnClickListener(setMyRock);
        buttonLists.get(1).setOnClickListener(setMyScissors);
        buttonLists.get(2).setOnClickListener(setMyPaper);
    }

    private View.OnClickListener setMyRock = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            TextView tv = (TextView)findViewById(R.id.textview);
            Opponent opp = new Opponent();

            if(opp.getRnd() == 0){
                tv.setText("グー：あいこ");
            }
            else if(opp.getRnd() == 1){
                tv.setText("チョキ：勝ち");
            }
            else if(opp.getRnd() == 2){
                tv.setText("パー：負け");
            }
        }
    };

    private View.OnClickListener setMyScissors = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            TextView tv = (TextView)findViewById(R.id.textview);
            Opponent opp = new Opponent();

            if(opp.getRnd() == 0){
                tv.setText("グー：負け");
            }
            else if(opp.getRnd() == 1){
                tv.setText("チョキ：あいこ");
            }
            else if(opp.getRnd() == 2){
                tv.setText("パー：勝ち");
            }
        }
    };

    private View.OnClickListener setMyPaper = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            TextView tv = (TextView)findViewById(R.id.textview);
            Opponent opp = new Opponent();

            if(opp.getRnd() == 0){
                tv.setText("グー：勝ち");
            }
            else if(opp.getRnd() == 1){
                tv.setText("チョキ：負け");
            }
            else if(opp.getRnd() == 2){
                tv.setText("パー：あいこ");
            }
        }
    };
}
