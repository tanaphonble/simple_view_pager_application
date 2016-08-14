package ayp.aug.viewpagerapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tanaphon on 8/14/2016.
 */
public class ViewPagerFragment extends Fragment {

    private static final String FRAGMENT_MESSAGE = "FRAGMENT_MESSAGE";
    TextView  fragmentMessageTextView;
    String fragmentMessage;

    /**
     *
     * @param fragmentMessage string of message that put to args with FRAGMENT_MESSAGE key
     * @return fragment that contains FRAGMENT_MESSAGE
     */
    public static ViewPagerFragment newInstance(String fragmentMessage) {

        Bundle args = new Bundle();

        ViewPagerFragment fragment = new ViewPagerFragment();
        args.putString(FRAGMENT_MESSAGE, fragmentMessage);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentMessage = getArguments().getString(FRAGMENT_MESSAGE);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view_pager, container, false);
        fragmentMessageTextView = (TextView) v.findViewById(R.id.fragment_message_text_view);
        fragmentMessageTextView.setText(fragmentMessage);
        return v;
    }
}
