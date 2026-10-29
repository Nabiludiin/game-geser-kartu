package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: MyApplication */
public final class hv5 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f9723g = gv5.f9176q;

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f9724h = fv5.f8508q;

    /* renamed from: d, reason: collision with root package name */
    private int f9728d;

    /* renamed from: e, reason: collision with root package name */
    private int f9729e;

    /* renamed from: f, reason: collision with root package name */
    private int f9730f;

    /* renamed from: b, reason: collision with root package name */
    private final ev5[] f9726b = new ev5[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9725a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f9727c = -1;

    public hv5(int i7) {
    }

    public final void a() {
        this.f9725a.clear();
        this.f9727c = -1;
        this.f9728d = 0;
        this.f9729e = 0;
    }

    public final void b(int i7, float f8) {
        ev5 ev5Var;
        if (this.f9727c != 1) {
            Collections.sort(this.f9725a, f9723g);
            this.f9727c = 1;
        }
        int i8 = this.f9730f;
        if (i8 > 0) {
            ev5[] ev5VarArr = this.f9726b;
            int i9 = i8 - 1;
            this.f9730f = i9;
            ev5Var = ev5VarArr[i9];
        } else {
            ev5Var = new ev5(null);
        }
        int i10 = this.f9728d;
        this.f9728d = i10 + 1;
        ev5Var.f7840a = i10;
        ev5Var.f7841b = i7;
        ev5Var.f7842c = f8;
        ArrayList arrayList = this.f9725a;
        arrayList.add(ev5Var);
        this.f9729e += i7;
        while (true) {
            int i11 = this.f9729e;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 - 2000;
            ev5 ev5Var2 = (ev5) arrayList.get(0);
            int i13 = ev5Var2.f7841b;
            if (i13 <= i12) {
                this.f9729e -= i13;
                arrayList.remove(0);
                int i14 = this.f9730f;
                if (i14 < 5) {
                    ev5[] ev5VarArr2 = this.f9726b;
                    this.f9730f = i14 + 1;
                    ev5VarArr2[i14] = ev5Var2;
                }
            } else {
                ev5Var2.f7841b = i13 - i12;
                this.f9729e -= i12;
            }
        }
    }

    public final float c(float f8) {
        int i7 = 0;
        if (this.f9727c != 0) {
            Collections.sort(this.f9725a, f9724h);
            this.f9727c = 0;
        }
        float f9 = this.f9729e;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f9725a;
            if (i7 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((ev5) arrayList.get(arrayList.size() - 1)).f7842c;
            }
            float f10 = 0.5f * f9;
            ev5 ev5Var = (ev5) arrayList.get(i7);
            i8 += ev5Var.f7841b;
            if (i8 >= f10) {
                return ev5Var.f7842c;
            }
            i7++;
        }
    }
}
