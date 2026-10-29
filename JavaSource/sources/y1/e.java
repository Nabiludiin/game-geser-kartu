package y1;

import android.content.Context;
import f2.w;
import g2.n0;
import g2.u0;
import y1.u;

/* compiled from: MyApplication */
final class e extends u {
    private d6.a A;
    private d6.a B;
    private d6.a C;

    /* renamed from: q, reason: collision with root package name */
    private d6.a f27594q;

    /* renamed from: r, reason: collision with root package name */
    private d6.a f27595r;

    /* renamed from: s, reason: collision with root package name */
    private d6.a f27596s;

    /* renamed from: t, reason: collision with root package name */
    private d6.a f27597t;

    /* renamed from: u, reason: collision with root package name */
    private d6.a f27598u;

    /* renamed from: v, reason: collision with root package name */
    private d6.a f27599v;

    /* renamed from: w, reason: collision with root package name */
    private d6.a f27600w;

    /* renamed from: x, reason: collision with root package name */
    private d6.a f27601x;

    /* renamed from: y, reason: collision with root package name */
    private d6.a f27602y;

    /* renamed from: z, reason: collision with root package name */
    private d6.a f27603z;

    /* compiled from: MyApplication */
    private static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f27604a;

        private b() {
        }

        @Override // y1.u.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f27604a = (Context) a2.d.b(context);
            return this;
        }

        @Override // y1.u.a
        public u build() {
            a2.d.a(this.f27604a, Context.class);
            return new e(this.f27604a);
        }
    }

    public static u.a e() {
        return new b();
    }

    private void g(Context context) {
        this.f27594q = a2.a.a(k.a());
        a2.b a8 = a2.c.a(context);
        this.f27595r = a8;
        z1.j a9 = z1.j.a(a8, i2.c.a(), i2.d.a());
        this.f27596s = a9;
        this.f27597t = a2.a.a(z1.l.a(this.f27595r, a9));
        this.f27598u = u0.a(this.f27595r, g2.g.a(), g2.i.a());
        this.f27599v = a2.a.a(g2.h.a(this.f27595r));
        this.f27600w = a2.a.a(n0.a(i2.c.a(), i2.d.a(), g2.j.a(), this.f27598u, this.f27599v));
        e2.g b8 = e2.g.b(i2.c.a());
        this.f27601x = b8;
        e2.i a10 = e2.i.a(this.f27595r, this.f27600w, b8, i2.d.a());
        this.f27602y = a10;
        d6.a aVar = this.f27594q;
        d6.a aVar2 = this.f27597t;
        d6.a aVar3 = this.f27600w;
        this.f27603z = e2.d.a(aVar, aVar2, a10, aVar3, aVar3);
        d6.a aVar4 = this.f27595r;
        d6.a aVar5 = this.f27597t;
        d6.a aVar6 = this.f27600w;
        this.A = f2.s.a(aVar4, aVar5, aVar6, this.f27602y, this.f27594q, aVar6, i2.c.a(), i2.d.a(), this.f27600w);
        d6.a aVar7 = this.f27594q;
        d6.a aVar8 = this.f27600w;
        this.B = w.a(aVar7, aVar8, this.f27602y, aVar8);
        this.C = a2.a.a(v.a(i2.c.a(), i2.d.a(), this.f27603z, this.A, this.B));
    }

    @Override // y1.u
    g2.d a() {
        return (g2.d) this.f27600w.get();
    }

    @Override // y1.u
    t c() {
        return (t) this.C.get();
    }

    private e(Context context) {
        g(context);
    }
}
