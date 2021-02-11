package com.twinslooktm.twinslooktmapp.helper;

import com.twinslooktm.twinslooktmapp.modelsList.PackagesModel;

public interface OnItemClickListenerPackages {
    void onItemClick(PackagesModel item);

    void onItemTouch();

    void onItemSelected(PackagesModel packagesModel, int spinnerPosition);
}
