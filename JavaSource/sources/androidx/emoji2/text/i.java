package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.p;
import androidx.core.os.q;
import androidx.core.provider.g;
import androidx.emoji2.text.d;
import androidx.emoji2.text.i;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: MyApplication */
public class i extends d.c {

    /* renamed from: j, reason: collision with root package name */
    private static final a f2060j = new a();

    /* compiled from: MyApplication */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    static class b implements d.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2061a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.provider.e f2062b;

        /* renamed from: c, reason: collision with root package name */
        private final a f2063c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f2064d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f2065e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f2066f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f2067g;

        /* renamed from: h, reason: collision with root package name */
        d.h f2068h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f2069i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f2070j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.e.g(context, "Context cannot be null");
            androidx.core.util.e.g(eVar, "FontRequest cannot be null");
            this.f2061a = context.getApplicationContext();
            this.f2062b = eVar;
            this.f2063c = aVar;
        }

        private void b() {
            synchronized (this.f2064d) {
                try {
                    this.f2068h = null;
                    ContentObserver contentObserver = this.f2069i;
                    if (contentObserver != null) {
                        this.f2063c.c(this.f2061a, contentObserver);
                        this.f2069i = null;
                    }
                    Handler handler = this.f2065e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2070j);
                    }
                    this.f2065e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2067g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2066f = null;
                    this.f2067g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g.b e() {
            try {
                g.a b8 = this.f2063c.b(this.f2061a, this.f2062b);
                if (b8.c() == 0) {
                    g.b[] b9 = b8.b();
                    if (b9 == null || b9.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b9[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b8.c() + ")");
            } catch (PackageManager.NameNotFoundException e8) {
                throw new RuntimeException("provider not found", e8);
            }
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            androidx.core.util.e.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2064d) {
                this.f2068h = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.f2064d) {
                try {
                    if (this.f2068h == null) {
                        return;
                    }
                    try {
                        g.b e8 = e();
                        int b8 = e8.b();
                        if (b8 == 2) {
                            synchronized (this.f2064d) {
                            }
                        }
                        if (b8 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b8 + ")");
                        }
                        try {
                            q.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a8 = this.f2063c.a(this.f2061a, e8);
                            ByteBuffer f8 = p.f(this.f2061a, null, e8.d());
                            if (f8 == null || a8 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            l b9 = l.b(a8, f8);
                            q.b();
                            synchronized (this.f2064d) {
                                try {
                                    d.h hVar = this.f2068h;
                                    if (hVar != null) {
                                        hVar.b(b9);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            q.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f2064d) {
                            try {
                                d.h hVar2 = this.f2068h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f2064d) {
                try {
                    if (this.f2068h == null) {
                        return;
                    }
                    if (this.f2066f == null) {
                        ThreadPoolExecutor b8 = androidx.emoji2.text.b.b("emojiCompat");
                        this.f2067g = b8;
                        this.f2066f = b8;
                    }
                    this.f2066f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2064d) {
                this.f2066f = executor;
            }
        }
    }

    public i(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f2060j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
