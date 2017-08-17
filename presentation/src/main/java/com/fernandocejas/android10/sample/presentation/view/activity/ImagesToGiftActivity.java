package com.fernandocejas.android10.sample.presentation.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

import com.fernandocejas.android10.sample.presentation.R;

import butterknife.Bind;

/**
 * Created by an.tran on 8/16/2017.
 */

public class ImagesToGiftActivity extends BaseActivity {

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, ImagesToGiftActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_layout);
    }
}
