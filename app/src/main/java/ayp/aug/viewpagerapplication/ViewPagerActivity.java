package ayp.aug.viewpagerapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    ViewPager pager;
    List<String> textMsgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        // create messages list
        textMsgs = new ArrayList<>();
        // add any messages to this list
        textMsgs.add("Page_A");
        textMsgs.add("Page_B");
        textMsgs.add("Page_C");

        // fragment manager
        FragmentManager fm = getSupportFragmentManager();

        // find view pager by id
        // this id can find in fragment_view_pager.xml in layout
        pager = (ViewPager) findViewById(R.id.view_pager);

        //set adapter to view pager
        pager.setAdapter(new FragmentStatePagerAdapter(fm) {

            @Override
            public Fragment getItem(int position) {
                Fragment f = ViewPagerFragment.newInstance(textMsgs.get(position));
                return f;
            }

            @Override
            public int getCount() {
                // pager count -- now size is 3
                return textMsgs.size();
            }
        });
    }
}
