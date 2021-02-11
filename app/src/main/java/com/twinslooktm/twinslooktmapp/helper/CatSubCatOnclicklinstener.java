package com.twinslooktm.twinslooktmapp.helper;

import android.view.View;

import com.twinslooktm.twinslooktmapp.modelsList.catSubCatlistModel;

public interface CatSubCatOnclicklinstener {
    void onItemClick(catSubCatlistModel item);

    void onItemTouch(catSubCatlistModel item);

    void addToFavClick(View v, String position);

}
