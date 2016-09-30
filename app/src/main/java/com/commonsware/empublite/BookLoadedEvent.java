package com.commonsware.empublite;

/**
 * Created by peace on 30/9/16.
 */
public class BookLoadedEvent {

    private BookContents contents = null;

    public BookLoadedEvent(BookContents contents) {
        this.contents = contents;
    }

    public BookContents getBook() {
        return contents;
    }
}
