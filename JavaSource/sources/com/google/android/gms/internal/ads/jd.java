package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
final class jd implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final w72 f10492a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f10493b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f10494c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10495d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ md f10496e;

    public jd(md mdVar, int i7) {
        Objects.requireNonNull(mdVar);
        this.f10496e = mdVar;
        this.f10492a = new w72(new byte[5], 5);
        this.f10493b = new SparseArray();
        this.f10494c = new SparseIntArray();
        this.f10495d = i7;
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void b(y82 y82Var) {
        md mdVar;
        int i7;
        w72 w72Var;
        int i8;
        int i9;
        if (y82Var.R() != 2) {
            return;
        }
        md mdVar2 = this.f10496e;
        ef2 ef2Var = (ef2) mdVar2.a().get(0);
        if ((y82Var.R() & 128) != 0) {
            y82Var.J(1);
            int S = y82Var.S();
            int i10 = 3;
            y82Var.J(3);
            w72 w72Var2 = this.f10492a;
            y82Var.K(w72Var2, 2);
            w72Var2.h(3);
            int i11 = 13;
            mdVar2.p(w72Var2.j(13));
            y82Var.K(w72Var2, 2);
            int i12 = 4;
            w72Var2.h(4);
            int i13 = 12;
            y82Var.J(w72Var2.j(12));
            SparseArray sparseArray = this.f10493b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f10494c;
            sparseIntArray.clear();
            int C = y82Var.C();
            while (C > 0) {
                int i14 = 5;
                y82Var.K(w72Var2, 5);
                int j7 = w72Var2.j(8);
                w72Var2.h(i10);
                int j8 = w72Var2.j(i11);
                w72Var2.h(i12);
                int j9 = w72Var2.j(i13);
                int F = y82Var.F();
                int i15 = F + j9;
                String str = null;
                ArrayList arrayList = null;
                int i16 = -1;
                int i17 = 0;
                while (y82Var.F() < i15) {
                    int R = y82Var.R();
                    int F2 = y82Var.F() + y82Var.R();
                    if (F2 > i15) {
                        break;
                    }
                    if (R == i14) {
                        long Y = y82Var.Y();
                        if (Y != 1094921523) {
                            if (Y != 1161904947) {
                                if (Y != 1094921524) {
                                    if (Y == 1212503619) {
                                        i9 = 36;
                                        mdVar = mdVar2;
                                        i16 = i9;
                                        i7 = F2;
                                        w72Var = w72Var2;
                                        i8 = C;
                                    }
                                    mdVar = mdVar2;
                                    i7 = F2;
                                    w72Var = w72Var2;
                                    i8 = C;
                                }
                                mdVar = mdVar2;
                                i7 = F2;
                                w72Var = w72Var2;
                                i8 = C;
                                i16 = 172;
                            }
                            mdVar = mdVar2;
                            w72Var = w72Var2;
                            i8 = C;
                            i16 = 135;
                            i7 = F2;
                            y82Var.J(i7 - y82Var.F());
                            C = i8;
                            w72Var2 = w72Var;
                            mdVar2 = mdVar;
                            i14 = 5;
                        }
                        mdVar = mdVar2;
                        i7 = F2;
                        w72Var = w72Var2;
                        i8 = C;
                        i16 = 129;
                    } else {
                        if (R != 106) {
                            if (R != 122) {
                                if (R == 127) {
                                    int R2 = y82Var.R();
                                    if (R2 != 21) {
                                        if (R2 == 14) {
                                            i9 = 136;
                                        } else {
                                            if (R2 == 33) {
                                                i9 = 139;
                                            }
                                            mdVar = mdVar2;
                                            i7 = F2;
                                            w72Var = w72Var2;
                                            i8 = C;
                                        }
                                    }
                                    mdVar = mdVar2;
                                    i7 = F2;
                                    w72Var = w72Var2;
                                    i8 = C;
                                    i16 = 172;
                                } else if (R == 123) {
                                    i9 = 138;
                                } else if (R == 10) {
                                    String trim = y82Var.k(3, StandardCharsets.UTF_8).trim();
                                    i17 = y82Var.R();
                                    mdVar = mdVar2;
                                    str = trim;
                                    i7 = F2;
                                    w72Var = w72Var2;
                                    i8 = C;
                                } else {
                                    if (R == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (y82Var.F() < F2) {
                                            int i18 = F2;
                                            String trim2 = y82Var.k(3, StandardCharsets.UTF_8).trim();
                                            int R3 = y82Var.R();
                                            int i19 = C;
                                            byte[] bArr = new byte[4];
                                            y82Var.L(bArr, 0, 4);
                                            arrayList2.add(new nd(trim2, R3, bArr));
                                            C = i19;
                                            F2 = i18;
                                            w72Var2 = w72Var2;
                                            mdVar2 = mdVar2;
                                        }
                                        mdVar = mdVar2;
                                        i7 = F2;
                                        w72Var = w72Var2;
                                        i8 = C;
                                        arrayList = arrayList2;
                                        i16 = 89;
                                    } else {
                                        mdVar = mdVar2;
                                        i7 = F2;
                                        w72Var = w72Var2;
                                        i8 = C;
                                        if (R == 111) {
                                            i16 = 257;
                                        }
                                    }
                                    y82Var.J(i7 - y82Var.F());
                                    C = i8;
                                    w72Var2 = w72Var;
                                    mdVar2 = mdVar;
                                    i14 = 5;
                                }
                                mdVar = mdVar2;
                                i16 = i9;
                                i7 = F2;
                                w72Var = w72Var2;
                                i8 = C;
                            }
                            mdVar = mdVar2;
                            w72Var = w72Var2;
                            i8 = C;
                            i16 = 135;
                            i7 = F2;
                            y82Var.J(i7 - y82Var.F());
                            C = i8;
                            w72Var2 = w72Var;
                            mdVar2 = mdVar;
                            i14 = 5;
                        }
                        mdVar = mdVar2;
                        i7 = F2;
                        w72Var = w72Var2;
                        i8 = C;
                        i16 = 129;
                    }
                    y82Var.J(i7 - y82Var.F());
                    C = i8;
                    w72Var2 = w72Var;
                    mdVar2 = mdVar;
                    i14 = 5;
                }
                md mdVar3 = mdVar2;
                w72 w72Var3 = w72Var2;
                int i20 = C;
                y82Var.G(i15);
                od odVar = new od(i16, str, i17, arrayList, Arrays.copyOfRange(y82Var.H(), F, i15));
                if (j7 == 6 || j7 == 5) {
                    j7 = odVar.f13290a;
                }
                C = i20 - (j9 + 5);
                if (!mdVar3.f().get(j8)) {
                    rd b8 = mdVar3.c().b(j7, odVar);
                    sparseIntArray.put(j8, j8);
                    sparseArray.put(j8, b8);
                }
                i12 = 4;
                w72Var2 = w72Var3;
                mdVar2 = mdVar3;
                i10 = 3;
                i11 = 13;
                i13 = 12;
            }
            md mdVar4 = mdVar2;
            int size = sparseIntArray.size();
            for (int i21 = 0; i21 < size; i21++) {
                int keyAt = sparseIntArray.keyAt(i21);
                int valueAt = sparseIntArray.valueAt(i21);
                mdVar4.f().put(keyAt, true);
                mdVar4.g().put(valueAt, true);
                rd rdVar = (rd) sparseArray.valueAt(i21);
                if (rdVar != null) {
                    rdVar.a(ef2Var, mdVar4.h(), new qd(S, keyAt, 8192));
                    mdVar4.d().put(valueAt, rdVar);
                }
            }
            mdVar4.d().remove(this.f10495d);
            mdVar4.n(0);
            if (mdVar4.m() == 0) {
                mdVar4.h().z();
                mdVar4.o(true);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void a(ef2 ef2Var, p2 p2Var, qd qdVar) {
    }
}
