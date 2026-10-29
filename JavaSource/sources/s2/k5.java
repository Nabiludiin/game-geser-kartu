package s2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class k5 extends q3.a {
    public static final Parcelable.Creator<k5> CREATOR = new l5();

    /* renamed from: q, reason: collision with root package name */
    public final String f26156q;

    /* renamed from: r, reason: collision with root package name */
    public long f26157r;

    /* renamed from: s, reason: collision with root package name */
    public x2 f26158s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f26159t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26160u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26161v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26162w;

    /* renamed from: x, reason: collision with root package name */
    public final String f26163x;

    public k5(String str, long j7, x2 x2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f26156q = str;
        this.f26157r = j7;
        this.f26158s = x2Var;
        this.f26159t = bundle;
        this.f26160u = str2;
        this.f26161v = str3;
        this.f26162w = str4;
        this.f26163x = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26156q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.o(parcel, 2, this.f26157r);
        q3.c.q(parcel, 3, this.f26158s, i7, false);
        q3.c.f(parcel, 4, this.f26159t, false);
        q3.c.r(parcel, 5, this.f26160u, false);
        q3.c.r(parcel, 6, this.f26161v, false);
        q3.c.r(parcel, 7, this.f26162w, false);
        q3.c.r(parcel, 8, this.f26163x, false);
        q3.c.b(parcel, a8);
    }
}
