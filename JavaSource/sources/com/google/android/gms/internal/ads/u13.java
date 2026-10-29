package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public abstract class u13 {
    public static void a(int i7, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i7);
        String sb2 = sb.toString();
        int i8 = v2.n1.f26802b;
        w2.p.e(sb2);
        v2.n1.l(str, th);
        if (i7 == 3) {
            return;
        }
        r2.t.l().j(th, str);
    }

    public static void b(Context context, boolean z7) {
        if (z7) {
            int i7 = v2.n1.f26802b;
            w2.p.e("This request is sent from a test device.");
            return;
        }
        s2.z.a();
        String d8 = w2.g.d(context);
        StringBuilder sb = new StringBuilder(String.valueOf(d8).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(d8);
        sb.append("\")) to get test ads on this device.");
        String sb2 = sb.toString();
        int i8 = v2.n1.f26802b;
        w2.p.e(sb2);
    }
}
