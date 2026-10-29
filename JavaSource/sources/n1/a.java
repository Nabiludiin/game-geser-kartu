package n1;

import androidx.work.impl.WorkDatabase;
import e1.m;
import e1.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: MyApplication */
public abstract class a implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final f1.c f24928q = new f1.c();

    /* compiled from: MyApplication */
    /* renamed from: n1.a$a, reason: collision with other inner class name */
    class C0115a extends a {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ f1.j f24929r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ UUID f24930s;

        C0115a(f1.j jVar, UUID uuid) {
            this.f24929r = jVar;
            this.f24930s = uuid;
        }

        @Override // n1.a
        void h() {
            WorkDatabase o7 = this.f24929r.o();
            o7.c();
            try {
                a(this.f24929r, this.f24930s.toString());
                o7.r();
                o7.g();
                g(this.f24929r);
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    /* compiled from: MyApplication */
    class b extends a {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ f1.j f24931r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f24932s;

        b(f1.j jVar, String str) {
            this.f24931r = jVar;
            this.f24932s = str;
        }

        @Override // n1.a
        void h() {
            WorkDatabase o7 = this.f24931r.o();
            o7.c();
            try {
                Iterator it = o7.B().p(this.f24932s).iterator();
                while (it.hasNext()) {
                    a(this.f24931r, (String) it.next());
                }
                o7.r();
                o7.g();
                g(this.f24931r);
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    /* compiled from: MyApplication */
    class c extends a {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ f1.j f24933r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f24934s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f24935t;

        c(f1.j jVar, String str, boolean z7) {
            this.f24933r = jVar;
            this.f24934s = str;
            this.f24935t = z7;
        }

        @Override // n1.a
        void h() {
            WorkDatabase o7 = this.f24933r.o();
            o7.c();
            try {
                Iterator it = o7.B().k(this.f24934s).iterator();
                while (it.hasNext()) {
                    a(this.f24933r, (String) it.next());
                }
                o7.r();
                o7.g();
                if (this.f24935t) {
                    g(this.f24933r);
                }
            } catch (Throwable th) {
                o7.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, f1.j jVar) {
        return new C0115a(jVar, uuid);
    }

    public static a c(String str, f1.j jVar, boolean z7) {
        return new c(jVar, str, z7);
    }

    public static a d(String str, f1.j jVar) {
        return new b(jVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        m1.q B = workDatabase.B();
        m1.b t7 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s l7 = B.l(str2);
            if (l7 != s.SUCCEEDED && l7 != s.FAILED) {
                B.o(s.CANCELLED, str2);
            }
            linkedList.addAll(t7.a(str2));
        }
    }

    void a(f1.j jVar, String str) {
        f(jVar.o(), str);
        jVar.m().l(str);
        Iterator it = jVar.n().iterator();
        while (it.hasNext()) {
            ((f1.e) it.next()).d(str);
        }
    }

    public e1.m e() {
        return this.f24928q;
    }

    void g(f1.j jVar) {
        f1.f.b(jVar.i(), jVar.o(), jVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f24928q.a(e1.m.f23177a);
        } catch (Throwable th) {
            this.f24928q.a(new m.b.a(th));
        }
    }
}
