package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class wb implements pd {

    /* renamed from: a, reason: collision with root package name */
    private final List f18168a;

    public wb(int i7, List list) {
        this.f18168a = list;
    }

    private final ed c(od odVar) {
        return new ed(e(odVar), "video/mp2t");
    }

    private final ud d(od odVar) {
        return new ud(e(odVar), "video/mp2t");
    }

    private final List e(od odVar) {
        String str;
        int i7;
        List list;
        y82 y82Var = new y82(odVar.f13294e);
        List list2 = this.f18168a;
        while (y82Var.C() > 0) {
            int R = y82Var.R();
            int F = y82Var.F() + y82Var.R();
            if (R == 134) {
                list2 = new ArrayList();
                int R2 = y82Var.R() & 31;
                for (int i8 = 0; i8 < R2; i8++) {
                    String k7 = y82Var.k(3, StandardCharsets.UTF_8);
                    int R3 = y82Var.R();
                    boolean z7 = (R3 & 128) != 0;
                    if (z7) {
                        i7 = R3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte R4 = (byte) y82Var.R();
                    y82Var.J(1);
                    if (z7) {
                        int i9 = R4 & 64;
                        int i10 = qe1.f14407d;
                        list = Collections.singletonList(i9 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    xn5 xn5Var = new xn5();
                    xn5Var.l0(str);
                    xn5Var.d0(k7);
                    xn5Var.j(i7);
                    xn5Var.o0(list);
                    list2.add(xn5Var.m());
                }
            }
            y82Var.G(F);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.pd
    public final SparseArray a() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.pd
    public final rd b(int i7, od odVar) {
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                return new vc(new mc(odVar.f13291b, odVar.a(), "video/mp2t"));
            }
            if (i7 == 21) {
                return new vc(new kc("video/mp2t"));
            }
            if (i7 == 27) {
                return new vc(new gc(c(odVar), false, false, "video/mp2t"));
            }
            if (i7 == 36) {
                return new vc(new ic(c(odVar), "video/mp2t"));
            }
            if (i7 == 45) {
                return new vc(new nc("video/mp2t"));
            }
            if (i7 == 89) {
                return new vc(new yb(odVar.f13293d, "video/mp2t"));
            }
            if (i7 == 172) {
                return new vc(new tb(odVar.f13291b, odVar.a(), "video/mp2t"));
            }
            if (i7 == 257) {
                return new cd(new uc("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i7 != 128) {
                if (i7 != 129) {
                    if (i7 != 138) {
                        if (i7 == 139) {
                            return new vc(new xb(odVar.f13291b, odVar.a(), 5408, "video/mp2t"));
                        }
                        switch (i7) {
                            case 15:
                                return new vc(new vb(false, odVar.f13291b, odVar.a(), "video/mp2t"));
                            case 16:
                                return new vc(new ec(d(odVar), "video/mp2t"));
                            case 17:
                                return new vc(new lc(odVar.f13291b, odVar.a(), "video/mp2t"));
                            default:
                                switch (i7) {
                                    case 134:
                                        return new cd(new uc("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new vc(new xb(odVar.f13291b, odVar.a(), 4096, "video/mp2t"));
                }
                return new vc(new rb(odVar.f13291b, odVar.a(), "video/mp2t"));
            }
        }
        return new vc(new bc(d(odVar), "video/mp2t"));
    }
}
