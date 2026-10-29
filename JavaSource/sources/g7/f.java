package g7;

import c7.c0;
import c7.f0;
import g6.i;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: MyApplication */
final class f extends c0 {

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f24080u;

    public f(long j7, f fVar, int i7) {
        super(j7, fVar, i7);
        int i8;
        i8 = e.f24079f;
        this.f24080u = new AtomicReferenceArray(i8);
    }

    @Override // c7.c0
    public int q() {
        int i7;
        i7 = e.f24079f;
        return i7;
    }

    @Override // c7.c0
    public void r(int i7, Throwable th, i iVar) {
        f0 f0Var;
        f0Var = e.f24078e;
        u().set(i7, f0Var);
        s();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f3772s + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray u() {
        return this.f24080u;
    }
}
