package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: MyApplication */
public final class t9 implements p2 {

    /* renamed from: q, reason: collision with root package name */
    private final p2 f16036q;

    /* renamed from: r, reason: collision with root package name */
    private final q9 f16037r;

    /* renamed from: s, reason: collision with root package name */
    private final SparseArray f16038s = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    private boolean f16039t;

    public t9(p2 p2Var, q9 q9Var) {
        this.f16036q = p2Var;
        this.f16037r = q9Var;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final a4 A(int i7, int i8) {
        if (i8 != 3) {
            this.f16039t = true;
            return this.f16036q.A(i7, i8);
        }
        SparseArray sparseArray = this.f16038s;
        v9 v9Var = (v9) sparseArray.get(i7);
        if (v9Var != null) {
            return v9Var;
        }
        v9 v9Var2 = new v9(this.f16036q.A(i7, 3), this.f16037r);
        sparseArray.put(i7, v9Var2);
        return v9Var2;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void B(q3 q3Var) {
        this.f16036q.B(q3Var);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void z() {
        this.f16036q.z();
        if (!this.f16039t) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f16038s;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((v9) sparseArray.valueAt(i7)).g(true);
            i7++;
        }
    }
}
