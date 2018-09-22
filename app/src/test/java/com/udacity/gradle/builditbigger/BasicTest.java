package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import java.util.concurrent.ExecutionException;

/**
 * Created by tetianakolesnik on 22/09/2018.
 */

public class BasicTest  {


    @Test
    public void getJokeAsyncTask_returnNotEmptyValue() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        String joke = endpointsAsyncTask.get();
        assertNotNull(joke);

    }
}
