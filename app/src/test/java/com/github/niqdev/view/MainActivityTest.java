package com.github.niqdev.view;

import android.widget.Button;
import android.widget.TextView;

import com.github.niqdev.BuildConfig;
import com.github.niqdev.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    @Test
    public void onClick_shouldChangeText() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        Button myButton = (Button) activity.findViewById(R.id.buttonExample1);
        TextView myTextView = (TextView) activity.findViewById(R.id.textViewExample1);

        assertThat(myTextView.getText().toString(), equalTo("BEFORE"));
        myButton.performClick();
        assertThat(myTextView.getText().toString(), equalTo("AFTER"));
    }

}