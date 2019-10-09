package com.android.app.sample;

import android.app.Application;

import com.android.app.sample.model.AdapterCell1;
import com.android.app.sample.model.AdapterCell2;
import com.android.app.smartadapter.core.IRvCellWarehouse;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        IRvCellWarehouse.getInstance().register("0", AdapterCell1.class);
        IRvCellWarehouse.getInstance().register("1", AdapterCell2.class);
    }
}
