package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class nu1 extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private final v2.u f12926q;

    public nu1(Context context, View view, v2.u uVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f12926q = uVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f12926q.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            KeyEvent.Callback childAt = getChildAt(i7);
            if (childAt instanceof mr0) {
                arrayList.add((mr0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((mr0) arrayList.get(i8)).destroy();
        }
    }
}
