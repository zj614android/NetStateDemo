package demo.netstate.com.netstatedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import demo.netstate.com.netstatedemo.base.BaseAppCompatActivity;

public class MainActivity extends BaseAppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.commonact).setOnClickListener(this);
        findViewById(R.id.fragment).setOnClickListener(this);
        findViewById(R.id.actionbar_activity).setOnClickListener(this);
        findViewById(R.id.little_activity).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.commonact:
                startActivity(new Intent(MainActivity.this,CommonActivity.class));
                break;
            case R.id.fragment:
                startActivity(new Intent(MainActivity.this,FragmentContainerActivity.class));
                break;
            case R.id.actionbar_activity:
                startActivity(new Intent(MainActivity.this,ActionBarActivity.class));
                break;
            case R.id.little_activity:
                startActivity(new Intent(MainActivity.this,LittleActivity.class));
                break;
        }
    }
}
