package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* compiled from: MyApplication */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f2332q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList f2333r;

    /* renamed from: s, reason: collision with root package name */
    b[] f2334s;

    /* renamed from: t, reason: collision with root package name */
    int f2335t;

    /* renamed from: u, reason: collision with root package name */
    String f2336u;

    /* renamed from: v, reason: collision with root package name */
    ArrayList f2337v;

    /* renamed from: w, reason: collision with root package name */
    ArrayList f2338w;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f2339x;

    /* compiled from: MyApplication */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i7) {
            return new p[i7];
        }
    }

    public p() {
        this.f2336u = null;
        this.f2337v = new ArrayList();
        this.f2338w = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeTypedList(this.f2332q);
        parcel.writeStringList(this.f2333r);
        parcel.writeTypedArray(this.f2334s, i7);
        parcel.writeInt(this.f2335t);
        parcel.writeString(this.f2336u);
        parcel.writeStringList(this.f2337v);
        parcel.writeTypedList(this.f2338w);
        parcel.writeTypedList(this.f2339x);
    }

    public p(Parcel parcel) {
        this.f2336u = null;
        this.f2337v = new ArrayList();
        this.f2338w = new ArrayList();
        this.f2332q = parcel.createTypedArrayList(s.CREATOR);
        this.f2333r = parcel.createStringArrayList();
        this.f2334s = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2335t = parcel.readInt();
        this.f2336u = parcel.readString();
        this.f2337v = parcel.createStringArrayList();
        this.f2338w = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2339x = parcel.createTypedArrayList(n.l.CREATOR);
    }
}
