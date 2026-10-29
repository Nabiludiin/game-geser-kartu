package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.b;

/* compiled from: MyApplication */
public class LinearLayoutManager extends androidx.recyclerview.widget.b {

    /* renamed from: k, reason: collision with root package name */
    t0.a f2603k;

    /* renamed from: j, reason: collision with root package name */
    int f2602j = 1;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2604l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f2605m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2606n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2607o = true;

    /* renamed from: p, reason: collision with root package name */
    int f2608p = -1;

    /* renamed from: q, reason: collision with root package name */
    int f2609q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    c f2610r = null;

    /* renamed from: s, reason: collision with root package name */
    final a f2611s = new a();

    /* renamed from: t, reason: collision with root package name */
    private final b f2612t = new b();

    /* renamed from: u, reason: collision with root package name */
    private int f2613u = 2;

    /* renamed from: v, reason: collision with root package name */
    private int[] f2614v = new int[2];

    /* compiled from: MyApplication */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        t0.a f2615a;

        /* renamed from: b, reason: collision with root package name */
        int f2616b;

        /* renamed from: c, reason: collision with root package name */
        int f2617c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2618d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2619e;

        a() {
            a();
        }

        void a() {
            this.f2616b = -1;
            this.f2617c = Integer.MIN_VALUE;
            this.f2618d = false;
            this.f2619e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2616b + ", mCoordinate=" + this.f2617c + ", mLayoutFromEnd=" + this.f2618d + ", mValid=" + this.f2619e + '}';
        }
    }

    /* compiled from: MyApplication */
    protected static class b {
        protected b() {
        }
    }

    /* compiled from: MyApplication */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f2620q;

        /* renamed from: r, reason: collision with root package name */
        int f2621r;

        /* renamed from: s, reason: collision with root package name */
        boolean f2622s;

        /* compiled from: MyApplication */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i7) {
                return new c[i7];
            }
        }

        c(Parcel parcel) {
            this.f2620q = parcel.readInt();
            this.f2621r = parcel.readInt();
            this.f2622s = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f2620q);
            parcel.writeInt(this.f2621r);
            parcel.writeInt(this.f2622s ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        b.c f8 = androidx.recyclerview.widget.b.f(context, attributeSet, i7, i8);
        j(f8.f2688a);
        k(f8.f2690c);
        l(f8.f2691d);
    }

    @Override // androidx.recyclerview.widget.b
    public void a(String str) {
        if (this.f2610r == null) {
            super.a(str);
        }
    }

    public void j(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        a(null);
        if (i7 != this.f2602j || this.f2603k == null) {
            t0.a b8 = t0.a.b(this, i7);
            this.f2603k = b8;
            this.f2611s.f2615a = b8;
            this.f2602j = i7;
            h();
        }
    }

    public void k(boolean z7) {
        a(null);
        if (z7 == this.f2604l) {
            return;
        }
        this.f2604l = z7;
        h();
    }

    public void l(boolean z7) {
        a(null);
        if (this.f2606n == z7) {
            return;
        }
        this.f2606n = z7;
        h();
    }
}
