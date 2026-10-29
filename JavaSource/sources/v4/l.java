package v4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.l0;

/* compiled from: MyApplication */
public final class l extends q3.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: q, reason: collision with root package name */
    final int f26911q;

    /* renamed from: r, reason: collision with root package name */
    private final k3.b f26912r;

    /* renamed from: s, reason: collision with root package name */
    private final l0 f26913s;

    l(int i7, k3.b bVar, l0 l0Var) {
        this.f26911q = i7;
        this.f26912r = bVar;
        this.f26913s = l0Var;
    }

    public final k3.b M0() {
        return this.f26912r;
    }

    public final l0 N0() {
        return this.f26913s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f26911q);
        q3.c.q(parcel, 2, this.f26912r, i7, false);
        q3.c.q(parcel, 3, this.f26913s, i7, false);
        q3.c.b(parcel, a8);
    }
}
