package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* compiled from: MyApplication */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.b {

    /* renamed from: k, reason: collision with root package name */
    e[] f2624k;

    /* renamed from: l, reason: collision with root package name */
    t0.a f2625l;

    /* renamed from: m, reason: collision with root package name */
    t0.a f2626m;

    /* renamed from: n, reason: collision with root package name */
    private int f2627n;

    /* renamed from: o, reason: collision with root package name */
    private final androidx.recyclerview.widget.a f2628o;

    /* renamed from: r, reason: collision with root package name */
    private BitSet f2631r;

    /* renamed from: w, reason: collision with root package name */
    private d f2636w;

    /* renamed from: j, reason: collision with root package name */
    private int f2623j = -1;

    /* renamed from: p, reason: collision with root package name */
    boolean f2629p = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f2630q = false;

    /* renamed from: s, reason: collision with root package name */
    int f2632s = -1;

    /* renamed from: t, reason: collision with root package name */
    int f2633t = Integer.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    c f2634u = new c();

    /* renamed from: v, reason: collision with root package name */
    private int f2635v = 2;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f2637x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    private final b f2638y = new b();

    /* renamed from: z, reason: collision with root package name */
    private boolean f2639z = false;
    private boolean A = true;
    private final Runnable B = new a();

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.j();
        }
    }

    /* compiled from: MyApplication */
    class b {

        /* renamed from: a, reason: collision with root package name */
        int f2641a;

        /* renamed from: b, reason: collision with root package name */
        int f2642b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2643c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2644d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2645e;

        /* renamed from: f, reason: collision with root package name */
        int[] f2646f;

        b() {
            a();
        }

        void a() {
            this.f2641a = -1;
            this.f2642b = Integer.MIN_VALUE;
            this.f2643c = false;
            this.f2644d = false;
            this.f2645e = false;
            int[] iArr = this.f2646f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* compiled from: MyApplication */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        int[] f2648a;

        /* renamed from: b, reason: collision with root package name */
        List f2649b;

        /* compiled from: MyApplication */
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0044a();

            /* renamed from: q, reason: collision with root package name */
            int f2650q;

            /* renamed from: r, reason: collision with root package name */
            int f2651r;

            /* renamed from: s, reason: collision with root package name */
            int[] f2652s;

            /* renamed from: t, reason: collision with root package name */
            boolean f2653t;

            /* compiled from: MyApplication */
            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a, reason: collision with other inner class name */
            class C0044a implements Parcelable.Creator {
                C0044a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            a(Parcel parcel) {
                this.f2650q = parcel.readInt();
                this.f2651r = parcel.readInt();
                this.f2653t = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2652s = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2650q + ", mGapDir=" + this.f2651r + ", mHasUnwantedGapAfter=" + this.f2653t + ", mGapPerSpan=" + Arrays.toString(this.f2652s) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f2650q);
                parcel.writeInt(this.f2651r);
                parcel.writeInt(this.f2653t ? 1 : 0);
                int[] iArr = this.f2652s;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2652s);
                }
            }
        }

        c() {
        }

        private int f(int i7) {
            if (this.f2649b == null) {
                return -1;
            }
            a d8 = d(i7);
            if (d8 != null) {
                this.f2649b.remove(d8);
            }
            int size = this.f2649b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                }
                if (((a) this.f2649b.get(i8)).f2650q >= i7) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return -1;
            }
            a aVar = (a) this.f2649b.get(i8);
            this.f2649b.remove(i8);
            return aVar.f2650q;
        }

        void a() {
            int[] iArr = this.f2648a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2649b = null;
        }

        int b(int i7) {
            List list = this.f2649b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f2649b.get(size)).f2650q >= i7) {
                        this.f2649b.remove(size);
                    }
                }
            }
            return e(i7);
        }

        public a c(int i7, int i8, int i9, boolean z7) {
            List list = this.f2649b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f2649b.get(i10);
                int i11 = aVar.f2650q;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || aVar.f2651r == i9 || (z7 && aVar.f2653t))) {
                    return aVar;
                }
            }
            return null;
        }

        public a d(int i7) {
            List list = this.f2649b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f2649b.get(size);
                if (aVar.f2650q == i7) {
                    return aVar;
                }
            }
            return null;
        }

        int e(int i7) {
            int[] iArr = this.f2648a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            int f8 = f(i7);
            if (f8 == -1) {
                int[] iArr2 = this.f2648a;
                Arrays.fill(iArr2, i7, iArr2.length, -1);
                return this.f2648a.length;
            }
            int min = Math.min(f8 + 1, this.f2648a.length);
            Arrays.fill(this.f2648a, i7, min, -1);
            return min;
        }
    }

    /* compiled from: MyApplication */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f2654q;

        /* renamed from: r, reason: collision with root package name */
        int f2655r;

        /* renamed from: s, reason: collision with root package name */
        int f2656s;

        /* renamed from: t, reason: collision with root package name */
        int[] f2657t;

        /* renamed from: u, reason: collision with root package name */
        int f2658u;

        /* renamed from: v, reason: collision with root package name */
        int[] f2659v;

        /* renamed from: w, reason: collision with root package name */
        List f2660w;

        /* renamed from: x, reason: collision with root package name */
        boolean f2661x;

        /* renamed from: y, reason: collision with root package name */
        boolean f2662y;

        /* renamed from: z, reason: collision with root package name */
        boolean f2663z;

        /* compiled from: MyApplication */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        d(Parcel parcel) {
            this.f2654q = parcel.readInt();
            this.f2655r = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2656s = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2657t = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2658u = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2659v = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2661x = parcel.readInt() == 1;
            this.f2662y = parcel.readInt() == 1;
            this.f2663z = parcel.readInt() == 1;
            this.f2660w = parcel.readArrayList(c.a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f2654q);
            parcel.writeInt(this.f2655r);
            parcel.writeInt(this.f2656s);
            if (this.f2656s > 0) {
                parcel.writeIntArray(this.f2657t);
            }
            parcel.writeInt(this.f2658u);
            if (this.f2658u > 0) {
                parcel.writeIntArray(this.f2659v);
            }
            parcel.writeInt(this.f2661x ? 1 : 0);
            parcel.writeInt(this.f2662y ? 1 : 0);
            parcel.writeInt(this.f2663z ? 1 : 0);
            parcel.writeList(this.f2660w);
        }
    }

    /* compiled from: MyApplication */
    class e {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f2664a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f2665b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f2666c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f2667d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f2668e;

        e(int i7) {
            this.f2668e = i7;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        b.c f8 = androidx.recyclerview.widget.b.f(context, attributeSet, i7, i8);
        q(f8.f2688a);
        s(f8.f2689b);
        r(f8.f2690c);
        this.f2628o = new androidx.recyclerview.widget.a();
        k();
    }

    private void k() {
        this.f2625l = t0.a.b(this, this.f2627n);
        this.f2626m = t0.a.b(this, 1 - this.f2627n);
    }

    @Override // androidx.recyclerview.widget.b
    public void a(String str) {
        if (this.f2636w == null) {
            super.a(str);
        }
    }

    boolean j() {
        int l7;
        int m7;
        if (c() == 0 || this.f2635v == 0 || !g()) {
            return false;
        }
        if (this.f2630q) {
            l7 = m();
            m7 = l();
        } else {
            l7 = l();
            m7 = m();
        }
        if (l7 == 0 && n() != null) {
            this.f2634u.a();
            i();
            h();
            return true;
        }
        if (!this.f2639z) {
            return false;
        }
        int i7 = this.f2630q ? -1 : 1;
        int i8 = m7 + 1;
        c.a c8 = this.f2634u.c(l7, i8, i7, true);
        if (c8 == null) {
            this.f2639z = false;
            this.f2634u.b(i8);
            return false;
        }
        c.a c9 = this.f2634u.c(l7, c8.f2650q, i7 * (-1), true);
        if (c9 == null) {
            this.f2634u.b(c8.f2650q);
        } else {
            this.f2634u.b(c9.f2650q + 1);
        }
        i();
        h();
        return true;
    }

    int l() {
        if (c() == 0) {
            return 0;
        }
        return e(b(0));
    }

    int m() {
        int c8 = c();
        if (c8 == 0) {
            return 0;
        }
        return e(b(c8 - 1));
    }

    View n() {
        int c8 = c();
        int i7 = c8 - 1;
        new BitSet(this.f2623j).set(0, this.f2623j, true);
        if (this.f2627n == 1) {
            p();
        }
        if (this.f2630q) {
            c8 = -1;
        } else {
            i7 = 0;
        }
        if (i7 == c8) {
            return null;
        }
        android.support.v4.media.session.b.a(b(i7).getLayoutParams());
        throw null;
    }

    public void o() {
        this.f2634u.a();
        h();
    }

    boolean p() {
        return d() == 1;
    }

    public void q(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i7 == this.f2627n) {
            return;
        }
        this.f2627n = i7;
        t0.a aVar = this.f2625l;
        this.f2625l = this.f2626m;
        this.f2626m = aVar;
        h();
    }

    public void r(boolean z7) {
        a(null);
        d dVar = this.f2636w;
        if (dVar != null && dVar.f2661x != z7) {
            dVar.f2661x = z7;
        }
        this.f2629p = z7;
        h();
    }

    public void s(int i7) {
        a(null);
        if (i7 != this.f2623j) {
            o();
            this.f2623j = i7;
            this.f2631r = new BitSet(this.f2623j);
            this.f2624k = new e[this.f2623j];
            for (int i8 = 0; i8 < this.f2623j; i8++) {
                this.f2624k[i8] = new e(i8);
            }
            h();
        }
    }
}
