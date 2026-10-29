package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class bv1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6020a = new HashMap();

    bv1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void a(java.lang.String r6, com.google.android.gms.internal.ads.v13 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.f6020a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.av1 r0 = new com.google.android.gms.internal.ads.av1     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.wd0 r2 = r7.b()     // Catch: com.google.android.gms.internal.ads.d13 -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.wd0 r1 = r7.c()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.d13 -> L20
        L20:
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.ra     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.d(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.s()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.d13 -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.f6020a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bv1.a(java.lang.String, com.google.android.gms.internal.ads.v13):void");
    }

    final synchronized void b(String str, id0 id0Var) {
        if (this.f6020a.containsKey(str)) {
            return;
        }
        try {
            this.f6020a.put(str, new av1(str, id0Var.e(), id0Var.f(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized av1 c(String str) {
        return (av1) this.f6020a.get(str);
    }

    public final String d(String str) {
        wd0 wd0Var;
        av1 c8 = c(str);
        return (c8 == null || (wd0Var = c8.f5302b) == null) ? "" : wd0Var.toString();
    }
}
