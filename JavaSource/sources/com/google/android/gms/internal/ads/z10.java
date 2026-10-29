package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class z10 extends q3.a {
    public static final Parcelable.Creator<z10> CREATOR = new a20();
    public final int A;

    /* renamed from: q, reason: collision with root package name */
    public final int f19954q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f19955r;

    /* renamed from: s, reason: collision with root package name */
    public final int f19956s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f19957t;

    /* renamed from: u, reason: collision with root package name */
    public final int f19958u;

    /* renamed from: v, reason: collision with root package name */
    public final s2.u4 f19959v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f19960w;

    /* renamed from: x, reason: collision with root package name */
    public final int f19961x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19962y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f19963z;

    public z10(int i7, boolean z7, int i8, boolean z8, int i9, s2.u4 u4Var, boolean z9, int i10, int i11, boolean z10, int i12) {
        this.f19954q = i7;
        this.f19955r = z7;
        this.f19956s = i8;
        this.f19957t = z8;
        this.f19958u = i9;
        this.f19959v = u4Var;
        this.f19960w = z9;
        this.f19961x = i10;
        this.f19963z = z10;
        this.f19962y = i11;
        this.A = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.nativead.c M0(com.google.android.gms.internal.ads.z10 r5) {
        /*
            com.google.android.gms.ads.nativead.c$a r0 = new com.google.android.gms.ads.nativead.c$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.f19954q
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.f19960w
            r0.e(r1)
            int r1 = r5.f19961x
            r0.d(r1)
            int r1 = r5.f19962y
            boolean r4 = r5.f19963z
            r0.b(r1, r4)
            int r1 = r5.A
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.q(r2)
        L39:
            s2.u4 r1 = r5.f19959v
            if (r1 == 0) goto L45
            k2.x r2 = new k2.x
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.f19958u
            r0.c(r1)
        L4a:
            boolean r1 = r5.f19955r
            r0.g(r1)
            boolean r5 = r5.f19957t
            r0.f(r5)
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z10.M0(com.google.android.gms.internal.ads.z10):com.google.android.gms.ads.nativead.c");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f19954q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.c(parcel, 2, this.f19955r);
        q3.c.l(parcel, 3, this.f19956s);
        q3.c.c(parcel, 4, this.f19957t);
        q3.c.l(parcel, 5, this.f19958u);
        q3.c.q(parcel, 6, this.f19959v, i7, false);
        q3.c.c(parcel, 7, this.f19960w);
        q3.c.l(parcel, 8, this.f19961x);
        q3.c.l(parcel, 9, this.f19962y);
        q3.c.c(parcel, 10, this.f19963z);
        q3.c.l(parcel, 11, this.A);
        q3.c.b(parcel, a8);
    }

    public z10(n2.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new s2.u4(eVar.d()) : null, eVar.g(), eVar.c(), 0, false, 0);
    }
}
