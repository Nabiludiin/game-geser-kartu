package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class ys5 extends b40 {
    private boolean A;
    private boolean B;
    private boolean C;
    private final SparseArray D;
    private final SparseBooleanArray E;

    /* renamed from: w, reason: collision with root package name */
    private boolean f19768w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f19769x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f19770y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19771z;

    public ys5() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f19768w = true;
        this.f19769x = true;
        this.f19770y = true;
        this.f19771z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }

    final /* synthetic */ boolean A() {
        return this.f19771z;
    }

    final /* synthetic */ boolean B() {
        return this.A;
    }

    final /* synthetic */ boolean C() {
        return this.B;
    }

    final /* synthetic */ boolean D() {
        return this.C;
    }

    final /* synthetic */ SparseArray E() {
        return this.D;
    }

    final /* synthetic */ SparseBooleanArray F() {
        return this.E;
    }

    protected final ys5 G(a50 a50Var) {
        super.a(a50Var);
        return this;
    }

    public final ys5 H(int i7, boolean z7) {
        SparseBooleanArray sparseBooleanArray = this.E;
        if (sparseBooleanArray.get(i7) == z7) {
            return this;
        }
        if (z7) {
            sparseBooleanArray.put(i7, true);
            return this;
        }
        sparseBooleanArray.delete(i7);
        return this;
    }

    final /* synthetic */ boolean I() {
        return this.f19768w;
    }

    final /* synthetic */ boolean y() {
        return this.f19769x;
    }

    final /* synthetic */ boolean z() {
        return this.f19770y;
    }

    /* synthetic */ ys5(zs5 zs5Var, byte[] bArr) {
        super(zs5Var);
        this.f19768w = zs5Var.J;
        this.f19769x = zs5Var.L;
        this.f19770y = zs5Var.N;
        this.f19771z = zs5Var.S;
        this.A = zs5Var.T;
        this.B = zs5Var.U;
        this.C = zs5Var.W;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray e8 = zs5Var.e();
            if (i7 < e8.size()) {
                sparseArray.put(e8.keyAt(i7), new HashMap((Map) e8.valueAt(i7)));
                i7++;
            } else {
                this.D = sparseArray;
                this.E = zs5Var.f().clone();
                return;
            }
        }
    }
}
