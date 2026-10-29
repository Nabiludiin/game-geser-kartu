package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class e extends q3.a {
    public static final Parcelable.Creator<e> CREATOR = new h1();

    /* renamed from: q, reason: collision with root package name */
    private final q f25167q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f25168r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f25169s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f25170t;

    /* renamed from: u, reason: collision with root package name */
    private final int f25171u;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f25172v;

    public e(q qVar, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f25167q = qVar;
        this.f25168r = z7;
        this.f25169s = z8;
        this.f25170t = iArr;
        this.f25171u = i7;
        this.f25172v = iArr2;
    }

    public int M0() {
        return this.f25171u;
    }

    public int[] N0() {
        return this.f25170t;
    }

    public int[] O0() {
        return this.f25172v;
    }

    public boolean P0() {
        return this.f25168r;
    }

    public boolean Q0() {
        return this.f25169s;
    }

    public final q R0() {
        return this.f25167q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.q(parcel, 1, this.f25167q, i7, false);
        q3.c.c(parcel, 2, P0());
        q3.c.c(parcel, 3, Q0());
        q3.c.m(parcel, 4, N0(), false);
        q3.c.l(parcel, 5, M0());
        q3.c.m(parcel, 6, O0(), false);
        q3.c.b(parcel, a8);
    }
}
