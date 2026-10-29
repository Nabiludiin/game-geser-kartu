package x6;

import g6.i;
import java.util.concurrent.CancellationException;

/* compiled from: MyApplication */
public interface m1 extends i.b {

    /* renamed from: p, reason: collision with root package name */
    public static final b f27411p = b.f27412q;

    /* compiled from: MyApplication */
    public static final class a {
        public static Object a(m1 m1Var, Object obj, p6.p pVar) {
            return i.b.a.a(m1Var, obj, pVar);
        }

        public static i.b b(m1 m1Var, i.c cVar) {
            return i.b.a.b(m1Var, cVar);
        }

        public static /* synthetic */ u0 c(m1 m1Var, boolean z7, boolean z8, p6.l lVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i7 & 1) != 0) {
                z7 = false;
            }
            if ((i7 & 2) != 0) {
                z8 = true;
            }
            return m1Var.j(z7, z8, lVar);
        }

        public static g6.i d(m1 m1Var, i.c cVar) {
            return i.b.a.c(m1Var, cVar);
        }

        public static g6.i e(m1 m1Var, g6.i iVar) {
            return i.b.a.d(m1Var, iVar);
        }
    }

    /* compiled from: MyApplication */
    public static final class b implements i.c {

        /* renamed from: q, reason: collision with root package name */
        static final /* synthetic */ b f27412q = new b();

        private b() {
        }
    }

    p B(r rVar);

    void F(CancellationException cancellationException);

    boolean c();

    m1 getParent();

    u0 j(boolean z7, boolean z8, p6.l lVar);

    CancellationException k();

    u0 m(p6.l lVar);

    boolean start();
}
