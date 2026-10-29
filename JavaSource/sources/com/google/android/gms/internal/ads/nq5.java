package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: MyApplication */
final class nq5 implements vp5, up5 {

    /* renamed from: q, reason: collision with root package name */
    private final vp5[] f12851q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean[] f12852r;

    /* renamed from: v, reason: collision with root package name */
    private up5 f12856v;

    /* renamed from: w, reason: collision with root package name */
    private as5 f12857w;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f12854t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final HashMap f12855u = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private sr5 f12859y = new hp5(w04.m(), w04.m());

    /* renamed from: s, reason: collision with root package name */
    private final IdentityHashMap f12853s = new IdentityHashMap();

    /* renamed from: x, reason: collision with root package name */
    private vp5[] f12858x = new vp5[0];

    public nq5(ip5 ip5Var, long[] jArr, vp5... vp5VarArr) {
        this.f12851q = vp5VarArr;
        this.f12852r = new boolean[vp5VarArr.length];
        for (int i7 = 0; i7 < vp5VarArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.f12852r[i7] = true;
                this.f12851q[i7] = new xr5(vp5VarArr[i7], j7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        ArrayList arrayList = this.f12854t;
        if (arrayList.isEmpty()) {
            return this.f12859y.a(mb5Var);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((vp5) arrayList.get(i7)).a(mb5Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
        this.f12859y.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.rr5
    public final /* bridge */ /* synthetic */ void c(sr5 sr5Var) {
        up5 up5Var = this.f12856v;
        up5Var.getClass();
        up5Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void d() {
        int i7 = 0;
        while (true) {
            vp5[] vp5VarArr = this.f12851q;
            if (i7 >= vp5VarArr.length) {
                return;
            }
            vp5VarArr[i7].d();
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.up5
    public final void e(vp5 vp5Var) {
        ArrayList arrayList = this.f12854t;
        arrayList.remove(vp5Var);
        if (arrayList.isEmpty()) {
            vp5[] vp5VarArr = this.f12851q;
            int i7 = 0;
            for (vp5 vp5Var2 : vp5VarArr) {
                i7 += vp5Var2.h().f5278a;
            }
            b00[] b00VarArr = new b00[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < vp5VarArr.length; i9++) {
                as5 h8 = vp5VarArr[i9].h();
                int i10 = h8.f5278a;
                int i11 = 0;
                while (i11 < i10) {
                    b00 a8 = h8.a(i11);
                    int i12 = a8.f5434a;
                    eq5[] eq5VarArr = new eq5[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        eq5 a9 = a8.a(i13);
                        xn5 a10 = a9.a();
                        String str = a9.f7761a;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 1 + str.length());
                        sb.append(i9);
                        sb.append(":");
                        sb.append(str);
                        a10.A(sb.toString());
                        eq5VarArr[i13] = a10.m();
                        i13++;
                        vp5VarArr = vp5VarArr;
                    }
                    vp5[] vp5VarArr2 = vp5VarArr;
                    String str2 = a8.f5435b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(str2).length());
                    sb2.append(i9);
                    sb2.append(":");
                    sb2.append(str2);
                    b00 b00Var = new b00(sb2.toString(), eq5VarArr);
                    this.f12855u.put(b00Var, a8);
                    b00VarArr[i8] = b00Var;
                    i11++;
                    i8++;
                    vp5VarArr = vp5VarArr2;
                }
            }
            this.f12857w = new as5(b00VarArr);
            up5 up5Var = this.f12856v;
            up5Var.getClass();
            up5Var.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void f(long j7, boolean z7) {
        for (vp5 vp5Var : this.f12858x) {
            vp5Var.f(j7, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long g() {
        long j7 = -9223372036854775807L;
        for (vp5 vp5Var : this.f12858x) {
            long g8 = vp5Var.g();
            if (g8 != -9223372036854775807L) {
                if (j7 == -9223372036854775807L) {
                    for (vp5 vp5Var2 : this.f12858x) {
                        if (vp5Var2 == vp5Var) {
                            break;
                        }
                        if (vp5Var2.n(g8) != g8) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = g8;
                } else if (g8 != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j7 != -9223372036854775807L && vp5Var.n(j7) != j7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final as5 h() {
        as5 as5Var = this.f12857w;
        as5Var.getClass();
        return as5Var;
    }

    public final vp5 i(int i7) {
        return this.f12852r[i7] ? ((xr5) this.f12851q[i7]).i() : this.f12851q[i7];
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long j() {
        return this.f12859y.j();
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long k() {
        return this.f12859y.k();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long n(long j7) {
        long n7 = this.f12858x[0].n(j7);
        int i7 = 1;
        while (true) {
            vp5[] vp5VarArr = this.f12858x;
            if (i7 >= vp5VarArr.length) {
                return n7;
            }
            if (vp5VarArr[i7].n(n7) != n7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        return this.f12859y.o();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long p(zt5[] zt5VarArr, boolean[] zArr, qr5[] qr5VarArr, boolean[] zArr2, long j7) {
        int length;
        int[] iArr;
        int length2 = zt5VarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = zt5VarArr.length;
            if (i8 >= length) {
                break;
            }
            qr5 qr5Var = qr5VarArr[i8];
            Integer num = qr5Var == null ? null : (Integer) this.f12853s.get(qr5Var);
            iArr2[i8] = num == null ? -1 : num.intValue();
            zt5 zt5Var = zt5VarArr[i8];
            if (zt5Var != null) {
                String str = zt5Var.a().f5435b;
                iArr3[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        IdentityHashMap identityHashMap = this.f12853s;
        identityHashMap.clear();
        vp5[] vp5VarArr = this.f12851q;
        qr5[] qr5VarArr2 = new qr5[length];
        qr5[] qr5VarArr3 = new qr5[length];
        zt5[] zt5VarArr2 = new zt5[length];
        ArrayList arrayList = new ArrayList(vp5VarArr.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < vp5VarArr.length) {
            int i10 = i7;
            while (i10 < zt5VarArr.length) {
                qr5VarArr3[i10] = iArr2[i10] == i9 ? qr5VarArr[i10] : null;
                if (iArr3[i10] == i9) {
                    zt5 zt5Var2 = zt5VarArr[i10];
                    zt5Var2.getClass();
                    iArr = iArr3;
                    b00 b00Var = (b00) this.f12855u.get(zt5Var2.a());
                    b00Var.getClass();
                    zt5VarArr2[i10] = new mq5(zt5Var2, b00Var);
                } else {
                    iArr = iArr3;
                    zt5VarArr2[i10] = null;
                }
                i10++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i11 = i9;
            long p7 = vp5VarArr[i9].p(zt5VarArr2, zArr, qr5VarArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = p7;
            } else if (p7 != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < zt5VarArr.length; i12++) {
                if (iArr4[i12] == i11) {
                    qr5 qr5Var2 = qr5VarArr3[i12];
                    qr5Var2.getClass();
                    qr5VarArr2[i12] = qr5Var2;
                    identityHashMap.put(qr5Var2, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr2[i12] == i11) {
                    rx3.h(qr5VarArr3[i12] == null);
                }
            }
            if (z7) {
                arrayList2.add(vp5VarArr[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i7 = 0;
        }
        int i13 = i7;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(qr5VarArr2, i13, qr5VarArr, i13, length);
        this.f12858x = (vp5[]) arrayList3.toArray(new vp5[i13]);
        this.f12859y = new hp5(arrayList3, x14.c(arrayList3, lq5.f11739a));
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long r(long j7, yc5 yc5Var) {
        vp5[] vp5VarArr = this.f12858x;
        return (vp5VarArr.length > 0 ? vp5VarArr[0] : this.f12851q[0]).r(j7, yc5Var);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void s(up5 up5Var, long j7) {
        this.f12856v = up5Var;
        ArrayList arrayList = this.f12854t;
        vp5[] vp5VarArr = this.f12851q;
        Collections.addAll(arrayList, vp5VarArr);
        for (vp5 vp5Var : vp5VarArr) {
            vp5Var.s(this, j7);
        }
    }
}
