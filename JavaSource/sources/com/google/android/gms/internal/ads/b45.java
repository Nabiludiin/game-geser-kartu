package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.io.IOException;

/* compiled from: MyApplication */
public final class b45 extends xj {

    /* renamed from: s, reason: collision with root package name */
    public final int f5570s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5571t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5572u;

    /* renamed from: v, reason: collision with root package name */
    public final eq5 f5573v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5574w;

    /* renamed from: x, reason: collision with root package name */
    public final xp5 f5575x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f5576y;

    private b45(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, null, false);
    }

    public static b45 a(IOException iOException, int i7) {
        return new b45(0, iOException, i7);
    }

    public static b45 b(Throwable th, String str, int i7, eq5 eq5Var, int i8, xp5 xp5Var, boolean z7, int i9) {
        if (eq5Var == null) {
            i8 = 4;
        }
        return new b45(1, th, null, i9, str, i7, eq5Var, i8, xp5Var, z7);
    }

    public static b45 c(RuntimeException runtimeException, int i7) {
        return new b45(2, runtimeException, i7);
    }

    final b45 d(xp5 xp5Var) {
        String message = getMessage();
        String str = hi2.f9535a;
        return new b45(message, getCause(), this.f18846q, this.f5570s, this.f5571t, this.f5572u, this.f5573v, this.f5574w, xp5Var, this.f18847r, this.f5576y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b45(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.eq5 r20, int r21, com.google.android.gms.internal.ads.xp5 r22, boolean r23) {
        /*
            r13 = this;
            r8 = r21
            if (r14 == 0) goto L80
            r0 = 1
            if (r14 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L86
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r2 = com.google.android.gms.internal.ads.hi2.f9535a
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r19)
            int r2 = r2 + 14
            int r3 = r3.length()
            int r2 = r2 + r3
            int r2 = r2 + 9
            int r3 = r1.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 19
            int r4 = r0.length()
            int r2 = r2 + r4
            r3.<init>(r2)
            r5 = r18
            r3.append(r5)
            java.lang.String r2 = " error, index="
            r3.append(r2)
            r6 = r19
            r3.append(r6)
            java.lang.String r2 = ", format="
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ", format_supported="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L86
        L80:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L86:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L93
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L93:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r17
            r7 = r20
            r9 = r22
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b45.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.eq5, int, com.google.android.gms.internal.ads.xp5, boolean):void");
    }

    private b45(String str, Throwable th, int i7, int i8, String str2, int i9, eq5 eq5Var, int i10, xp5 xp5Var, long j7, boolean z7) {
        super(str, th, i7, Bundle.EMPTY, j7);
        boolean z8;
        if (!z7) {
            z8 = true;
        } else if (i8 == 1) {
            i8 = 1;
            z8 = true;
        } else {
            z8 = false;
        }
        rx3.a(z8);
        rx3.a(th != null);
        this.f5570s = i8;
        this.f5571t = str2;
        this.f5572u = i9;
        this.f5573v = eq5Var;
        this.f5574w = i10;
        this.f5575x = xp5Var;
        this.f5576y = z7;
    }
}
