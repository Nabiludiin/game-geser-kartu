package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class up2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final w03 f16883a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f16884b;

    /* renamed from: c, reason: collision with root package name */
    private final v2.p1 f16885c;

    public up2(w03 w03Var, PackageInfo packageInfo, v2.p1 p1Var) {
        this.f16883a = w03Var;
        this.f16884b = packageInfo;
        this.f16885c = p1Var;
    }

    private final void a(Bundle bundle) {
        int i7;
        z10 z10Var = this.f16883a.f17964j;
        if (z10Var == null || (i7 = z10Var.f19962y) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", z10Var.f19963z);
        bundle.putInt("sccg_dir", i7);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ArrayList arrayList = this.f16883a.f17962h;
        x81 x81Var = (x81) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(x81Var.f18665b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r0 == 3) goto L70;
     */
    @Override // com.google.android.gms.internal.ads.wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.up2.d(java.lang.Object):void");
    }
}
