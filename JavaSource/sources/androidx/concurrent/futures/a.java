package androidx.concurrent.futures;

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
    static final boolean f1076t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: u, reason: collision with root package name */
    private static final Logger f1077u = Logger.getLogger(a.class.getName());

    /* renamed from: v, reason: collision with root package name */
    static final b f1078v;

    /* renamed from: w, reason: collision with root package name */
    private static final Object f1079w;

    /* renamed from: q, reason: collision with root package name */
    volatile Object f1080q;

    /* renamed from: r, reason: collision with root package name */
    volatile e f1081r;

    /* renamed from: s, reason: collision with root package name */
    volatile h f1082s;

    /* compiled from: MyApplication */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* compiled from: MyApplication */
    private static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f1083c;

        /* renamed from: d, reason: collision with root package name */
        static final c f1084d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f1085a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f1086b;

        static {
            if (a.f1076t) {
                f1084d = null;
                f1083c = null;
            } else {
                f1084d = new c(false, null);
                f1083c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f1085a = z7;
            this.f1086b = th;
        }
    }

    /* compiled from: MyApplication */
    private static final class d {

        /* renamed from: b, reason: collision with root package name */
        static final d f1087b = new d(new C0015a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        final Throwable f1088a;

        /* compiled from: MyApplication */
        /* renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0015a extends Throwable {
            C0015a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1088a = (Throwable) a.m(th);
        }
    }

    /* compiled from: MyApplication */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f1089d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f1090a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f1091b;

        /* renamed from: c, reason: collision with root package name */
        e f1092c;

        e(Runnable runnable, Executor executor) {
            this.f1090a = runnable;
            this.f1091b = executor;
        }
    }

    /* compiled from: MyApplication */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1093a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1094b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1095c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1096d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f1097e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f1093a = atomicReferenceFieldUpdater;
            this.f1094b = atomicReferenceFieldUpdater2;
            this.f1095c = atomicReferenceFieldUpdater3;
            this.f1096d = atomicReferenceFieldUpdater4;
            this.f1097e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1096d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1097e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f1095c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f1094b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f1093a.lazySet(hVar, thread);
        }
    }

    /* compiled from: MyApplication */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1081r != eVar) {
                        return false;
                    }
                    aVar.f1081r = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1080q != obj) {
                        return false;
                    }
                    aVar.f1080q = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f1082s != hVar) {
                        return false;
                    }
                    aVar.f1082s = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f1100b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f1099a = thread;
        }
    }

    /* compiled from: MyApplication */
    private static final class h {

        /* renamed from: c, reason: collision with root package name */
        static final h f1098c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f1099a;

        /* renamed from: b, reason: collision with root package name */
        volatile h f1100b;

        h(boolean z7) {
        }

        void a(h hVar) {
            a.f1078v.d(this, hVar);
        }

        void b() {
            Thread thread = this.f1099a;
            if (thread != null) {
                this.f1099a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f1078v.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "s"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "r"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f1078v = gVar;
        if (th != null) {
            f1077u.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1079w = new Object();
    }

    protected a() {
    }

    private void d(StringBuilder sb) {
        try {
            Object r7 = r(this);
            sb.append("SUCCESS, result=[");
            sb.append(y(r7));
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

    private static CancellationException l(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object m(Object obj) {
        obj.getClass();
        return obj;
    }

    private e n(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1081r;
        } while (!f1078v.a(this, eVar2, e.f1089d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1092c;
            eVar4.f1092c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void o(a aVar) {
        aVar.u();
        aVar.k();
        e n7 = aVar.n(null);
        while (n7 != null) {
            e eVar = n7.f1092c;
            p(n7.f1090a, n7.f1091b);
            n7 = eVar;
        }
    }

    private static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f1077u.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    private Object q(Object obj) {
        if (obj instanceof c) {
            throw l("Task was cancelled.", ((c) obj).f1086b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1088a);
        }
        if (obj == f1079w) {
            return null;
        }
        return obj;
    }

    static Object r(Future future) {
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

    private void u() {
        h hVar;
        do {
            hVar = this.f1082s;
        } while (!f1078v.c(this, hVar, h.f1098c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f1100b;
        }
    }

    private void v(h hVar) {
        hVar.f1099a = null;
        while (true) {
            h hVar2 = this.f1082s;
            if (hVar2 == h.f1098c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f1100b;
                if (hVar2.f1099a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f1100b = hVar4;
                    if (hVar3.f1099a == null) {
                        break;
                    }
                } else if (!f1078v.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String y(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // a5.d
    public final void c(Runnable runnable, Executor executor) {
        m(runnable);
        m(executor);
        e eVar = this.f1081r;
        if (eVar != e.f1089d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1092c = eVar;
                if (f1078v.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1081r;
                }
            } while (eVar != e.f1089d);
        }
        p(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f1080q;
        if (obj == null) {
            if (f1078v.b(this, obj, f1076t ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f1083c : c.f1084d)) {
                if (z7) {
                    s();
                }
                o(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1080q;
        if (obj != null) {
            return q(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f1082s;
            if (hVar != h.f1098c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1078v.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                v(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1080q;
                            if (obj2 != null) {
                                return q(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(hVar2);
                    } else {
                        hVar = this.f1082s;
                    }
                } while (hVar != h.f1098c);
            }
            return q(this.f1080q);
        }
        while (nanos > 0) {
            Object obj3 = this.f1080q;
            if (obj3 != null) {
                return q(obj3);
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
        return this.f1080q instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1080q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                str = t();
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected boolean w(Object obj) {
        if (obj == null) {
            obj = f1079w;
        }
        if (!f1078v.b(this, null, obj)) {
            return false;
        }
        o(this);
        return true;
    }

    protected boolean x(Throwable th) {
        if (!f1078v.b(this, null, new d((Throwable) m(th)))) {
            return false;
        }
        o(this);
        return true;
    }

    protected final boolean z() {
        Object obj = this.f1080q;
        return (obj instanceof c) && ((c) obj).f1085a;
    }

    protected void k() {
    }

    protected void s() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1080q;
            if (obj2 != null) {
                return q(obj2);
            }
            h hVar = this.f1082s;
            if (hVar != h.f1098c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f1078v.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1080q;
                            } else {
                                v(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return q(obj);
                    }
                    hVar = this.f1082s;
                } while (hVar != h.f1098c);
            }
            return q(this.f1080q);
        }
        throw new InterruptedException();
    }
}
