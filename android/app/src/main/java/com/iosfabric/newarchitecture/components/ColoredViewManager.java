package com.iosfabric.newarchitecture.components;

import android.graphics.Color;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ColoredViewManager extends SimpleViewManager<ColoredView> {

    public static final String NAME = "ColoredView";
    ReactApplicationContext mCallerContext;

    public ColoredViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public ColoredView createViewInstance(ThemedReactContext context) {
        return new ColoredView(context);
    }

    @ReactProp(name = "color")
    public void setColor(ColoredView view, String color) {
        view.setBackgroundColor(Color.parseColor(color));
    }

}

