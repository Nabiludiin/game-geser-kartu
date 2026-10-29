package t4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class a extends q3.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f26397q;

    public a(Bundle bundle) {
        this.f26397q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.f26397q;
        int a8 = q3.c.a(parcel);
        q3.c.f(parcel, 1, bundle, false);
        q3.c.b(parcel, a8);
    }
}
