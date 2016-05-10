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
        // クリックイベント
        buttonLists.get(0).setOnClickListener(setMyRock);
        buttonLists.get(1).setOnClickListener(setMyScissors);
        buttonLists.get(2).setOnClickListener(setMyPaper);
    }

    // グーのボタンを押した
    private View.OnClickListener setMyRock = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            ImageView im = (ImageView)findViewById(R.id.imageView);
            im.setImageResource(R.drawable.rock);
            setOppHand(v);
        }
    };

    // チョキのボタンを押した
    private View.OnClickListener setMyScissors = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            ImageView im = (ImageView)findViewById(R.id.imageView);
            im.setImageResource(R.drawable.scissors);
            setOppHand(v);
        }
    };

    // パーのボタンを押した
    private View.OnClickListener setMyPaper = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            ImageView im = (ImageView)findViewById(R.id.imageView);
            im.setImageResource(R.drawable.paper);
            setOppHand(v);
        }
    };

    // 相手の手をランダムで決める
    private void setOppHand(View v){
        Opponent opp = new Opponent();
        int cpuhand = opp.getRnd();

        switch (v.getId()){
            case R.id.button01:
                setOppPicture(cpuhand);
                getWinOrLose(0, cpuhand);
                break;

            case R.id.button02:
                setOppPicture(cpuhand);
                getWinOrLose(1, cpuhand);
                break;

            case R.id.button03:
                setOppPicture(cpuhand);
                getWinOrLose(2, cpuhand);
                break;
        }
    }

    // 相手の手をランダムに決めて表示させる
    private void setOppPicture(int m){
        int cpuhand = m;
        ImageView opp_im = (ImageView)findViewById(R.id.imageView2);

        if(cpuhand == 0){
            opp_im.setImageResource(R.drawable.rock);
        }
        else if(cpuhand == 1){
            opp_im.setImageResource(R.drawable.scissors);
        }
        else if(cpuhand == 2){
            opp_im.setImageResource(R.drawable.paper);
        }
    }

    // 勝敗を判定するメソッド
    private void getWinOrLose(int m, int n){
        TextView tv = (TextView)findViewById(R.id.textView);

        int userhand = m;
        int cpuhand = n;
        int win_or_lose = ((userhand - cpuhand) + 3) % 3;

        if(win_or_lose == 0){
            tv.setText("あいこ");
        }
        else if(win_or_lose == 1){
            tv.setText("負け");
        }
        else if(win_or_lose == 2){
            tv.setText("勝ち");
        }
    }
}