package a5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import y4.h;

/* compiled from: MyApplication */
public abstract class b extends c {

    /* compiled from: MyApplication */
    private static final class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final Future f12q;

        /* renamed from: r, reason: collision with root package name */
        final a5.a f13r;

        a(Future future, a5.a aVar) {
            this.f12q = future;
            this.f13r = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f13r.a(b.b(this.f12q));
            } catch (Error e8) {
                e = e8;
                this.f13r.b(e);
            } catch (RuntimeException e9) {
                e = e9;
                this.f13r.b(e);
            } catch (ExecutionException e10) {
                this.f13r.b(e10.getCause());
            }
        }

        public String toString() {
            return y4.d.a(this).c(this.f13r).toString();
        }
    }

    public static void a(d dVar, a5.a aVar, Executor executor) {
        h.h(aVar);
        dVar.c(new a(dVar, aVar), executor);
    }

    public static Object b(Future future) {
        h.o(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
