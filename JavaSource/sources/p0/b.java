package p0;

import a5.d;
import androidx.concurrent.futures.c;
import e6.s;
import java.util.concurrent.CancellationException;
import p6.l;
import q6.i;
import q6.j;
import x6.n0;

/* compiled from: MyApplication */
public abstract class b {

    /* compiled from: MyApplication */
    static final class a extends j implements l {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ c.a f25070r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0 f25071s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, n0 n0Var) {
            super(1);
            this.f25070r = aVar;
            this.f25071s = n0Var;
        }

        public final void c(Throwable th) {
            if (th == null) {
                this.f25070r.c(this.f25071s.g());
            } else if (th instanceof CancellationException) {
                this.f25070r.d();
            } else {
                this.f25070r.f(th);
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            c((Throwable) obj);
            return s.f23253a;
        }
    }

    public static final d b(final n0 n0Var, final Object obj) {
        i.e(n0Var, "<this>");
        d a8 = c.a(new c.InterfaceC0016c() { // from class: p0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0016c
            public final Object a(c.a aVar) {
                Object d8;
                d8 = b.d(n0.this, obj, aVar);
                return d8;
            }
        });
        i.d(a8, "getFuture { completer ->…      }\n        tag\n    }");
        return a8;
    }

    public static /* synthetic */ d c(n0 n0Var, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(n0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(n0 n0Var, Object obj, c.a aVar) {
        i.e(n0Var, "$this_asListenableFuture");
        i.e(aVar, "completer");
        n0Var.m(new a(aVar, n0Var));
        return obj;
    }
}
