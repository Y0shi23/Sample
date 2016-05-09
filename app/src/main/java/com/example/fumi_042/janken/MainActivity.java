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
            setOppMyRock(v);
        }
    };

    // チョキのボタンを押した
    private View.OnClickListener setMyScissors = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            ImageView im = (ImageView)findViewById(R.id.imageView);
            im.setImageResource(R.drawable.scissors);
            setOppMyScissors(v);
        }
    };

    // パーのボタンを押した
    private View.OnClickListener setMyPaper = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //実行したいコード
            ImageView im = (ImageView)findViewById(R.id.imageView);
            im.setImageResource(R.drawable.paper);
            setOppMyPaper(v);
        }
    };

    private void setOppMyRock(View v){
        TextView tv = (TextView)findViewById(R.id.textView);
        ImageView opp_im = (ImageView)findViewById(R.id.imageView2);

        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            opp_im.setImageResource(R.drawable.rock);
            tv.setText("あいこ");
        }
        else if(opp.getRnd() == 1){
            opp_im.setImageResource(R.drawable.scissors);
            tv.setText("勝ち");
        }
        else if(opp.getRnd() == 2){
            opp_im.setImageResource(R.drawable.paper);
            tv.setText("負け");
        }
    }

    private void setOppMyScissors(View v){
        TextView tv = (TextView)findViewById(R.id.textView);
        ImageView opp_im = (ImageView)findViewById(R.id.imageView2);

        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            opp_im.setImageResource(R.drawable.rock);
            tv.setText("負け");
        }
        else if(opp.getRnd() == 1){
            opp_im.setImageResource(R.drawable.scissors);
            tv.setText("あいこ");
        }
        else if(opp.getRnd() == 2){
            opp_im.setImageResource(R.drawable.paper);
            tv.setText("勝ち");
        }
    }

    private void setOppMyPaper(View v){
        TextView tv = (TextView)findViewById(R.id.textView);
        ImageView opp_im = (ImageView)findViewById(R.id.imageView2);

        Opponent opp = new Opponent();

        if(opp.getRnd() == 0){
            opp_im.setImageResource(R.drawable.rock);
            tv.setText("勝ち");
        }
        else if(opp.getRnd() == 1){
            opp_im.setImageResource(R.drawable.scissors);
            tv.setText("負け");
        }
        else if(opp.getRnd() == 2){
            opp_im.setImageResource(R.drawable.paper);
            tv.setText("あいこ");
        }
    }
}