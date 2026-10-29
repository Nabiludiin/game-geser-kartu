package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class c {

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f1101a;

        /* renamed from: b, reason: collision with root package name */
        d f1102b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f1103c = androidx.concurrent.futures.d.A();

        /* renamed from: d, reason: collision with root package name */
        private boolean f1104d;

        a() {
        }

        private void e() {
            this.f1101a = null;
            this.f1102b = null;
            this.f1103c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d dVar = this.f1103c;
            if (dVar != null) {
                dVar.c(runnable, executor);
            }
        }

        void b() {
            this.f1101a = null;
            this.f1102b = null;
            this.f1103c.w(null);
        }

        public boolean c(Object obj) {
            this.f1104d = true;
            d dVar = this.f1102b;
            boolean z7 = dVar != null && dVar.b(obj);
            if (z7) {
                e();
            }
            return z7;
        }

        public boolean d() {
            this.f1104d = true;
            d dVar = this.f1102b;
            boolean z7 = dVar != null && dVar.a(true);
            if (z7) {
                e();
            }
            return z7;
        }

        public boolean f(Throwable th) {
            this.f1104d = true;
            d dVar = this.f1102b;
            boolean z7 = dVar != null && dVar.d(th);
            if (z7) {
                e();
            }
            return z7;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f1102b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1101a));
            }
            if (this.f1104d || (dVar = this.f1103c) == null) {
                return;
            }
            dVar.w(null);
        }
    }

    /* compiled from: MyApplication */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0016c {
        Object a(a aVar);
    }

    /* compiled from: MyApplication */
    private static final class d implements a5.d {

        /* renamed from: q, reason: collision with root package name */
        final WeakReference f1105q;

        /* renamed from: r, reason: collision with root package name */
        private final androidx.concurrent.futures.a f1106r = new a();

        /* compiled from: MyApplication */
        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String t() {
                a aVar = (a) d.this.f1105q.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1101a + "]";
            }
        }

        d(a aVar) {
            this.f1105q = new WeakReference(aVar);
        }

        boolean a(boolean z7) {
            return this.f1106r.cancel(z7);
        }

        boolean b(Object obj) {
            return this.f1106r.w(obj);
        }

        @Override // a5.d
        public void c(Runnable runnable, Executor executor) {
            this.f1106r.c(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            a aVar = (a) this.f1105q.get();
            boolean cancel = this.f1106r.cancel(z7);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        boolean d(Throwable th) {
            return this.f1106r.x(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f1106r.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1106r.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1106r.isDone();
        }

        public String toString() {
            return this.f1106r.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j7, TimeUnit timeUnit) {
            return this.f1106r.get(j7, timeUnit);
        }
    }

    public static a5.d a(InterfaceC0016c interfaceC0016c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f1102b = dVar;
        aVar.f1101a = interfaceC0016c.getClass();
        try {
            Object a8 = interfaceC0016c.a(aVar);
            if (a8 == null) {
                return dVar;
            }
            aVar.f1101a = a8;
            return dVar;
        } catch (Exception e8) {
            dVar.d(e8);
            return dVar;
        }
    }
}
