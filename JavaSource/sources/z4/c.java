package z4;

import java.io.Serializable;

/* compiled from: MyApplication */
final class c extends r implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final y4.c f27851q;

    /* renamed from: r, reason: collision with root package name */
    final r f27852r;

    c(y4.c cVar, r rVar) {
        this.f27851q = (y4.c) y4.h.h(cVar);
        this.f27852r = (r) y4.h.h(rVar);
    }

    @Override // z4.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27852r.compare(this.f27851q.apply(obj), this.f27851q.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f27851q.equals(cVar.f27851q) && this.f27852r.equals(cVar.f27852r)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return y4.f.b(this.f27851q, this.f27852r);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27852r);
        String valueOf2 = String.valueOf(this.f27851q);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
