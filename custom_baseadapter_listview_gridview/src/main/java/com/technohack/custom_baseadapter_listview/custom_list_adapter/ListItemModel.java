package com.technohack.custom_baseadapter_listview.custom_list_adapter;

public class ListItemModel {

    private int imageUrl;
    private String imageTitle;

    public ListItemModel(){

    }

    public ListItemModel(int imageUrl, String imageTitle) {
        this.imageUrl = imageUrl;
        this.imageTitle = imageTitle;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
}
