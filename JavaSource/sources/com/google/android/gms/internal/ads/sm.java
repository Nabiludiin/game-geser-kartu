package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public abstract class sm {
    public static final String a(Context context, String str, long j7, boolean z7) {
        try {
            hl d02 = il.d0();
            d02.F(str);
            d02.E("0.460000000");
            d02.H(context.getPackageName());
            d02.J((System.currentTimeMillis() - j7) / 1000);
            d02.G(System.currentTimeMillis() / 1000);
            try {
                d02.I(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                d02.I(-1L);
            }
            ol c8 = cm.c(((il) d02.A()).e(), null);
            c8.G(5);
            c8.H(2);
            return Base64.encodeToString(((pl) c8.A()).e(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
