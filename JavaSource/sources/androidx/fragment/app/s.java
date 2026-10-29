package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();
    final boolean A;
    final int B;
    Bundle C;

    /* renamed from: q, reason: collision with root package name */
    final String f2348q;

    /* renamed from: r, reason: collision with root package name */
    final String f2349r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f2350s;

    /* renamed from: t, reason: collision with root package name */
    final int f2351t;

    /* renamed from: u, reason: collision with root package name */
    final int f2352u;

    /* renamed from: v, reason: collision with root package name */
    final String f2353v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f2354w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f2355x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f2356y;

    /* renamed from: z, reason: collision with root package name */
    final Bundle f2357z;

    /* compiled from: MyApplication */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i7) {
            return new s[i7];
        }
    }

    s(Fragment fragment) {
        this.f2348q = fragment.getClass().getName();
        this.f2349r = fragment.f2108v;
        this.f2350s = fragment.D;
        this.f2351t = fragment.M;
        this.f2352u = fragment.N;
        this.f2353v = fragment.O;
        this.f2354w = fragment.R;
        this.f2355x = fragment.C;
        this.f2356y = fragment.Q;
        this.f2357z = fragment.f2109w;
        this.A = fragment.P;
        this.B = fragment.f2094h0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2348q);
        sb.append(" (");
        sb.append(this.f2349r);
        sb.append(")}:");
        if (this.f2350s) {
            sb.append(" fromLayout");
        }
        if (this.f2352u != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2352u));
        }
        String str = this.f2353v;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2353v);
        }
        if (this.f2354w) {
            sb.append(" retainInstance");
        }
        if (this.f2355x) {
            sb.append(" removing");
        }
        if (this.f2356y) {
            sb.append(" detached");
        }
        if (this.A) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2348q);
        parcel.writeString(this.f2349r);
        parcel.writeInt(this.f2350s ? 1 : 0);
        parcel.writeInt(this.f2351t);
        parcel.writeInt(this.f2352u);
        parcel.writeString(this.f2353v);
        parcel.writeInt(this.f2354w ? 1 : 0);
        parcel.writeInt(this.f2355x ? 1 : 0);
        parcel.writeInt(this.f2356y ? 1 : 0);
        parcel.writeBundle(this.f2357z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.C);
        parcel.writeInt(this.B);
    }

    s(Parcel parcel) {
        this.f2348q = parcel.readString();
        this.f2349r = parcel.readString();
        this.f2350s = parcel.readInt() != 0;
        this.f2351t = parcel.readInt();
        this.f2352u = parcel.readInt();
        this.f2353v = parcel.readString();
        this.f2354w = parcel.readInt() != 0;
        this.f2355x = parcel.readInt() != 0;
        this.f2356y = parcel.readInt() != 0;
        this.f2357z = parcel.readBundle();
        this.A = parcel.readInt() != 0;
        this.C = parcel.readBundle();
        this.B = parcel.readInt();
    }
}
