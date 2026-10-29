package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* compiled from: MyApplication */
final class so implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ uo f15726a;

    so(uo uoVar) {
        Objects.requireNonNull(uoVar);
        this.f15726a = uoVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z7) {
        if (z7) {
            uo uoVar = this.f15726a;
            uoVar.e(System.currentTimeMillis());
            uoVar.h(true);
            return;
        }
        uo uoVar2 = this.f15726a;
        long f8 = uoVar2.f();
        long currentTimeMillis = System.currentTimeMillis();
        if (f8 > 0 && currentTimeMillis >= uoVar2.f()) {
            uoVar2.g(currentTimeMillis - uoVar2.f());
        }
        uoVar2.h(false);
    }
}
