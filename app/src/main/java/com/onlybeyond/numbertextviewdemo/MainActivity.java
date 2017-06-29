package com.onlybeyond.numbertextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.onlybeyond.numbertextview.NumberTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ntv_test_one)
    NumberTextView ntvTestOne;
    @BindView(R.id.btn_test_one)
    TextView btnTestOne;
    @BindView(R.id.ntv_test_two)
    NumberTextView ntvTestTwo;
    @BindView(R.id.btn_test_two)
    TextView btnTestTwo;
    @BindView(R.id.ntv_test_three)
    NumberTextView ntvTestThree;
    @BindView(R.id.btn_test_three)
    TextView btnTestThree;
    @BindView(R.id.ntv_test_four)
    NumberTextView ntvTestFour;
    @BindView(R.id.btn_test_four)
    TextView btnTestFour;
    @BindView(R.id.ntv_test_five)
    NumberTextView ntvTestFive;
    @BindView(R.id.btn_test_five)
    TextView btnTestFive;
    @BindView(R.id.ntv_test_six)
    NumberTextView ntvTestSix;
    @BindView(R.id.btn_test_six)
    TextView btnTestSix;
    @BindView(R.id.ntv_test_seven)
    NumberTextView ntvTestSeven;
    @BindView(R.id.btn_test_seven)
    TextView btnTestSeven;
    @BindView(R.id.ntv_test_eight)
    NumberTextView ntvTestEight;
    @BindView(R.id.btn_test_eight)
    TextView btnTestEight;
    @BindView(R.id.tv_test_seven_time)
    TextView tvTestSevenTime;
    @BindView(R.id.ntv_test_nine)
    NumberTextView ntvTestNine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        ntvTestOne.setUseMax(true);
        ntvTestOne.setNumberValue("100");
        //设置使用动画最大时间,不设置,且不指定开始值,会从0开始

        ntvTestTwo.setUseMax(true);
        ntvTestTwo.setNumberValue("-100");

        //三倍精度增长
        ntvTestThree.setRollInt(3);
        ntvTestTwo.setUseMax(true);
        ntvTestThree.setNumberValue("100.9");

        //倒数第二位变化
        ntvTestFour.setRollInt(10);
        ntvTestFour.setNumberValue("100.9");

        //倒数第三位变化
        ntvTestFive.setRollInt(100);
        ntvTestFive.setNumberValue("100.9");

        ntvTestSix.setNumberValue("95","100");


        ntvTestSeven.setMaxAnimDuration(2000);
        ntvTestSeven.setUseMax(true);
        ntvTestSeven.setNumberTextViewListener(new NumberTextView.NumberTextViewListener() {
            @Override
            public void animStart(long l) {

            }

            @Override
            public void animEnd(long l, long l1) {
                tvTestSevenTime.setText("时间:"+l1);

            }
        });
        ntvTestSeven.setNumberValue("100");


        ntvTestEight.setNumberValue("100");
        ntvTestEight.setNumberValueSymbol("$");
        ntvTestEight.setNumberValueUnit("元");

        ntvTestNine.setNumberValue("30.9");

    };






    @OnClick({R.id.btn_test_one, R.id.btn_test_two, R.id.btn_test_three, R.id.btn_test_four,
            R.id.btn_test_five, R.id.btn_test_six, R.id.btn_test_seven,R.id.btn_test_eight,R.id.btn_test_nine})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_test_one:
                //
                ntvTestOne.startAnim();
                break;
            case R.id.btn_test_two:
                ntvTestTwo.startAnim();
                break;
            case R.id.btn_test_three:
                ntvTestThree.startAnim();
                break;
            case R.id.btn_test_four:
                ntvTestFour.startAnim();
                break;
            case R.id.btn_test_five:
                ntvTestFive.startAnim();
                break;
            case R.id.btn_test_six:
                ntvTestSix.startAnim();
                break;
            case R.id.btn_test_seven:
                ntvTestSeven.startAnim();
                break;
            case R.id.btn_test_eight:
                ntvTestEight.startAnim();
                break;
            case R.id.btn_test_nine:
                ntvTestNine.startAnim();
        }
    }
}
