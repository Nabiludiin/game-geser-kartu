package k3;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w3.a;

/* compiled from: MyApplication */
public final class c0 extends q3.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: q, reason: collision with root package name */
    private final String f24477q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f24478r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f24479s;

    /* renamed from: t, reason: collision with root package name */
    private final Context f24480t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f24481u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f24482v;

    c0(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9, boolean z10) {
        this.f24477q = str;
        this.f24478r = z7;
        this.f24479s = z8;
        this.f24480t = (Context) w3.b.r0(a.AbstractBinderC0140a.O(iBinder));
        this.f24481u = z9;
        this.f24482v = z10;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, w3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f24477q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.c(parcel, 2, this.f24478r);
        q3.c.c(parcel, 3, this.f24479s);
        q3.c.k(parcel, 4, w3.b.C1(this.f24480t), false);
        q3.c.c(parcel, 5, this.f24481u);
        q3.c.c(parcel, 6, this.f24482v);
        q3.c.b(parcel, a8);
    }
}
