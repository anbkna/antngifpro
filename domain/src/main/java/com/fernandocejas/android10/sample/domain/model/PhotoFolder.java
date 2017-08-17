package com.fernandocejas.android10.sample.domain.model;

import java.util.List;

/**
 * Created by an.tran on 8/16/2017.
 */

public class PhotoFolder {
    private int photoFolderId;
    private String folderName;
    private List<Photo> photoList;
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

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
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
