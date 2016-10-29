package cn.edu.buaa.david.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Vector;

import cn.edu.buaa.david.myspinner.MySpinner;
import cn.edu.buaa.david.myspinner.MySpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    private MySpinner mySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner=(MySpinner) findViewById(R.id.id_main_spinner);
        Vector<String> mListItem = new Vector<String>();
        mListItem.add("Beijing");
        mListItem.add("Shanghai");
        mListItem.add("Nanjing");
        mListItem.add("Shenzhen");
        mListItem.add("HongKong");
        MySpinnerAdapter mySpinnerAdapter= new MySpinnerAdapter(this,mListItem);
        mySpinner.setAdapter(mySpinnerAdapter);

    }
}
