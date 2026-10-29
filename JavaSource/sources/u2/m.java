package u2;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w3.a;

/* compiled from: MyApplication */
public final class m extends q3.a {
    public static final Parcelable.Creator<m> CREATOR = new l();
    public final Bundle A;

    /* renamed from: q, reason: collision with root package name */
    public final String f26525q;

    /* renamed from: r, reason: collision with root package name */
    public final String f26526r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26527s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26528t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26529u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26530v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26531w;

    /* renamed from: x, reason: collision with root package name */
    public final Intent f26532x;

    /* renamed from: y, reason: collision with root package name */
    public final b f26533y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f26534z;

    public m(Intent intent, b bVar) {
        this(null, null, null, null, null, null, null, intent, w3.b.C1(bVar).asBinder(), false, new Bundle());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26525q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.r(parcel, 3, this.f26526r, false);
        q3.c.r(parcel, 4, this.f26527s, false);
        q3.c.r(parcel, 5, this.f26528t, false);
        q3.c.r(parcel, 6, this.f26529u, false);
        q3.c.r(parcel, 7, this.f26530v, false);
        q3.c.r(parcel, 8, this.f26531w, false);
        q3.c.q(parcel, 9, this.f26532x, i7, false);
        q3.c.k(parcel, 10, w3.b.C1(this.f26533y).asBinder(), false);
        q3.c.c(parcel, 11, this.f26534z);
        q3.c.f(parcel, 12, this.A, false);
        q3.c.b(parcel, a8);
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z7, Bundle bundle) {
        this.f26525q = str;
        this.f26526r = str2;
        this.f26527s = str3;
        this.f26528t = str4;
        this.f26529u = str5;
        this.f26530v = str6;
        this.f26531w = str7;
        this.f26532x = intent;
        this.f26533y = (b) w3.b.r0(a.AbstractBinderC0140a.O(iBinder));
        this.f26534z = z7;
        this.A = bundle;
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, w3.b.C1(bVar).asBinder(), false, new Bundle());
    }
}
