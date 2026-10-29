package s2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* compiled from: MyApplication */
public final class g5 extends q3.a {
    public static final Parcelable.Creator<g5> CREATOR = new h5();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: q, reason: collision with root package name */
    public final String f26095q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26096r;

    /* renamed from: s, reason: collision with root package name */
    public final int f26097s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f26098t;

    /* renamed from: u, reason: collision with root package name */
    public final int f26099u;

    /* renamed from: v, reason: collision with root package name */
    public final int f26100v;

    /* renamed from: w, reason: collision with root package name */
    public final g5[] f26101w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f26102x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f26103y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26104z;

    public g5() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int M0(DisplayMetrics displayMetrics) {
        return (int) (Q0(displayMetrics) * displayMetrics.density);
    }

    public static g5 N0() {
        return new g5("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static g5 O0() {
        return new g5("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static g5 P0() {
        return new g5("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    private static int Q0(DisplayMetrics displayMetrics) {
        int i7 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i7 <= 400) {
            return 32;
        }
        return i7 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26095q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.l(parcel, 3, this.f26096r);
        q3.c.l(parcel, 4, this.f26097s);
        q3.c.c(parcel, 5, this.f26098t);
        q3.c.l(parcel, 6, this.f26099u);
        q3.c.l(parcel, 7, this.f26100v);
        q3.c.u(parcel, 8, this.f26101w, i7, false);
        q3.c.c(parcel, 9, this.f26102x);
        q3.c.c(parcel, 10, this.f26103y);
        q3.c.c(parcel, 11, this.f26104z);
        q3.c.c(parcel, 12, this.A);
        q3.c.c(parcel, 13, this.B);
        q3.c.c(parcel, 14, this.C);
        q3.c.c(parcel, 15, this.D);
        q3.c.c(parcel, 16, this.E);
        q3.c.b(parcel, a8);
    }

    public g5(Context context, k2.h hVar) {
        this(context, new k2.h[]{hVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g5(android.content.Context r13, k2.h[] r14) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.g5.<init>(android.content.Context, k2.h[]):void");
    }

    g5(String str, int i7, int i8, boolean z7, int i9, int i10, g5[] g5VarArr, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f26095q = str;
        this.f26096r = i7;
        this.f26097s = i8;
        this.f26098t = z7;
        this.f26099u = i9;
        this.f26100v = i10;
        this.f26101w = g5VarArr;
        this.f26102x = z8;
        this.f26103y = z9;
        this.f26104z = z10;
        this.A = z11;
        this.B = z12;
        this.C = z13;
        this.D = z14;
        this.E = z15;
    }
}
