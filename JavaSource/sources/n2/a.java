package n2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class a extends q3.a {
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* renamed from: q, reason: collision with root package name */
    private final boolean f24995q;

    a(boolean z7) {
        this.f24995q = z7;
    }

    public boolean M0() {
        return this.f24995q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 1, M0());
        q3.c.b(parcel, a8);
    }
}
