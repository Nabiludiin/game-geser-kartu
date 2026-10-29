package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class z8 {

    /* renamed from: a, reason: collision with root package name */
    private final a9 f20043a = new a9();

    /* renamed from: b, reason: collision with root package name */
    private final y82 f20044b = new y82(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f20045c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f20046d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20047e;

    z8() {
    }

    private final int f(int i7) {
        int i8;
        int i9 = 0;
        this.f20046d = 0;
        do {
            int i10 = this.f20046d;
            int i11 = i7 + i10;
            a9 a9Var = this.f20043a;
            if (i11 >= a9Var.f4809c) {
                break;
            }
            this.f20046d = i10 + 1;
            i8 = a9Var.f4812f[i11];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final void a() {
        this.f20043a.a();
        this.f20044b.z(0);
        this.f20045c = -1;
        this.f20047e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.n2 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f20047e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.f20047e = r1
            com.google.android.gms.internal.ads.y82 r0 = r7.f20044b
            r0.z(r1)
        Ld:
            boolean r0 = r7.f20047e
            r2 = 1
            if (r0 != 0) goto L91
            int r0 = r7.f20045c
            if (r0 >= 0) goto L4a
            com.google.android.gms.internal.ads.a9 r0 = r7.f20043a
            r3 = -1
            boolean r3 = r0.b(r8, r3)
            if (r3 == 0) goto L49
            boolean r3 = r0.c(r8, r2)
            if (r3 != 0) goto L27
            goto L49
        L27:
            int r3 = r0.f4810d
            int r0 = r0.f4807a
            r0 = r0 & r2
            if (r0 != r2) goto L3e
            com.google.android.gms.internal.ads.y82 r0 = r7.f20044b
            int r0 = r0.D()
            if (r0 != 0) goto L3e
            int r0 = r7.f(r1)
            int r3 = r3 + r0
            int r0 = r7.f20046d
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.google.android.gms.internal.ads.q2.d(r8, r3)
            if (r3 != 0) goto L46
            return r1
        L46:
            r7.f20045c = r0
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r7.f(r0)
            int r3 = r7.f20045c
            int r4 = r7.f20046d
            int r3 = r3 + r4
            if (r0 <= 0) goto L86
            com.google.android.gms.internal.ads.y82 r4 = r7.f20044b
            int r5 = r4.D()
            int r5 = r5 + r0
            r4.B(r5)
            byte[] r5 = r4.H()
            int r6 = r4.D()
            boolean r5 = com.google.android.gms.internal.ads.q2.c(r8, r5, r6, r0)
            if (r5 != 0) goto L6e
            return r1
        L6e:
            int r5 = r4.D()
            int r5 = r5 + r0
            r4.E(r5)
            com.google.android.gms.internal.ads.a9 r0 = r7.f20043a
            int r4 = r3 + (-1)
            int[] r0 = r0.f4812f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L83
            goto L84
        L83:
            r2 = r1
        L84:
            r7.f20047e = r2
        L86:
            com.google.android.gms.internal.ads.a9 r0 = r7.f20043a
            int r0 = r0.f4809c
            if (r3 != r0) goto L8d
            r3 = -1
        L8d:
            r7.f20045c = r3
            goto Ld
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z8.b(com.google.android.gms.internal.ads.n2):boolean");
    }

    public final a9 c() {
        return this.f20043a;
    }

    public final y82 d() {
        return this.f20044b;
    }

    public final void e() {
        y82 y82Var = this.f20044b;
        if (y82Var.H().length == 65025) {
            return;
        }
        y82Var.A(Arrays.copyOf(y82Var.H(), Math.max(65025, y82Var.D())), y82Var.D());
    }
}
