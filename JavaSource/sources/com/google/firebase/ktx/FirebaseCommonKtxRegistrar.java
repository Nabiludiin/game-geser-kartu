package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import f5.e;
import f5.e0;
import f5.h;
import f5.r;
import f6.l;
import java.util.List;
import java.util.concurrent.Executor;
import q6.i;
import x6.d0;
import x6.f1;

/* compiled from: MyApplication */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: MyApplication */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23041a = new a();

        @Override // f5.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d0 a(e eVar) {
            Object b8 = eVar.b(e0.a(e5.a.class, Executor.class));
            i.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return f1.a((Executor) b8);
        }
    }

    /* compiled from: MyApplication */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23042a = new b();

        @Override // f5.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d0 a(e eVar) {
            Object b8 = eVar.b(e0.a(e5.c.class, Executor.class));
            i.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return f1.a((Executor) b8);
        }
    }

    /* compiled from: MyApplication */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f23043a = new c();

        @Override // f5.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d0 a(e eVar) {
            Object b8 = eVar.b(e0.a(e5.b.class, Executor.class));
            i.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return f1.a((Executor) b8);
        }
    }

    /* compiled from: MyApplication */
    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23044a = new d();

        @Override // f5.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d0 a(e eVar) {
            Object b8 = eVar.b(e0.a(e5.d.class, Executor.class));
            i.d(b8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return f1.a((Executor) b8);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f5.c> getComponents() {
        f5.c c8 = f5.c.c(e0.a(e5.a.class, d0.class)).b(r.h(e0.a(e5.a.class, Executor.class))).e(a.f23041a).c();
        i.d(c8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f5.c c9 = f5.c.c(e0.a(e5.c.class, d0.class)).b(r.h(e0.a(e5.c.class, Executor.class))).e(b.f23042a).c();
        i.d(c9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f5.c c10 = f5.c.c(e0.a(e5.b.class, d0.class)).b(r.h(e0.a(e5.b.class, Executor.class))).e(c.f23043a).c();
        i.d(c10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f5.c c11 = f5.c.c(e0.a(e5.d.class, d0.class)).b(r.h(e0.a(e5.d.class, Executor.class))).e(d.f23044a).c();
        i.d(c11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return l.e(c8, c9, c10, c11);
    }
}
