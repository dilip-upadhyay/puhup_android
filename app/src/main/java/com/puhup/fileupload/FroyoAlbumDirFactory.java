package com.puhup.fileupload;

/**
 * Created by dupadhy on 1/22/2017.
 */

import java.io.File;

import android.os.Environment;
import android.util.Log;

public final class FroyoAlbumDirFactory extends AlbumStorageDirFactory {

    @Override
    public File getAlbumStorageDir(String albumName) {
        // TODO Auto-generated method stub
        Log.d("froyo", "was called");
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ),
                albumName
        );
    }
}