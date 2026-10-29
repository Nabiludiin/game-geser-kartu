package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: MyApplication */
final class vr5 {

    /* renamed from: c, reason: collision with root package name */
    private final th1 f17740c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f17739b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f17738a = -1;

    public vr5(th1 th1Var) {
        this.f17740c = th1Var;
    }

    public final Object a(int i7) {
        SparseArray sparseArray;
        if (this.f17738a == -1) {
            this.f17738a = 0;
        }
        while (true) {
            int i8 = this.f17738a;
            if (i8 > 0 && i7 < this.f17739b.keyAt(i8)) {
                this.f17738a--;
            }
        }
        while (true) {
            int i9 = this.f17738a;
            sparseArray = this.f17739b;
            if (i9 >= sparseArray.size() - 1 || i7 < sparseArray.keyAt(this.f17738a + 1)) {
                break;
            }
            this.f17738a++;
        }
        return sparseArray.valueAt(this.f17738a);
    }

    public final void b(int i7, Object obj) {
        if (this.f17738a == -1) {
            rx3.h(this.f17739b.size() == 0);
            this.f17738a = 0;
        }
        SparseArray sparseArray = this.f17739b;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            rx3.a(i7 >= keyAt);
            if (keyAt == i7) {
                this.f17740c.d(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i7, obj);
    }

    public final Object c() {
        return this.f17739b.valueAt(r0.size() - 1);
    }

    public final void d(int i7) {
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f17739b;
            if (i8 >= sparseArray.size() - 1) {
                return;
            }
            int i9 = i8 + 1;
            if (i7 < sparseArray.keyAt(i9)) {
                return;
            }
            this.f17740c.d(sparseArray.valueAt(i8));
            sparseArray.removeAt(i8);
            int i10 = this.f17738a;
            if (i10 > 0) {
                this.f17738a = i10 - 1;
            }
            i8 = i9;
        }
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f17739b;
            if (i7 >= sparseArray.size()) {
                this.f17738a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f17740c.d(sparseArray.valueAt(i7));
                i7++;
            }
        }
    }

    public final boolean f() {
        return this.f17739b.size() == 0;
    }
}
