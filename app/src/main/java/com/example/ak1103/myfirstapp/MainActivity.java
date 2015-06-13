package com.example.ak1103.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private TextView mTextView;

    private Button mClear;
    private Button mAdd;
    private Button mSub;
    private Button mMul;
    private Button mDiv;
    private Button mEqual;
    private Button mPoint;

    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mFive;
    private Button mSix;
    private Button mSeven;
    private Button mEight;
    private Button mNine;
    private Button mZero;

    private String str = "";
    private double num;
    private String op = "";
    private boolean equal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget();
        setWidgetEventListener();
    }

    private void setWidgetEventListener() {

        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                mTextView.setText("0");
            }
        });

        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowOperand("+");
            }
        });

        mSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowOperand("-");
            }
        });

        mMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowOperand("*");
            }
        });

        mDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowOperand("/");
            }
        });

        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal = true;
                if (op == "+") {
                    num = num + Double.parseDouble(str);
                }
                else if (op == "-") {
                    num = num - Double.parseDouble(str);
                }
                else if (op == "*") {
                    num = num * Double.parseDouble(str);
                }
                else if (op == "/") {
                    num = num / Double.parseDouble(str);
                }
                str = "" + num;
                mTextView.setText(str);
            }
        });

        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("1");
            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("2");
            }
        });

        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("3");
            }
        });

        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("4");
            }
        });

        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("5");
            }
        });

        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("6");
            }
        });

        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("7");
            }
        });

        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("8");
            }
        });

        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("9");
            }
        });

        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeShowNumber("0");
            }
        });

        mPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + ".";
                mTextView.setText(str);
            }
        });
    }

    private void makeShowOperand(String s) {
        num = Double.parseDouble(str);
        op = s;
        str = "";
        mTextView.setText(op);
    }

    private void makeShowNumber(String s) {
        if (equal) {
            equal = false;
            str = s;
        } else {
            str += s;
        }
        mTextView.setText(str);
    }

    private void bindWidget() {
        mTextView = (TextView) findViewById(R.id.textview);

        mClear = (Button) findViewById(R.id.clr);
        mAdd = (Button) findViewById(R.id.add);
        mSub = (Button) findViewById(R.id.sub);
        mMul = (Button) findViewById(R.id.mul);
        mDiv = (Button) findViewById(R.id.div);
        mEqual = (Button) findViewById(R.id.equal);
        mPoint = (Button) findViewById(R.id.point);

        mOne = (Button) findViewById(R.id.one);
        mTwo = (Button) findViewById(R.id.two);
        mThree = (Button) findViewById(R.id.three);
        mFour = (Button) findViewById(R.id.four);
        mFive = (Button) findViewById(R.id.five);
        mSix = (Button) findViewById(R.id.six);
        mSeven = (Button) findViewById(R.id.seven);
        mEight = (Button) findViewById(R.id.eight);
        mNine = (Button) findViewById(R.id.nine);
        mZero = (Button) findViewById(R.id.zero);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
