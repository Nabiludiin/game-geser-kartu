package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class mk2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12288a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f12289b;

    mk2(z64 z64Var, Context context) {
        this.f12289b = z64Var;
        this.f12288a = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (!((Boolean) s2.b0.c().d(uy.Vd)).booleanValue()) {
            return p64.a(new ok2(null, false));
        }
        final ContentResolver contentResolver = this.f12288a.getContentResolver();
        return contentResolver == null ? p64.a(new ok2(null, false)) : this.f12289b.B0(new Callable() { // from class: com.google.android.gms.internal.ads.lk2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new ok2(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 61;
    }
}
