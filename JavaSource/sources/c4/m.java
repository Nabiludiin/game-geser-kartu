package c4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class m extends q {
    public static final Parcelable.Creator<m> CREATOR = new l();

    /* renamed from: q, reason: collision with root package name */
    private final Bundle f3495q;

    /* renamed from: r, reason: collision with root package name */
    private final IBinder f3496r;

    public m(p pVar) {
        this.f3495q = pVar.a();
        this.f3496r = pVar.f3501a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.f(parcel, 1, this.f3495q, false);
        q3.c.k(parcel, 2, this.f3496r, false);
        q3.c.b(parcel, a8);
    }

    m(Bundle bundle, IBinder iBinder) {
        this.f3495q = bundle;
        this.f3496r = iBinder;
    }
}
