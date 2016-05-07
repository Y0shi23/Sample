package com.example.fumi_042.janken;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ImageButton> buttonLists = new ArrayList<ImageButton>(){
            {
                add((ImageButton)findViewById(R.id.button01));
                add((ImageButton)findViewById(R.id.button02));
                add((ImageButton)findViewById(R.id.button03));
            }
        };
        buttonLists.get(0).setOnClickListener(setMyRock);
        buttonLists.get(1).setOnClickListener(setMyScissors);
        buttonLists.get(2).setOnClickListener(setMyPaper);
    }
    // グーのボタンを押した
    private View.OnClickListener setMyRock = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            setMyRock(v);
        }
    };
    // チョキのボタンを押した
    private View.OnClickListener setMyScissors = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            setMyScissors(v);
        }
    };
    // パーのボタンを押した
    private View.OnClickListener setMyPaper = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            setMyScissors(v);
        }
    };

    private void setMyRock(View v){
        TextView tv = (TextView)findViewById(R.id.textview);
        ImageView im = (ImageView)findViewById(R.id.imageView);
        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            im.setImageResource(R.drawable.rock);
            tv.setText("グー：あいこ");
        }
        else if(opp.getRnd() == 1){
            im.setImageResource(R.drawable.scissors);
            tv.setText("チョキ：勝ち");
        }
        else if(opp.getRnd() == 2){
            im.setImageResource(R.drawable.rock);
            tv.setText("パー：負け");
        }
    }

    private void setMyScissors(View v){
        TextView tv = (TextView)findViewById(R.id.textview);
        ImageView im = (ImageView)findViewById(R.id.imageView);
        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            im.setImageResource(R.drawable.rock);
            tv.setText("グー：負け");
        }
        else if(opp.getRnd() == 1){
            im.setImageResource(R.drawable.scissors);
            tv.setText("チョキ：あいこ");
        }
        else if(opp.getRnd() == 2){
            im.setImageResource(R.drawable.paper);
            tv.setText("パー：勝ち");
        }
    }

    private void setMyPaper(View v){
        TextView tv = (TextView)findViewById(R.id.textview);
        ImageView im = (ImageView)findViewById(R.id.imageView);
        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            im.setImageResource(R.drawable.rock);
            tv.setText("グー：勝ち");
        }
        else if(opp.getRnd() == 1){
            im.setImageResource(R.drawable.scissors);
            tv.setText("チョキ：負け");
        }
        else if(opp.getRnd() == 2){
            im.setImageResource(R.drawable.paper);
            tv.setText("パー：あいこ");
        }
    }
}