package demo.netstate.com.netstatedemo;

import android.os.Bundle;

import demo.netstate.com.netstatedemo.base.BaseAppCompatActivity;

public class ActionBarActivity extends BaseAppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        showloading();
    }
}
