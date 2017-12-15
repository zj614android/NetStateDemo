package demo.netstate.com.netstatedemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.netstatus.assembly.NetObserverAppCompatActivity;

public class FragmentContainerActivity extends NetObserverAppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction trans = fm.beginTransaction();
        TestFragment tf = new TestFragment();
        trans.replace(R.id.content_framelayout, tf);
        trans.commit();
    }
}
