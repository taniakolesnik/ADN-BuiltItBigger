package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by tetianakolesnik on 22/09/2018.
 */

@RunWith(AndroidJUnit4.class)
public class GetJokeTaskTest extends ApplicationTestCase<Application> {



    public GetJokeTaskTest() {
        super(Application.class);
    }


    @Test
    public void testResultNotNull() {
        String joke = "";
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute();
            joke = jokeTask.get(20, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Timed out. Game over.");
        }

        assertNotNull(joke);
    }
}
