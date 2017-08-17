package com.fernandocejas.android10.sample.data.entity.photo;


import java.util.List;

/**
 * Created by an.tran on 8/17/2017.
 */

public class PhotoFolderEntity {

    private int photoFolderId;
    private String folderName;
    private List<PhotoEntity> photoList;
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

    public List<PhotoEntity> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoEntity> photoList) {
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
