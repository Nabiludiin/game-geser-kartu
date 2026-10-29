package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.q;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: MyApplication */
public class EmojiCompatInitializer implements z0.a {

    /* compiled from: MyApplication */
    static class a extends d.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* compiled from: MyApplication */
    static class b implements d.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1995a;

        /* compiled from: MyApplication */
        class a extends d.h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.h f1996a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f1997b;

            a(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f1996a = hVar;
                this.f1997b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                try {
                    this.f1996a.a(th);
                } finally {
                    this.f1997b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                try {
                    this.f1996a.b(lVar);
                } finally {
                    this.f1997b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f1995a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public void a(final d.h hVar) {
            final ThreadPoolExecutor b8 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b8.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.c(hVar, b8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a8 = androidx.emoji2.text.c.a(this.f1995a);
                if (a8 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a8.c(threadPoolExecutor);
                a8.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* compiled from: MyApplication */
    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                q.b();
            }
        }
    }

    @Override // z0.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // z0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        d.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.g t7 = ((androidx.lifecycle.k) androidx.startup.a.c(context).d(ProcessLifecycleInitializer.class)).t();
        t7.a(new androidx.lifecycle.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public void a(androidx.lifecycle.k kVar) {
                EmojiCompatInitializer.this.e();
                t7.c(this);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void b(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.a(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void d(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.c(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void e(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.e(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void f(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.b(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void g(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.d(this, kVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.c().postDelayed(new c(), 500L);
    }
}
