package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final /* synthetic */ class wu2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ wu2 f18433a = new wu2();

    private /* synthetic */ wu2() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) s2.b0.c().d(uy.f17082e0);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) s2.b0.c().d(uy.f17091f0)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, v2.k1.a(str2));
                }
            }
        }
        return new yu2(hashMap);
    }
}
