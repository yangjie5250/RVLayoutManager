package com.android.app.sample.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.app.sample.R;
import com.android.app.smartadapter.protocol.IRvSmartBinder;
import com.android.app.smartadapter.cell.IRvSmartCell;
/**
 * cell样式2
 */
public class AdapterCell2 implements IRvSmartBinder<IRvSmartCell, View> {

    private Button textView;

    @NonNull
    @Override
    public View createView(Context context, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_adapter2, parent, false);
        textView = view.findViewById(R.id.tv_text);
        return view;
    }

    @Override
    public void mountView(@NonNull IRvSmartCell data, @NonNull View view) {
        textView.setText("测试 : " + data.getType());
    }

    @Override
    public void unmountView(@NonNull IRvSmartCell data, @NonNull View view) {

    }
}
