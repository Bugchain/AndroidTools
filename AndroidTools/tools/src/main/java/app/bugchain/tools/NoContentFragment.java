package app.bugchain.tools;
/*
 * Created by BUG CHAIN on 06/09/2017.
 * ARIP Public Company Limited
 * Bangkok, Thailand
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NoContentFragment extends Fragment{

    public static NoContentFragment newInstance(){
        return new NoContentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_no_content, container, false);
    }

}
