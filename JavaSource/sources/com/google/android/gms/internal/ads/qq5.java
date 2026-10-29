package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
public final class qq5 extends fp5 {

    /* renamed from: s, reason: collision with root package name */
    private static final j9 f14573s;

    /* renamed from: k, reason: collision with root package name */
    private final aq5[] f14574k;

    /* renamed from: l, reason: collision with root package name */
    private final List f14575l;

    /* renamed from: m, reason: collision with root package name */
    private final az[] f14576m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f14577n;

    /* renamed from: o, reason: collision with root package name */
    private int f14578o = -1;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f14579p;

    /* renamed from: q, reason: collision with root package name */
    private oq5 f14580q;

    /* renamed from: r, reason: collision with root package name */
    private final ip5 f14581r;

    static {
        pu5 pu5Var = new pu5();
        pu5Var.a("MergingMediaSource");
        f14573s = pu5Var.c();
    }

    public qq5(boolean z7, boolean z8, ip5 ip5Var, aq5... aq5VarArr) {
        this.f14574k = aq5VarArr;
        this.f14581r = ip5Var;
        this.f14577n = new ArrayList(Arrays.asList(aq5VarArr));
        this.f14575l = new ArrayList(aq5VarArr.length);
        int i7 = 0;
        while (true) {
            int length = aq5VarArr.length;
            if (i7 >= length) {
                this.f14576m = new az[length];
                this.f14579p = new long[0][];
                new HashMap();
                l24.a(8).b(2).c();
                return;
            }
            this.f14575l.add(new ArrayList());
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* bridge */ /* synthetic */ xp5 B(Object obj, xp5 xp5Var) {
        int intValue = ((Integer) obj).intValue();
        List list = this.f14575l;
        List list2 = (List) list.get(intValue);
        for (int i7 = 0; i7 < list2.size(); i7++) {
            if (((pq5) list2.get(i7)).a().equals(xp5Var)) {
                return ((pq5) ((List) list.get(0)).get(i7)).a();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final j9 V() {
        aq5[] aq5VarArr = this.f14574k;
        return aq5VarArr.length > 0 ? aq5VarArr[0].V() : f14573s;
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final vp5 f(xp5 xp5Var, ku5 ku5Var, long j7) {
        az[] azVarArr = this.f14576m;
        aq5[] aq5VarArr = this.f14574k;
        int length = aq5VarArr.length;
        vp5[] vp5VarArr = new vp5[length];
        int e8 = azVarArr[0].e(xp5Var.f18924a);
        for (int i7 = 0; i7 < length; i7++) {
            xp5 a8 = xp5Var.a(azVarArr[i7].f(e8));
            vp5VarArr[i7] = aq5VarArr[i7].f(a8, ku5Var, j7 - this.f14579p[e8][i7]);
            ((List) this.f14575l.get(i7)).add(new pq5(a8, vp5VarArr[i7], null));
        }
        return new nq5(this.f14581r, this.f14579p[e8], vp5VarArr);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void h(vp5 vp5Var) {
        nq5 nq5Var = (nq5) vp5Var;
        int i7 = 0;
        while (true) {
            aq5[] aq5VarArr = this.f14574k;
            if (i7 >= aq5VarArr.length) {
                return;
            }
            List list = (List) this.f14575l.get(i7);
            vp5 i8 = nq5Var.i(i7);
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (((pq5) list.get(i9)).b().equals(i8)) {
                    list.remove(i9);
                    break;
                }
                i9++;
            }
            aq5VarArr[i7].h(nq5Var.i(i7));
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void i(j9 j9Var) {
        this.f14574k[0].i(j9Var);
    }

    @Override // com.google.android.gms.internal.ads.fp5, com.google.android.gms.internal.ads.wo5
    protected final void n(kb4 kb4Var) {
        super.n(kb4Var);
        int i7 = 0;
        while (true) {
            aq5[] aq5VarArr = this.f14574k;
            if (i7 >= aq5VarArr.length) {
                return;
            }
            z(Integer.valueOf(i7), aq5VarArr[i7]);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fp5, com.google.android.gms.internal.ads.wo5
    protected final void p() {
        super.p();
        Arrays.fill(this.f14576m, (Object) null);
        this.f14578o = -1;
        this.f14580q = null;
        ArrayList arrayList = this.f14577n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f14574k);
    }

    @Override // com.google.android.gms.internal.ads.fp5, com.google.android.gms.internal.ads.aq5
    public final void r() {
        oq5 oq5Var = this.f14580q;
        if (oq5Var != null) {
            throw oq5Var;
        }
        super.r();
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* bridge */ /* synthetic */ void y(Object obj, aq5 aq5Var, az azVar) {
        int i7;
        Integer num = (Integer) obj;
        if (this.f14580q != null) {
            return;
        }
        if (this.f14578o == -1) {
            i7 = azVar.c();
            this.f14578o = i7;
        } else {
            int c8 = azVar.c();
            int i8 = this.f14578o;
            if (c8 != i8) {
                this.f14580q = new oq5(0);
                return;
            }
            i7 = i8;
        }
        if (this.f14579p.length == 0) {
            this.f14579p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i7, this.f14576m.length);
        }
        ArrayList arrayList = this.f14577n;
        arrayList.remove(aq5Var);
        az[] azVarArr = this.f14576m;
        azVarArr[num.intValue()] = azVar;
        if (arrayList.isEmpty()) {
            q(azVarArr[0]);
        }
    }
}
