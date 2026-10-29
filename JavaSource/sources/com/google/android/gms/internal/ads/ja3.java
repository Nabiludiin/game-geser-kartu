package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class ja3 extends ma3 {

    /* renamed from: t, reason: collision with root package name */
    private static final ja3 f10430t = new ja3();

    private ja3() {
    }

    public static ja3 i() {
        return f10430t;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final boolean b() {
        Iterator it = ka3.a().f().iterator();
        while (it.hasNext()) {
            View i7 = ((q93) it.next()).i();
            if (i7 != null && i7.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void c(boolean z7) {
        Iterator it = ka3.a().e().iterator();
        while (it.hasNext()) {
            ((q93) it.next()).g().f(z7);
        }
    }
}
