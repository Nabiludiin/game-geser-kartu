package s2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: MyApplication */
public final class m4 extends q3.a {
    public static final Parcelable.Creator<m4> CREATOR = new n4();

    /* renamed from: q, reason: collision with root package name */
    public final String f26189q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26190r;

    /* renamed from: s, reason: collision with root package name */
    public final b5 f26191s;

    /* renamed from: t, reason: collision with root package name */
    public final int f26192t;

    public m4(String str, int i7, b5 b5Var, int i8) {
        this.f26189q = str;
        this.f26190r = i7;
        this.f26191s = b5Var;
        this.f26192t = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m4) {
            m4 m4Var = (m4) obj;
            if (this.f26189q.equals(m4Var.f26189q) && this.f26190r == m4Var.f26190r && this.f26191s.M0(m4Var.f26191s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26189q, Integer.valueOf(this.f26190r), this.f26191s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26189q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.l(parcel, 2, this.f26190r);
        q3.c.q(parcel, 3, this.f26191s, i7, false);
        q3.c.l(parcel, 4, this.f26192t);
        q3.c.b(parcel, a8);
    }
}
