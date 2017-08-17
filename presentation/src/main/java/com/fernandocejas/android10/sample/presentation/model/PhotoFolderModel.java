package com.fernandocejas.android10.sample.presentation.model;

import java.util.List;

/**
 * Created by an.tran on 8/16/2017.
 */

public class PhotoFolderModel {

    private int photoFolderId;
    private String folderName;
    private List<PhotoModel> photoModelList;
    private int count;
    private String folderPath;

    public int getPhotoFolderId() {
        return photoFolderId;
    }

    public void setPhotoFolderId(int photoFolderId) {
        this.photoFolderId = photoFolderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public List<PhotoModel> getPhotoModelList() {
        return photoModelList;
    }

    public void setPhotoModelList(List<PhotoModel> photoModelList) {
        this.photoModelList = photoModelList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }
}
