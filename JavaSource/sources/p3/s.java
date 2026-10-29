package p3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public class s extends q3.a {
    public static final Parcelable.Creator<s> CREATOR = new w();

    /* renamed from: q, reason: collision with root package name */
    private final int f25269q;

    /* renamed from: r, reason: collision with root package name */
    private List f25270r;

    public s(int i7, List list) {
        this.f25269q = i7;
        this.f25270r = list;
    }

    public final int M0() {
        return this.f25269q;
    }

    public final List N0() {
        return this.f25270r;
    }

    public final void O0(m mVar) {
        if (this.f25270r == null) {
            this.f25270r = new ArrayList();
        }
        this.f25270r.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f25269q);
        q3.c.v(parcel, 2, this.f25270r, false);
        q3.c.b(parcel, a8);
    }
}
