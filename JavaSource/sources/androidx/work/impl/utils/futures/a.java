package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class a implements a5.d {

    /* renamed from: t, reason: collision with root package name */
    static final boolean f3097t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: u, reason: collision with root package name */
    private static final Logger f3098u = Logger.getLogger(a.class.getName());

    /* renamed from: v, reason: collision with root package name */
    static final b f3099v;

    /* renamed from: w, reason: collision with root package name */
    private static final Object f3100w;

    /* renamed from: q, reason: collision with root package name */
    volatile Object f3101q;

    /* renamed from: r, reason: collision with root package name */
    volatile e f3102r;

    /* renamed from: s, reason: collision with root package name */
    volatile i f3103s;

    /* compiled from: MyApplication */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* compiled from: MyApplication */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f3104c;

        /* renamed from: d, reason: collision with root package name */
        static final c f3105d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f3106a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f3107b;

        static {
            if (a.f3097t) {
                f3105d = null;
                f3104c = null;
            } else {
                f3105d = new c(false, null);
                f3104c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f3106a = z7;
            this.f3107b = th;
        }
    }

    /* compiled from: MyApplication */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f3108b = new d(new C0057a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f3109a;

        /* compiled from: MyApplication */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0057a extends Throwable {
            C0057a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f3109a = (Throwable) a.e(th);
        }
    }

    /* compiled from: MyApplication */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f3110d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f3111a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f3112b;

        /* renamed from: c, reason: collision with root package name */
        e f3113c;

        e(Runnable runnable, Executor executor) {
            this.f3111a = runnable;
            this.f3112b = executor;
        }
    }

    /* compiled from: MyApplication */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3114a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3115b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3116c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3117d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3118e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f3114a = atomicReferenceFieldUpdater;
            this.f3115b = atomicReferenceFieldUpdater2;
            this.f3116c = atomicReferenceFieldUpdater3;
            this.f3117d = atomicReferenceFieldUpdater4;
            this.f3118e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f3117d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f3118e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f3116c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f3115b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f3114a.lazySet(iVar, thread);
        }
    }

    /* compiled from: MyApplication */
    private static final class g implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final a f3119q;

        /* renamed from: r, reason: collision with root package name */
        final a5.d f3120r;

        g(a aVar, a5.d dVar) {
            this.f3119q = aVar;
            this.f3120r = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3119q.f3101q != this) {
                return;
            }
            if (a.f3099v.b(this.f3119q, this, a.k(this.f3120r))) {
                a.g(this.f3119q);
            }
        }
    }

    /* compiled from: MyApplication */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3102r != eVar) {
                        return false;
                    }
                    aVar.f3102r = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3101q != obj) {
                        return false;
                    }
                    aVar.f3101q = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3103s != iVar) {
                        return false;
                    }
                    aVar.f3103s = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f3123b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f3122a = thread;
        }
    }

    /* compiled from: MyApplication */
    private static final class i {

        /* renamed from: c, reason: collision with root package name */
        static final i f3121c = new i(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f3122a;

        /* renamed from: b, reason: collision with root package name */
        volatile i f3123b;

        i(boolean z7) {
        }

        void a(i iVar) {
            a.f3099v.d(this, iVar);
        }

        void b() {
            Thread thread = this.f3122a;
            if (thread != null) {
                this.f3122a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f3099v.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "s"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "r"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f3099v = hVar;
        if (th != null) {
            f3098u.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3100w = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object l7 = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(l7));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3102r;
        } while (!f3099v.a(this, eVar2, e.f3110d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3113c;
            eVar4.f3113c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a aVar) {
        e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            e f8 = aVar.f(eVar);
            while (f8 != null) {
                eVar = f8.f3113c;
                Runnable runnable = f8.f3111a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f3119q;
                    if (aVar.f3101q == gVar) {
                        if (f3099v.b(aVar, gVar, k(gVar.f3120r))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f8.f3112b);
                }
                f8 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f3098u.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f3107b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3109a);
        }
        if (obj == f3100w) {
            return null;
        }
        return obj;
    }

    static Object k(a5.d dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f3101q;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f3106a ? cVar.f3107b != null ? new c(false, cVar.f3107b) : c.f3105d : obj;
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f3097t) && isCancelled) {
            return c.f3105d;
        }
        try {
            Object l7 = l(dVar);
            return l7 == null ? f3100w : l7;
        } catch (CancellationException e8) {
            if (isCancelled) {
                return new c(false, e8);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e8));
        } catch (ExecutionException e9) {
            return new d(e9.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object l(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void o() {
        i iVar;
        do {
            iVar = this.f3103s;
        } while (!f3099v.c(this, iVar, i.f3121c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f3123b;
        }
    }

    private void p(i iVar) {
        iVar.f3122a = null;
        while (true) {
            i iVar2 = this.f3103s;
            if (iVar2 == i.f3121c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f3123b;
                if (iVar2.f3122a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f3123b = iVar4;
                    if (iVar3.f3122a == null) {
                        break;
                    }
                } else if (!f3099v.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f3102r;
        if (eVar != e.f3110d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3113c = eVar;
                if (f3099v.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f3102r;
                }
            } while (eVar != e.f3110d);
        }
        h(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3101q
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = androidx.work.impl.utils.futures.a.f3097t
            if (r3 == 0) goto L1f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f3104c
            goto L26
        L24:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.a.c.f3105d
        L26:
            r4 = r7
            r5 = r2
        L28:
            androidx.work.impl.utils.futures.a$b r6 = androidx.work.impl.utils.futures.a.f3099v
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.m()
        L35:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r4 == 0) goto L58
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.a.g) r0
            a5.d r0 = r0.f3120r
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.a
            if (r4 == 0) goto L55
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.a) r4
            java.lang.Object r0 = r4.f3101q
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = r1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.f3101q
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.a.g
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.a.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3101q;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f3103s;
            if (iVar != i.f3121c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f3099v.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3101q;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                    } else {
                        iVar = this.f3103s;
                    }
                } while (iVar != i.f3121c);
            }
            return i(this.f3101q);
        }
        while (nanos > 0) {
            Object obj3 = this.f3101q;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long convert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(convert);
            boolean z7 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3101q instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f3101q != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        Object obj = this.f3101q;
        if (obj instanceof g) {
            return "setFuture=[" + t(((g) obj).f3120r) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(Object obj) {
        if (obj == null) {
            obj = f3100w;
        }
        if (!f3099v.b(this, null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(Throwable th) {
        if (!f3099v.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean s(a5.d dVar) {
        d dVar2;
        e(dVar);
        Object obj = this.f3101q;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f3099v.b(this, null, k(dVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, dVar);
            if (f3099v.b(this, null, gVar)) {
                try {
                    dVar.c(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar2 = new d(th);
                    } catch (Throwable unused) {
                        dVar2 = d.f3108b;
                    }
                    f3099v.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f3101q;
        }
        if (obj instanceof c) {
            dVar.cancel(((c) obj).f3106a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = n();
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected void b() {
    }

    protected void m() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3101q;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f3103s;
            if (iVar != i.f3121c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f3099v.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3101q;
                            } else {
                                p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f3103s;
                } while (iVar != i.f3121c);
            }
            return i(this.f3101q);
        }
        throw new InterruptedException();
    }
}
