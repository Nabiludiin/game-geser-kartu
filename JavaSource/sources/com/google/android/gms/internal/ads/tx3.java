package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: MyApplication */
final class tx3 implements Serializable, sx3 {

    /* renamed from: q, reason: collision with root package name */
    private final List f16483q;

    @Override // com.google.android.gms.internal.ads.sx3
    public final boolean d(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f16483q;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((sx3) list.get(i7)).d(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tx3) {
            return this.f16483q.equals(((tx3) obj).f16483q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16483q.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z7 = true;
        for (Object obj : this.f16483q) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
