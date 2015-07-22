package com.dlzh.scratchtextview;

import android.app.Activity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScratchTextView mStv = (ScratchTextView) findViewById(R.id.tv_Scratch);
        String[] str_reward = {"谢谢惠顾", "一等奖", "再买一瓶"};
        mStv.setText(str_reward[getRandom()]);
        mStv.initScratchCard(0xFFCECED1, 20, 1f);//调用方法，初始化scartchTextView
    }

    /**
     * 随机生成一个数
     */
    private int getRandom() {
        Random random = new Random();
        int number = random.nextInt(4);
        return number;
    }
}
