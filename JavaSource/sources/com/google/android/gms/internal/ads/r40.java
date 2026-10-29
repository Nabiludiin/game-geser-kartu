package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
final class r40 implements y50 {
    r40() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        WindowManager windowManager = (WindowManager) mr0Var.getContext().getSystemService("window");
        r2.t.g();
        DisplayMetrics j02 = v2.f2.j0(windowManager);
        int i7 = j02.widthPixels;
        int i8 = j02.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) mr0Var).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i7));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i8));
        mr0Var.B("locationReady", hashMap);
        int i9 = v2.n1.f26802b;
        w2.p.f("GET LOCATION COMPILED");
    }
}
