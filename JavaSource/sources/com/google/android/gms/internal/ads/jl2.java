package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: MyApplication */
public final class jl2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f10606a;

    private jl2(Integer num) {
        this.f10606a = num;
    }

    static /* synthetic */ jl2 a(w2.a aVar) {
        int i7;
        int extensionVersion;
        int extensionVersion2;
        if (!((Boolean) s2.b0.c().d(uy.cb)).booleanValue()) {
            return new jl2(null);
        }
        r2.t.g();
        int i8 = 0;
        try {
            i7 = Build.VERSION.SDK_INT;
        } catch (Exception e8) {
            r2.t.l().i(e8, "AdUtil.getAdServicesExtensionVersion");
        }
        if (i7 >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i8 = SdkExtensions.getExtensionVersion(1000000);
                return new jl2(Integer.valueOf(i8));
            }
        }
        if (((Boolean) s2.b0.c().d(uy.fb)).booleanValue()) {
            if (aVar.f27053s >= ((Integer) s2.b0.c().d(uy.eb)).intValue() && i7 >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i8 = SdkExtensions.getExtensionVersion(31);
                }
            }
        }
        return new jl2(Integer.valueOf(i8));
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Integer num = this.f10606a;
        x81 x81Var = (x81) obj;
        if (num != null) {
            x81Var.f18664a.putInt("aos", num.intValue());
        }
    }
}
