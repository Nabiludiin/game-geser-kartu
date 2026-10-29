package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* compiled from: MyApplication */
public final class xd3 {

    /* renamed from: a, reason: collision with root package name */
    private final File f18772a;

    /* renamed from: b, reason: collision with root package name */
    final File f18773b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f18774c;

    /* renamed from: d, reason: collision with root package name */
    private final mq f18775d;

    public xd3(Context context, mq mqVar) {
        this.f18774c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        yd3.d(dir, false);
        this.f18772a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        yd3.d(dir2, true);
        this.f18773b = dir2;
        this.f18775d = mqVar;
    }

    private final File d() {
        File file = new File(this.f18772a, Integer.toString(this.f18775d.a()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        int a8 = this.f18775d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 6);
        sb.append("FBAMTD");
        sb.append(a8);
        return sb.toString();
    }

    private final String f() {
        int a8 = this.f18775d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 6);
        sb.append("LATMTD");
        sb.append(a8);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.oq r9, com.google.android.gms.internal.ads.de3 r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xd3.a(com.google.android.gms.internal.ads.oq, com.google.android.gms.internal.ads.de3):boolean");
    }

    public final wd3 b(int i7) {
        uq c8 = c(1);
        if (c8 == null) {
            return null;
        }
        String d02 = c8.d0();
        File a8 = yd3.a(d02, "pcam.jar", d());
        if (!a8.exists()) {
            a8 = yd3.a(d02, "pcam", d());
        }
        return new wd3(c8, a8, yd3.a(d02, "pcbc", d()), yd3.a(d02, "pcopt", d()));
    }

    final uq c(int i7) {
        String string = i7 == 1 ? this.f18774c.getString(f(), null) : this.f18774c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] c8 = com.google.android.gms.common.util.k.c(string);
            qy4 qy4Var = qy4.f14669r;
            uq i02 = uq.i0(qy4.s(c8, 0, c8.length));
            String d02 = i02.d0();
            File a8 = yd3.a(d02, "pcam.jar", d());
            if (!a8.exists()) {
                a8 = yd3.a(d02, "pcam", d());
            }
            File a9 = yd3.a(d02, "pcbc", d());
            if (a8.exists()) {
                if (a9.exists()) {
                    return i02;
                }
            }
        } catch (e05 unused) {
        }
        return null;
    }
}
