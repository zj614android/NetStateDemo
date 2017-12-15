package demo.netstate.com.netstatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.netstatus.NetworkStateView;

public class LittleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_little);
        com.netstatus.NetworkStateView nv = (NetworkStateView) findViewById(R.id.nsv_state_view);
        nv.showLoading();
    }


}
