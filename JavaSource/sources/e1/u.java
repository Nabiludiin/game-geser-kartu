package e1;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: MyApplication */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private UUID f23191a;

    /* renamed from: b, reason: collision with root package name */
    private m1.p f23192b;

    /* renamed from: c, reason: collision with root package name */
    private Set f23193c;

    /* compiled from: MyApplication */
    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        m1.p f23196c;

        /* renamed from: e, reason: collision with root package name */
        Class f23198e;

        /* renamed from: a, reason: collision with root package name */
        boolean f23194a = false;

        /* renamed from: d, reason: collision with root package name */
        Set f23197d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f23195b = UUID.randomUUID();

        a(Class cls) {
            this.f23198e = cls;
            this.f23196c = new m1.p(this.f23195b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.f23197d.add(str);
            return d();
        }

        public final u b() {
            u c8 = c();
            b bVar = this.f23196c.f24718j;
            boolean z7 = (Build.VERSION.SDK_INT >= 24 && bVar.e()) || bVar.f() || bVar.g() || bVar.h();
            if (this.f23196c.f24725q && z7) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f23195b = UUID.randomUUID();
            m1.p pVar = new m1.p(this.f23196c);
            this.f23196c = pVar;
            pVar.f24709a = this.f23195b.toString();
            return c8;
        }

        abstract u c();

        abstract a d();

        public final a e(b bVar) {
            this.f23196c.f24718j = bVar;
            return d();
        }

        public final a f(androidx.work.b bVar) {
            this.f23196c.f24713e = bVar;
            return d();
        }
    }

    protected u(UUID uuid, m1.p pVar, Set set) {
        this.f23191a = uuid;
        this.f23192b = pVar;
        this.f23193c = set;
    }

    public String a() {
        return this.f23191a.toString();
    }

    public Set b() {
        return this.f23193c;
    }

    public m1.p c() {
        return this.f23192b;
    }
}
