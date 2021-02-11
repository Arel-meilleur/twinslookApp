package com.twinslooktm.twinslooktmapp.helper;

import android.view.View;

import com.twinslooktm.twinslooktmapp.modelsList.myAdsModel;

public interface MyAdsOnclicklinstener {

    void onItemClick(myAdsModel item);

    void delViewOnClick(View v, int position);

    void editViewOnClick(View v, int position);

}
