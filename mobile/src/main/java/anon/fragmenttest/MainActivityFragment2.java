package anon.fragmenttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment2 extends Fragment {

    public MainActivityFragment2() {
    }
    public static MainActivityFragment2 newInstance(){
        return new MainActivityFragment2();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2_main, container, false);
    }
}
