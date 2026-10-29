package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: MyApplication */
public final class dp0 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7220a;

    private static int b(Context context, Map map, String str, int i7) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                s2.z.a();
                i7 = w2.g.c(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                String sb2 = sb.toString();
                int i8 = v2.n1.f26802b;
                w2.p.f(sb2);
            }
        }
        if (v2.n1.m()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i7).length() + 1);
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i7);
            sb3.append(".");
            v2.n1.k(sb3.toString());
        }
        return i7;
    }

    private static void c(pn0 pn0Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                pn0Var.J(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String format = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i7 = v2.n1.f26802b;
                w2.p.f(format);
                return;
            }
        }
        if (str2 != null) {
            pn0Var.K(Integer.parseInt(str2));
        }
        if (str3 != null) {
            pn0Var.L(Integer.parseInt(str3));
        }
        if (str4 != null) {
            pn0Var.k(Integer.parseInt(str4));
        }
        if (str5 != null) {
            pn0Var.m(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.y50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dp0.a(java.lang.Object, java.util.Map):void");
    }
}
