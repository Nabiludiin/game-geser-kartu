package v4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public final class b extends q3.a implements l3.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: q, reason: collision with root package name */
    final int f26904q;

    /* renamed from: r, reason: collision with root package name */
    private int f26905r;

    /* renamed from: s, reason: collision with root package name */
    private Intent f26906s;

    b(int i7, int i8, Intent intent) {
        this.f26904q = i7;
        this.f26905r = i8;
        this.f26906s = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26904q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f26905r);
        q3.c.q(parcel, 3, this.f26906s, i7, false);
        q3.c.b(parcel, a8);
    }

    @Override // l3.j
    public final Status x0() {
        return this.f26905r == 0 ? Status.f4416v : Status.f4420z;
    }
}
