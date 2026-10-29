package androidx.loader.app;

import androidx.lifecycle.k;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r.i;

/* compiled from: MyApplication */
class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f2552a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2553b;

    /* compiled from: MyApplication */
    static class a extends w {

        /* renamed from: e, reason: collision with root package name */
        private static final x.a f2554e = new C0041a();

        /* renamed from: c, reason: collision with root package name */
        private i f2555c = new i();

        /* renamed from: d, reason: collision with root package name */
        private boolean f2556d = false;

        /* compiled from: MyApplication */
        /* renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        static class C0041a implements x.a {
            C0041a() {
            }

            @Override // androidx.lifecycle.x.a
            public w a(Class cls) {
                return new a();
            }
        }

        a() {
        }

        static a f(y yVar) {
            return (a) new x(yVar, f2554e).a(a.class);
        }

        @Override // androidx.lifecycle.w
        protected void d() {
            super.d();
            if (this.f2555c.n() <= 0) {
                this.f2555c.b();
            } else {
                android.support.v4.media.session.b.a(this.f2555c.o(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2555c.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f2555c.n() <= 0) {
                    return;
                }
                android.support.v4.media.session.b.a(this.f2555c.o(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f2555c.l(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void g() {
            if (this.f2555c.n() <= 0) {
                return;
            }
            android.support.v4.media.session.b.a(this.f2555c.o(0));
            throw null;
        }
    }

    b(k kVar, y yVar) {
        this.f2552a = kVar;
        this.f2553b = a.f(yVar);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2553b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f2553b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2552a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
