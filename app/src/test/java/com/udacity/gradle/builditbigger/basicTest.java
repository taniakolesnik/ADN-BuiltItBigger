package com.udacity.gradle.builditbigger;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by tetianakolesnik on 21/09/2018.
 */
@RunWith(AndroidJ)
public class basicTest {
    @Test
    public void checkTellJoke(){
        onView(withId(R.id.recipes_recyclerView))
                .check(matches(hasDescendant(withText("Nutella Pie"))));
        button.performClick();
    }
}
