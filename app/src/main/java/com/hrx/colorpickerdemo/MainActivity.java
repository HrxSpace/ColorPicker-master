package com.hrx.colorpickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hrx.colorpickerdemo.view.ColorPickerView;

public class MainActivity extends AppCompatActivity implements ColorPickerView.OnColorLis {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorPickerView view = this.findViewById(R.id.color_view);
        view.setOnColorLis(this);

    }

    @Override
    public void onColorChanged(int color, String colorStr) {
       Log.d("onColorChanged ", "color = " + color + ",colorStr = " + colorStr);
    }
}
