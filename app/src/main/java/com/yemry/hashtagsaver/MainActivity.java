package com.yemry.hashtagsaver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    //<editor-fold desc="Member variables">
    private static final String LOG_TAG = "InjectionHistoryActivity";
    private DbHelper mDbHelper;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @BindView(R.id.add)
    FloatingActionButton mFloatingActionButton;
    @BindView(R.id.zeroHashtagsSaved)
    ImageView zeroHashtagsImage;
    //</editor-fold>

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
