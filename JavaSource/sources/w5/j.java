package w5;

import java.util.Set;

/* compiled from: MyApplication */
public final class j extends g {

    /* renamed from: q, reason: collision with root package name */
    private final y5.g f27177q = new y5.g();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j) && ((j) obj).f27177q.equals(this.f27177q);
        }
        return true;
    }

    public int hashCode() {
        return this.f27177q.hashCode();
    }

    public void l(String str, g gVar) {
        if (gVar == null) {
            gVar = i.f27176q;
        }
        this.f27177q.put(str, gVar);
    }

    public Set m() {
        return this.f27177q.entrySet();
    }
}
