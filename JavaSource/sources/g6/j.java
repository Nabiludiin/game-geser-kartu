package g6;

import g6.i;
import java.io.Serializable;
import p6.p;

/* compiled from: MyApplication */
public final class j implements i, Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final j f24049q = new j();

    private j() {
    }

    @Override // g6.i
    public i H(i.c cVar) {
        q6.i.e(cVar, "key");
        return this;
    }

    @Override // g6.i
    public i.b e(i.c cVar) {
        q6.i.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // g6.i
    public i n(i iVar) {
        q6.i.e(iVar, "context");
        return iVar;
    }

    @Override // g6.i
    public Object s(Object obj, p pVar) {
        q6.i.e(pVar, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
