package com.fernandocejas.android10.sample.domain.repository.photo;

import com.fernandocejas.android10.sample.domain.model.PhotoFolder;

import java.util.List;
import io.reactivex.Observable;

/**
 * Created by an.tran on 8/16/2017.
 */

public interface PhotoRepository {

    Observable<List<PhotoFolder>> loadPhotoFolderList();


}
