package com.commonsware.empublite;

import retrofit.http.GET;

/**
 * Created by peace on 6/10/16.
 */

public interface BookUpdateInterface {

    @GET("/misc/empublite-update.json")
    BookUpdateInfo update();
}
