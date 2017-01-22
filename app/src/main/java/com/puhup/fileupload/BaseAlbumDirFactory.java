package com.puhup.fileupload;

/**
 * Created by dupadhy on 1/22/2017.
 */

import java.io.File;

import android.os.Environment;
import android.util.Log;

public final class BaseAlbumDirFactory extends AlbumStorageDirFactory {

    // Standard storage location for digital camera files
    private static final String CAMERA_DIR = "/dcim/";

    @Override
    public File getAlbumStorageDir(String albumName) {
        Log.d("base", "was called");
        return new File ( Environment.getExternalStorageDirectory() + CAMERA_DIR + albumName
        );
    }
}