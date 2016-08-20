package com.gowhich.androidintentstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowActivity extends AppCompatActivity {

    public static String name;
    public static int age;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        textView = (TextView) this.findViewById(R.id.msg);

        textView.setText("name = " + name + " age = "+ age);

    }
}
