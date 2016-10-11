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
    private static final String VALID_PHONE_NUMBER = "123-345-6789";

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void Button_displayed() {
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }

    @Test
    public void typetext() {
        onView(withId(R.id.edittext)).perform(typeText("meeting"));
        onView(withId(R.id.edittext))
                .check(matches(withText("meeting")));
    }

    @Test
    @Ignore
        public void button() {
            onView(withId(R.id.edittext))
                    .perform(typeText("meeting"), closeSoftKeyboard());

            onView(withId(R.id.button)).perform(click());
          //  onView(withId(R.id.button)).check(matches());

        
        }

    public void Item_notDisplayed(){
      //   onView(withId(R.id.textview)).check(matches(not(isDisplayed())));
    }

    public void Item_Displayed() {
        onView(withId(R.id.textview)).check(matches(isDisplayed()));
    }

    public void Item_Matched() {
        onView(withId(R.id.edittext))
                .perform(typeText("meeting"), closeSoftKeyboard());
        onView(withId(R.id.textview)).check(matches(withText("meeting")));
    }

    //ボタンを押す前に表示されないことをテスト
    //ボタンを押したら表示される
    //でてきたものと一致する

//テキストボックスを作成してedittextを表示


      public void List_Item_Displayed(){
     //   onView(withText(ITEM_ID)),check(matches(isDisplayed());
    }


}