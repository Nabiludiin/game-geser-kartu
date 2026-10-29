package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class u9 extends o {

    /* renamed from: r, reason: collision with root package name */
    private final c f21398r;

    public u9(c cVar) {
        this.f21398r = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.o, com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    p5.a("getEventName", 0, list);
                    return new v(this.f21398r.c().b());
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    p5.a("getTimestamp", 0, list);
                    return new j(Double.valueOf(this.f21398r.c().a()));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    p5.a("getParamValue", 1, list);
                    return q6.a(this.f21398r.c().e(o4Var.a((r) list.get(0)).d()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    p5.a("getParams", 0, list);
                    Map f8 = this.f21398r.c().f();
                    o oVar = new o();
                    for (String str2 : f8.keySet()) {
                        oVar.W0(str2, q6.a(f8.get(str2)));
                    }
                    return oVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    p5.a("setParamValue", 2, list);
                    String d8 = o4Var.a((r) list.get(0)).d();
                    r a8 = o4Var.a((r) list.get(1));
                    this.f21398r.c().d(d8, p5.j(a8));
                    return a8;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    p5.a("setEventName", 1, list);
                    r a9 = o4Var.a((r) list.get(0));
                    if (r.f21314f.equals(a9) || r.f21315g.equals(a9)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.f21398r.c().c(a9.d());
                    return new v(a9.d());
                }
                break;
        }
        return super.g(str, o4Var, list);
    }
}
