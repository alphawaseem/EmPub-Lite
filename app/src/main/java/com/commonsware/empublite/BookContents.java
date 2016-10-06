package com.commonsware.empublite;

import android.net.Uri;

import java.io.File;
import java.util.List;

/**
 * Created by peace on 30/9/16.
 */
public class BookContents {

    List<Chapter> chapters;
    File baseDir = null;

    int getChapterCount() {
        return chapters.size();
    }

    String getChapterFile(int position) {
        return chapters.get(position).file;
    }

    void setBaseDir(File baseDir) {
        this.baseDir = baseDir;
    }

    String getChapterPath(int position) {
        String file = getChapterFile(position);
        if (baseDir == null) {
            return ("file:///android_asset/book/" + file);
        }
        return (Uri.fromFile(new File(baseDir, file)).toString());
    }

    static class Chapter {
        String file;
    }
}
