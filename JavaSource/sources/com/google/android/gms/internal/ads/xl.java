package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: MyApplication */
public final class xl implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    final j74 f18862a = j74.C();

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.f18862a.l("");
            return;
        }
        try {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ApkChecksum a8 = ul.a(list.get(i7));
                type = a8.getType();
                if (type == 8) {
                    j74 j74Var = this.f18862a;
                    q34 g8 = q34.l().g();
                    value = a8.getValue();
                    j74Var.l(g8.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f18862a.l("");
    }
}
