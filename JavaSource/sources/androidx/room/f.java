package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
class f {

    /* renamed from: a, reason: collision with root package name */
    final Context f2744a;

    /* renamed from: b, reason: collision with root package name */
    final String f2745b;

    /* renamed from: c, reason: collision with root package name */
    int f2746c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.room.e f2747d;

    /* renamed from: e, reason: collision with root package name */
    final e.c f2748e;

    /* renamed from: f, reason: collision with root package name */
    androidx.room.c f2749f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f2750g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.room.b f2751h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f2752i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f2753j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f2754k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f2755l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f2756m;

    /* compiled from: MyApplication */
    class a extends b.a {

        /* compiled from: MyApplication */
        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        class RunnableC0048a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ String[] f2758q;

            RunnableC0048a(String[] strArr) {
                this.f2758q = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f2747d.e(this.f2758q);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void u2(String[] strArr) {
            f.this.f2750g.execute(new RunnableC0048a(strArr));
        }
    }

    /* compiled from: MyApplication */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f2749f = c.a.a(iBinder);
            f fVar = f.this;
            fVar.f2750g.execute(fVar.f2754k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f2750g.execute(fVar.f2755l);
            f.this.f2749f = null;
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2749f;
                if (cVar != null) {
                    fVar.f2746c = cVar.b3(fVar.f2751h, fVar.f2745b);
                    f fVar2 = f.this;
                    fVar2.f2747d.a(fVar2.f2748e);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
            }
        }
    }

    /* compiled from: MyApplication */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2747d.g(fVar.f2748e);
        }
    }

    /* compiled from: MyApplication */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2747d.g(fVar.f2748e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f2749f;
                if (cVar != null) {
                    cVar.S7(fVar2.f2751h, fVar2.f2746c);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e8);
            }
            f fVar3 = f.this;
            fVar3.f2744a.unbindService(fVar3.f2753j);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.room.f$f, reason: collision with other inner class name */
    class C0049f extends e.c {
        C0049f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set set) {
            if (f.this.f2752i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2749f;
                if (cVar != null) {
                    cVar.r7(fVar.f2746c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f2753j = bVar;
        this.f2754k = new c();
        this.f2755l = new d();
        this.f2756m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f2744a = applicationContext;
        this.f2745b = str;
        this.f2747d = eVar;
        this.f2750g = executor;
        this.f2748e = new C0049f((String[]) eVar.f2721a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
