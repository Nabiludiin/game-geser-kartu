package l3;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l3.f;
import p3.c;
import p3.o;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0106a f24589a;

    /* renamed from: b, reason: collision with root package name */
    private final g f24590b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24591c;

    /* compiled from: MyApplication */
    /* renamed from: l3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0106a extends e {
        public f c(Context context, Looper looper, p3.d dVar, Object obj, f.b bVar, f.c cVar) {
            return d(context, looper, dVar, obj, bVar, cVar);
        }

        public f d(Context context, Looper looper, p3.d dVar, Object obj, m3.e eVar, m3.n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: MyApplication */
    public interface b {
    }

    /* compiled from: MyApplication */
    public static class c {
    }

    /* compiled from: MyApplication */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24592a = new b(null);

        /* compiled from: MyApplication */
        /* renamed from: l3.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0107a extends d {
            GoogleSignInAccount a();
        }

        /* compiled from: MyApplication */
        public static final class b implements d {
            /* synthetic */ b(m mVar) {
            }
        }
    }

    /* compiled from: MyApplication */
    public static abstract class e {
        public List a(Object obj) {
            return Collections.EMPTY_LIST;
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: MyApplication */
    public interface f extends b {
        boolean a();

        boolean b();

        Set c();

        void d(String str);

        void e(c.InterfaceC0119c interfaceC0119c);

        boolean f();

        String g();

        void h();

        void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void k(p3.j jVar, Set set);

        void l(c.e eVar);

        boolean m();

        int o();

        k3.d[] p();

        String r();

        Intent s();

        boolean t();
    }

    /* compiled from: MyApplication */
    public static final class g extends c {
    }

    public a(String str, AbstractC0106a abstractC0106a, g gVar) {
        o.n(abstractC0106a, "Cannot construct an Api with a null ClientBuilder");
        o.n(gVar, "Cannot construct an Api with a null ClientKey");
        this.f24591c = str;
        this.f24589a = abstractC0106a;
        this.f24590b = gVar;
    }

    public final AbstractC0106a a() {
        return this.f24589a;
    }

    public final c b() {
        return this.f24590b;
    }

    public final e c() {
        return this.f24589a;
    }

    public final String d() {
        return this.f24591c;
    }
}
