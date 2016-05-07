package com.example.fumi_042.janken;

import java.util.Random;

/**
 * Created by fumi_042 on 16/04/27.
 */
public class Opponent {

    private Random rnd;

    public Opponent() {
        // TODO 自動生成されたコンストラクター・スタブ
        this.rnd = new Random();
    }

    public int getRnd() {
        return rnd.nextInt(3);
    }
}