package com.fernandocejas.android10.sample.presentation.view;

import com.fernandocejas.android10.sample.presentation.model.PhotoFolderModel;

import java.util.List;

/**
 * Created by an.tran on 8/16/2017.
 */

public interface PhotoFoldersView extends LoadDataView {

    void renderPhotoFolderList(List<PhotoFolderModel> photoFolderList);

}
