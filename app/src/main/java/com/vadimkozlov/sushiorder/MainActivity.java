package com.vadimkozlov.sushiorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Finish (View v){

        TextView text1 = MainActivity.this.findViewById(R.id.name1);
        text1.setVisibility(View.INVISIBLE);
        String Roll1 = text1.getText().toString();

        TextView text2 = MainActivity.this.findViewById(R.id.name2);
        text2.setVisibility(View.INVISIBLE);
        String Roll2 = text2.getText().toString();

        TextView text3 = MainActivity.this.findViewById(R.id.name3);
        text3.setVisibility(View.INVISIBLE);
        String Roll3 = text3.getText().toString();

        TextView text4 = MainActivity.this.findViewById(R.id.name4);
        text4.setVisibility(View.INVISIBLE);
        String Roll4 = text4.getText().toString();

        TextView text5 = MainActivity.this.findViewById(R.id.name5);
        text5.setVisibility(View.INVISIBLE);
        String Roll5 = text5.getText().toString();

        TextView text6 = MainActivity.this.findViewById(R.id.name6);
        text6.setVisibility(View.INVISIBLE);
        String Roll6 = text6.getText().toString();

        TextView text7 = MainActivity.this.findViewById(R.id.name7);
        text7.setVisibility(View.INVISIBLE);
        String Roll7 = text7.getText().toString();

        TextView text8 = MainActivity.this.findViewById(R.id.name8);
        text8.setVisibility(View.INVISIBLE);
        String Roll8 = text8.getText().toString();

        TextView text9 = MainActivity.this.findViewById(R.id.name9);
        text9.setVisibility(View.INVISIBLE);
        String Roll9 = text9.getText().toString();

        TextView text10 = MainActivity.this.findViewById(R.id.name10);
        text10.setVisibility(View.INVISIBLE);
        String Roll10 = text10.getText().toString();

        TextView num1 = MainActivity.this.findViewById(R.id.amount1);
        num1.setVisibility(View.INVISIBLE);
        String Amount1 = num1.getText().toString();

        TextView num2 = MainActivity.this.findViewById(R.id.amount2);
        num2.setVisibility(View.INVISIBLE);
        String Amount2 = num2.getText().toString();

        TextView num3 = MainActivity.this.findViewById(R.id.amount3);
        num3.setVisibility(View.INVISIBLE);
        String Amount3 = num3.getText().toString();

        TextView num4 = MainActivity.this.findViewById(R.id.amount4);
        num4.setVisibility(View.INVISIBLE);
        String Amount4 = num4.getText().toString();

        TextView num5 = MainActivity.this.findViewById(R.id.amount5);
        num5.setVisibility(View.INVISIBLE);
        String Amount5 = num5.getText().toString();

        TextView num6 = MainActivity.this.findViewById(R.id.amount6);
        num6.setVisibility(View.INVISIBLE);
        String Amount6 = num6.getText().toString();

        TextView num7 = MainActivity.this.findViewById(R.id.amount7);
        num7.setVisibility(View.INVISIBLE);
        String Amount7 = num7.getText().toString();

        TextView num8 = MainActivity.this.findViewById(R.id.amount8);
        num8.setVisibility(View.INVISIBLE);
        String Amount8 = num8.getText().toString();

        TextView num9 = MainActivity.this.findViewById(R.id.amount9);
        num9.setVisibility(View.INVISIBLE);
        String Amount9 = num9.getText().toString();

        TextView num10 = MainActivity.this.findViewById(R.id.amount10);
        num10.setVisibility(View.INVISIBLE);
        String Amount10 = num10.getText().toString();

        TextView Summary = MainActivity.this.findViewById(R.id.Summary);
        Summary.setVisibility(View.VISIBLE);
        String totalsumary = (
                        Roll1 + " " + Amount1 + "\n"
                        + Roll2 + " " + Amount2 + "\n"
                        + Roll3 + " " + Amount3 + "\n"
                        + Roll4 + " " + Amount4 + "\n"
                        + Roll5 + " " + Amount5 + "\n"
                        + Roll6 + " " + Amount6 + "\n"
                        + Roll7 + " " + Amount7 + "\n"
                        + Roll8 + " " + Amount8 + "\n"
                        + Roll9 + " " + Amount9 + "\n"
                        + Roll10 + " " + Amount10 + "\n"


        );
        Summary.setText(totalsumary);
        /*Summary.setText(
                  Roll1 + " " + Amount1 + System.getProperty("line.separator")
                + Roll2 + " " + Amount2 + System.getProperty("line.separator")
                + Roll3 + " " + Amount3 + System.getProperty("line.separator")
                        + Roll4 + " " + Amount4 + "\n"
                        + Roll5 + " " + Amount5 + "\n"
                        + Roll6 + " " + Amount6 + "\n"
                        + Roll7 + " " + Amount7 + "\n"
                        + Roll8 + " " + Amount8 + "\n"
                        + Roll9 + " " + Amount9 + "\n"
                        + Roll10 + " " + Amount10 + "\n"


        );*/
    }
}
