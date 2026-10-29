package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.g;
import java.util.ArrayList;

/* compiled from: MyApplication */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final CharSequence A;
    final ArrayList B;
    final ArrayList C;
    final boolean D;

    /* renamed from: q, reason: collision with root package name */
    final int[] f2150q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f2151r;

    /* renamed from: s, reason: collision with root package name */
    final int[] f2152s;

    /* renamed from: t, reason: collision with root package name */
    final int[] f2153t;

    /* renamed from: u, reason: collision with root package name */
    final int f2154u;

    /* renamed from: v, reason: collision with root package name */
    final String f2155v;

    /* renamed from: w, reason: collision with root package name */
    final int f2156w;

    /* renamed from: x, reason: collision with root package name */
    final int f2157x;

    /* renamed from: y, reason: collision with root package name */
    final CharSequence f2158y;

    /* renamed from: z, reason: collision with root package name */
    final int f2159z;

    /* compiled from: MyApplication */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2371c.size();
        this.f2150q = new int[size * 5];
        if (!aVar.f2377i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2151r = new ArrayList(size);
        this.f2152s = new int[size];
        this.f2153t = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            v.a aVar2 = (v.a) aVar.f2371c.get(i8);
            int i9 = i7 + 1;
            this.f2150q[i7] = aVar2.f2388a;
            ArrayList arrayList = this.f2151r;
            Fragment fragment = aVar2.f2389b;
            arrayList.add(fragment != null ? fragment.f2108v : null);
            int[] iArr = this.f2150q;
            iArr[i9] = aVar2.f2390c;
            iArr[i7 + 2] = aVar2.f2391d;
            int i10 = i7 + 4;
            iArr[i7 + 3] = aVar2.f2392e;
            i7 += 5;
            iArr[i10] = aVar2.f2393f;
            this.f2152s[i8] = aVar2.f2394g.ordinal();
            this.f2153t[i8] = aVar2.f2395h.ordinal();
        }
        this.f2154u = aVar.f2376h;
        this.f2155v = aVar.f2379k;
        this.f2156w = aVar.f2147v;
        this.f2157x = aVar.f2380l;
        this.f2158y = aVar.f2381m;
        this.f2159z = aVar.f2382n;
        this.A = aVar.f2383o;
        this.B = aVar.f2384p;
        this.C = aVar.f2385q;
        this.D = aVar.f2386r;
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.f2150q.length) {
            v.a aVar2 = new v.a();
            int i9 = i7 + 1;
            aVar2.f2388a = this.f2150q[i7];
            if (n.D0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i8 + " base fragment #" + this.f2150q[i9]);
            }
            String str = (String) this.f2151r.get(i8);
            if (str != null) {
                aVar2.f2389b = nVar.e0(str);
            } else {
                aVar2.f2389b = null;
            }
            aVar2.f2394g = g.c.values()[this.f2152s[i8]];
            aVar2.f2395h = g.c.values()[this.f2153t[i8]];
            int[] iArr = this.f2150q;
            int i10 = iArr[i9];
            aVar2.f2390c = i10;
            int i11 = iArr[i7 + 2];
            aVar2.f2391d = i11;
            int i12 = i7 + 4;
            int i13 = iArr[i7 + 3];
            aVar2.f2392e = i13;
            i7 += 5;
            int i14 = iArr[i12];
            aVar2.f2393f = i14;
            aVar.f2372d = i10;
            aVar.f2373e = i11;
            aVar.f2374f = i13;
            aVar.f2375g = i14;
            aVar.e(aVar2);
            i8++;
        }
        aVar.f2376h = this.f2154u;
        aVar.f2379k = this.f2155v;
        aVar.f2147v = this.f2156w;
        aVar.f2377i = true;
        aVar.f2380l = this.f2157x;
        aVar.f2381m = this.f2158y;
        aVar.f2382n = this.f2159z;
        aVar.f2383o = this.A;
        aVar.f2384p = this.B;
        aVar.f2385q = this.C;
        aVar.f2386r = this.D;
        aVar.m(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f2150q);
        parcel.writeStringList(this.f2151r);
        parcel.writeIntArray(this.f2152s);
        parcel.writeIntArray(this.f2153t);
        parcel.writeInt(this.f2154u);
        parcel.writeString(this.f2155v);
        parcel.writeInt(this.f2156w);
        parcel.writeInt(this.f2157x);
        TextUtils.writeToParcel(this.f2158y, parcel, 0);
        parcel.writeInt(this.f2159z);
        TextUtils.writeToParcel(this.A, parcel, 0);
        parcel.writeStringList(this.B);
        parcel.writeStringList(this.C);
        parcel.writeInt(this.D ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2150q = parcel.createIntArray();
        this.f2151r = parcel.createStringArrayList();
        this.f2152s = parcel.createIntArray();
        this.f2153t = parcel.createIntArray();
        this.f2154u = parcel.readInt();
        this.f2155v = parcel.readString();
        this.f2156w = parcel.readInt();
        this.f2157x = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2158y = (CharSequence) creator.createFromParcel(parcel);
        this.f2159z = parcel.readInt();
        this.A = (CharSequence) creator.createFromParcel(parcel);
        this.B = parcel.createStringArrayList();
        this.C = parcel.createStringArrayList();
        this.D = parcel.readInt() != 0;
    }
}
