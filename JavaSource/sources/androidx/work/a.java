package androidx.work;

import android.os.Build;
import e1.g;
import e1.i;
import e1.q;
import e1.v;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f2967a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f2968b;

    /* renamed from: c, reason: collision with root package name */
    final v f2969c;

    /* renamed from: d, reason: collision with root package name */
    final i f2970d;

    /* renamed from: e, reason: collision with root package name */
    final q f2971e;

    /* renamed from: f, reason: collision with root package name */
    final String f2972f;

    /* renamed from: g, reason: collision with root package name */
    final int f2973g;

    /* renamed from: h, reason: collision with root package name */
    final int f2974h;

    /* renamed from: i, reason: collision with root package name */
    final int f2975i;

    /* renamed from: j, reason: collision with root package name */
    final int f2976j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f2977k;

    /* compiled from: MyApplication */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0053a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2978a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2979b;

        ThreadFactoryC0053a(boolean z7) {
            this.f2979b = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f2979b ? "WM.task-" : "androidx.work-") + this.f2978a.incrementAndGet());
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f2981a;

        /* renamed from: b, reason: collision with root package name */
        v f2982b;

        /* renamed from: c, reason: collision with root package name */
        i f2983c;

        /* renamed from: d, reason: collision with root package name */
        Executor f2984d;

        /* renamed from: e, reason: collision with root package name */
        q f2985e;

        /* renamed from: f, reason: collision with root package name */
        String f2986f;

        /* renamed from: g, reason: collision with root package name */
        int f2987g = 4;

        /* renamed from: h, reason: collision with root package name */
        int f2988h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f2989i = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name */
        int f2990j = 20;

        public a a() {
            return new a(this);
        }
    }

    a(b bVar) {
        Executor executor = bVar.f2981a;
        if (executor == null) {
            this.f2967a = a(false);
        } else {
            this.f2967a = executor;
        }
        Executor executor2 = bVar.f2984d;
        if (executor2 == null) {
            this.f2977k = true;
            this.f2968b = a(true);
        } else {
            this.f2977k = false;
            this.f2968b = executor2;
        }
        v vVar = bVar.f2982b;
        if (vVar == null) {
            this.f2969c = v.c();
        } else {
            this.f2969c = vVar;
        }
        i iVar = bVar.f2983c;
        if (iVar == null) {
            this.f2970d = i.c();
        } else {
            this.f2970d = iVar;
        }
        q qVar = bVar.f2985e;
        if (qVar == null) {
            this.f2971e = new f1.a();
        } else {
            this.f2971e = qVar;
        }
        this.f2973g = bVar.f2987g;
        this.f2974h = bVar.f2988h;
        this.f2975i = bVar.f2989i;
        this.f2976j = bVar.f2990j;
        this.f2972f = bVar.f2986f;
    }

    private Executor a(boolean z7) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z7));
    }

    private ThreadFactory b(boolean z7) {
        return new ThreadFactoryC0053a(z7);
    }

    public String c() {
        return this.f2972f;
    }

    public g d() {
        return null;
    }

    public Executor e() {
        return this.f2967a;
    }

    public i f() {
        return this.f2970d;
    }

    public int g() {
        return this.f2975i;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f2976j / 2 : this.f2976j;
    }

    public int i() {
        return this.f2974h;
    }

    public int j() {
        return this.f2973g;
    }

    public q k() {
        return this.f2971e;
    }

    public Executor l() {
        return this.f2968b;
    }

    public v m() {
        return this.f2969c;
    }
}
