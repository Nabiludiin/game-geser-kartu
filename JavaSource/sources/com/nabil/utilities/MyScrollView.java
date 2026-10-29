package com.nabil.utilities;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: MyApplication */
public class MyScrollView extends ScrollView {
    public MyScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }
}
