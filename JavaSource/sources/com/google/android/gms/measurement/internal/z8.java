package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class z8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22929q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22930r;

    z8(w9 w9Var, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22929q = y1Var;
        Objects.requireNonNull(w9Var);
        this.f22930r = w9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.w9 r0 = r8.f22930r
            com.google.android.gms.measurement.internal.w6 r1 = r0.f22928a
            com.google.android.gms.measurement.internal.mc r1 = r1.z()
            com.google.android.gms.measurement.internal.w6 r1 = r1.f22928a
            com.google.android.gms.measurement.internal.d6 r2 = r1.x()
            com.google.android.gms.measurement.internal.d8 r2 = r2.w()
            t4.v r3 = t4.v.ANALYTICS_STORAGE
            boolean r2 = r2.o(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.p5 r1 = r1.a()
            com.google.android.gms.measurement.internal.n5 r1 = r1.t()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            com.google.android.gms.measurement.internal.d6 r2 = r1.x()
            com.google.android.gms.common.util.e r4 = r1.f()
            long r4 = r4.a()
            boolean r2 = r2.A(r4)
            if (r2 != 0) goto L28
            com.google.android.gms.measurement.internal.d6 r2 = r1.x()
            com.google.android.gms.measurement.internal.a6 r2 = r2.f22038r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            com.google.android.gms.measurement.internal.d6 r1 = r1.x()
            com.google.android.gms.measurement.internal.a6 r1 = r1.f22038r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            com.google.android.gms.measurement.internal.w6 r0 = r0.f22928a
            com.google.android.gms.internal.measurement.y1 r2 = r8.f22929q
            com.google.android.gms.measurement.internal.yd r0 = r0.C()
            long r3 = r1.longValue()
            r0.b0(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.y1 r0 = r8.f22929q     // Catch: android.os.RemoteException -> L73
            r0.P0(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w9 r1 = r8.f22930r
            com.google.android.gms.measurement.internal.w6 r1 = r1.f22928a
            com.google.android.gms.measurement.internal.p5 r1 = r1.a()
            com.google.android.gms.measurement.internal.n5 r1 = r1.o()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z8.run():void");
    }
}
