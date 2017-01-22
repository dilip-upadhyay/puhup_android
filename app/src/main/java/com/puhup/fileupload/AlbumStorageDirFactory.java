package com.puhup.fileupload;

/**
 * Created by dupadhy on 1/22/2017.
 */

import java.io.File;

abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}