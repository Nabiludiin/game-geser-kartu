package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class io implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f10100q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ko f10101r;

    io(ko koVar, int i7, boolean z7) {
        this.f10100q = i7;
        Objects.requireNonNull(koVar);
        this.f10101r = koVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xk xkVar;
        int i7 = this.f10100q;
        ko koVar = this.f10101r;
        if (i7 > 0) {
            try {
                Thread.sleep(i7 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = koVar.f11151a;
            xkVar = sc3.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            xkVar = null;
        }
        ko koVar2 = this.f10101r;
        koVar2.s(xkVar);
        int i8 = this.f10100q;
        if (i8 < 4) {
            if (xkVar != null && xkVar.D0() && !xkVar.Z0().equals("0000000000000000000000000000000000000000000000000000000000000000") && xkVar.d1() && xkVar.e1().d0() && xkVar.e1().e0() != -2) {
                return;
            }
            koVar2.p(i8 + 1, true);
        }
    }
}
