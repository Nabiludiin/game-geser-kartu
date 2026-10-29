package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class qb {

    /* renamed from: a, reason: collision with root package name */
    private final pb f21254a;

    private qb(ed edVar, Object obj, ed edVar2, Object obj2) {
        this.f21254a = new pb(edVar, "", edVar2, "");
    }

    public static qb a(ed edVar, Object obj, ed edVar2, Object obj2) {
        return new qb(edVar, "", edVar2, "");
    }

    static void b(ha haVar, pb pbVar, Object obj, Object obj2) {
        qa.c(haVar, pbVar.f21233a, 1, obj);
        qa.c(haVar, pbVar.f21235c, 2, obj2);
    }

    static int c(pb pbVar, Object obj, Object obj2) {
        return qa.d(pbVar.f21233a, 1, obj) + qa.d(pbVar.f21235c, 2, obj2);
    }

    public final int d(int i7, Object obj, Object obj2) {
        pb pbVar = this.f21254a;
        int E = ha.E(i7 << 3);
        int c8 = c(pbVar, obj, obj2);
        return E + ha.E(c8) + c8;
    }

    final pb e() {
        return this.f21254a;
    }
}
