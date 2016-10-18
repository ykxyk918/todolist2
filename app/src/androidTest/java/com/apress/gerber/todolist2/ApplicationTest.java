package com.apress.gerber.todolist2;

import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void Button_displayed() {
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }

    @Test
    public void type_text() {
        onView(withId(R.id.edittext)).perform(typeText("meeting"));
        onView(withId(R.id.edittext))
                .check(matches(withText("meeting")));
    }

    @Test

    public void test_button() {
    //    onView(withId(R.id.textview)).check(doesNotExist());
        onView(withId(R.id.edittext))
                .perform(typeText("meeting"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textview)).check(matches(withText("meeting")));
    }

//テキストボックスを作成してedittextを表示



}