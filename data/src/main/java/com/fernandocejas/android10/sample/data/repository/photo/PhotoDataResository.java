package com.fernandocejas.android10.sample.data.repository.photo;

import com.fernandocejas.android10.sample.data.repository.photo.datasource.DiskPhotoDataStore;
import com.fernandocejas.android10.sample.data.repository.photo.datasource.PhotoDataStoreFactory;
import com.fernandocejas.android10.sample.domain.model.PhotoFolder;
import com.fernandocejas.android10.sample.domain.repository.photo.PhotoRepository;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by an.tran on 8/16/2017.
 */

public class PhotoDataResository implements PhotoRepository{

    PhotoDataStoreFactory photoDataStoreFactory;

    @Override
    public Observable<List<PhotoFolder>> loadPhotoFolderList() {
        return null;
    }
}
