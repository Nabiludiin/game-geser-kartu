package v4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: MyApplication */
public final class h extends q3.a implements l3.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: q, reason: collision with root package name */
    private final List f26907q;

    /* renamed from: r, reason: collision with root package name */
    private final String f26908r;

    public h(List list, String str) {
        this.f26907q = list;
        this.f26908r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f26907q;
        int a8 = q3.c.a(parcel);
        q3.c.t(parcel, 1, list, false);
        q3.c.r(parcel, 2, this.f26908r, false);
        q3.c.b(parcel, a8);
    }

    @Override // l3.j
    public final Status x0() {
        return this.f26908r != null ? Status.f4416v : Status.f4420z;
    }
}
