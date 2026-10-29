package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class ls2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f11770a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11771b;

    /* renamed from: c, reason: collision with root package name */
    private final h22 f11772c;

    ls2(z64 z64Var, Context context, h22 h22Var) {
        this.f11770a = z64Var;
        this.f11771b = context;
        this.f11772c = h22Var;
    }

    private static ResolveInfo d(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f11770a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.is2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ls2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 38;
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0049 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.hs2 c() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls2.c():com.google.android.gms.internal.ads.hs2");
    }
}
