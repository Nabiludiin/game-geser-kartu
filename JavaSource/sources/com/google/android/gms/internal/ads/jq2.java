package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class jq2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f10710a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f10711b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10712c;

    jq2(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f10710a = applicationInfo;
        this.f10711b = packageInfo;
        this.f10712c = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        String str;
        String str2;
        String str3;
        InstallSourceInfo installSourceInfo;
        String str4 = this.f10710a.packageName;
        PackageInfo packageInfo = this.f10711b;
        String str5 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str6 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.f10712c;
            of3 of3Var = v2.f2.f26746l;
            str = String.valueOf(u3.e.a(context).d(str4));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) s2.b0.c().d(uy.Od)).booleanValue()) {
                try {
                    installSourceInfo = this.f10712c.getPackageManager().getInstallSourceInfo(str4);
                } catch (PackageManager.NameNotFoundException e8) {
                    e = e8;
                    str2 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            v2.n1.k("No installing package name found");
                            str2 = null;
                        }
                        str3 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e9) {
                        e = e9;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e10) {
                        e = e10;
                        str5 = str3;
                        r2.t.l().i(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str5;
                        return p64.a(new kq2(str4, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        v2.n1.k("No initiating package name found");
                        str3 = str5;
                    }
                    return p64.a(new kq2(str4, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return p64.a(new kq2(str4, valueOf, str6, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 29;
    }
}
