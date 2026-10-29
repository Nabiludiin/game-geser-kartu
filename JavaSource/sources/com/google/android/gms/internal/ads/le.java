package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public final class le {

    /* renamed from: a, reason: collision with root package name */
    private final ld[] f11576a;

    public le(long j7, ld... ldVarArr) {
        this.f11576a = ldVarArr;
    }

    private static final ld h(ld ldVar, Class cls, sx3 sx3Var) {
        if (!cls.isAssignableFrom(ldVar.getClass())) {
            return null;
        }
        ld ldVar2 = (ld) cls.cast(ldVar);
        if (sx3Var.d(ldVar2)) {
            return ldVar2;
        }
        return null;
    }

    public final int a() {
        return this.f11576a.length;
    }

    public final ld b(int i7) {
        return this.f11576a[i7];
    }

    public final ld c(Class cls, sx3 sx3Var) {
        for (ld ldVar : this.f11576a) {
            ld h8 = h(ldVar, cls, sx3Var);
            if (h8 != null) {
                return h8;
            }
        }
        return null;
    }

    public final w04 d(Class cls) {
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        for (ld ldVar : this.f11576a) {
            if (cls.isAssignableFrom(ldVar.getClass())) {
                t04Var.g((ld) cls.cast(ldVar));
            }
        }
        return t04Var.j();
    }

    public final w04 e(Class cls, sx3 sx3Var) {
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        for (ld ldVar : this.f11576a) {
            ld h8 = h(ldVar, cls, sx3Var);
            if (h8 != null) {
                t04Var.g(h8);
            }
        }
        return t04Var.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && le.class == obj.getClass() && Arrays.equals(this.f11576a, ((le) obj).f11576a);
    }

    public final le f(le leVar) {
        return leVar == null ? this : g(leVar.f11576a);
    }

    public final le g(ld... ldVarArr) {
        int length = ldVarArr.length;
        if (length == 0) {
            return this;
        }
        ld[] ldVarArr2 = this.f11576a;
        String str = hi2.f9535a;
        int length2 = ldVarArr2.length;
        Object[] copyOf = Arrays.copyOf(ldVarArr2, length2 + length);
        System.arraycopy(ldVarArr, 0, copyOf, length2, length);
        return new le(-9223372036854775807L, (ld[]) copyOf);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11576a) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(-9223372036854775807L);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f11576a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 8);
        sb.append("entries=");
        sb.append(arrays);
        sb.append("");
        return sb.toString();
    }

    public le(List list) {
        this.f11576a = (ld[]) list.toArray(new ld[0]);
    }
}
