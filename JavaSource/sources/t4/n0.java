package t4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class n0 extends q3.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: q, reason: collision with root package name */
    public final List f26416q;

    n0(List list) {
        this.f26416q = list;
    }

    public static n0 M0(k0... k0VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k0VarArr[0].a()));
        return new n0(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f26416q;
        int a8 = q3.c.a(parcel);
        q3.c.n(parcel, 1, list, false);
        q3.c.b(parcel, a8);
    }
}
