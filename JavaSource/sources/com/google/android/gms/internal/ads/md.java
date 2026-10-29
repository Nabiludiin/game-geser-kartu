package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class md implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f12208a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12209b;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f12210c = new y82(new byte[9400], 0);

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f12211d;

    /* renamed from: e, reason: collision with root package name */
    private final pd f12212e;

    /* renamed from: f, reason: collision with root package name */
    private final q9 f12213f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray f12214g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f12215h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f12216i;

    /* renamed from: j, reason: collision with root package name */
    private final hd f12217j;

    /* renamed from: k, reason: collision with root package name */
    private gd f12218k;

    /* renamed from: l, reason: collision with root package name */
    private p2 f12219l;

    /* renamed from: m, reason: collision with root package name */
    private int f12220m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12221n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12222o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12223p;

    /* renamed from: q, reason: collision with root package name */
    private int f12224q;

    /* renamed from: r, reason: collision with root package name */
    private int f12225r;

    public md(int i7, int i8, q9 q9Var, ef2 ef2Var, pd pdVar, int i9) {
        this.f12212e = pdVar;
        this.f12208a = i8;
        this.f12213f = q9Var;
        this.f12209b = Collections.singletonList(ef2Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f12215h = sparseBooleanArray;
        this.f12216i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f12214g = sparseArray;
        this.f12211d = new SparseIntArray();
        this.f12217j = new hd(112800);
        this.f12219l = p2.f13635e;
        this.f12225r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray a8 = pdVar.a();
        int size = a8.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12214g.put(a8.keyAt(i10), (rd) a8.valueAt(i10));
        }
        this.f12214g.put(0, new cd(new id(this)));
    }

    final /* synthetic */ List a() {
        return this.f12209b;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    final /* synthetic */ pd c() {
        return this.f12212e;
    }

    final /* synthetic */ SparseArray d() {
        return this.f12214g;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    final /* synthetic */ SparseBooleanArray f() {
        return this.f12215h;
    }

    final /* synthetic */ SparseBooleanArray g() {
        return this.f12216i;
    }

    final /* synthetic */ p2 h() {
        return this.f12219l;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        gd gdVar;
        List list = this.f12209b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ef2 ef2Var = (ef2) list.get(i7);
            if (ef2Var.c() != -9223372036854775807L) {
                long a8 = ef2Var.a();
                if (a8 != -9223372036854775807L) {
                    if (a8 != 0) {
                        if (a8 == j8) {
                        }
                    }
                }
            }
            ef2Var.d(j8);
        }
        if (j8 != 0 && (gdVar = this.f12218k) != null) {
            gdVar.b(j8);
        }
        this.f12210c.z(0);
        this.f12211d.clear();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f12214g;
            if (i8 >= sparseArray.size()) {
                this.f12224q = 0;
                return;
            } else {
                ((rd) sparseArray.valueAt(i8)).b();
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(com.google.android.gms.internal.ads.n2 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.y82 r0 = r6.f12210c
            byte[] r0 = r0.H()
            com.google.android.gms.internal.ads.b2 r7 = (com.google.android.gms.internal.ads.b2) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.x(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.t(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md.j(com.google.android.gms.internal.ads.n2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        if (this.f12208a == 0) {
            p2Var = new t9(p2Var, this.f12213f);
        }
        this.f12219l = p2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        if (r3 == false) goto L96;
     */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r20, com.google.android.gms.internal.ads.n3 r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }

    final /* synthetic */ int m() {
        return this.f12220m;
    }

    final /* synthetic */ void n(int i7) {
        this.f12220m = i7;
    }

    final /* synthetic */ void o(boolean z7) {
        this.f12221n = true;
    }

    final /* synthetic */ void p(int i7) {
        this.f12225r = i7;
    }
}
