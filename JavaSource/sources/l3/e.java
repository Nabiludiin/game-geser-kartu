package l3;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;
import java.util.Set;
import l3.a;
import m3.h0;
import m3.m0;
import m3.p;
import m3.q;
import m3.v;
import m3.y0;
import p3.d;
import p3.o;

/* compiled from: MyApplication */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24594a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24595b;

    /* renamed from: c, reason: collision with root package name */
    private final l3.a f24596c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f24597d;

    /* renamed from: e, reason: collision with root package name */
    private final m3.b f24598e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f24599f;

    /* renamed from: g, reason: collision with root package name */
    private final int f24600g;

    /* renamed from: h, reason: collision with root package name */
    private final f f24601h;

    /* renamed from: i, reason: collision with root package name */
    private final p f24602i;

    /* renamed from: j, reason: collision with root package name */
    protected final m3.g f24603j;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24604c = new C0108a().a();

        /* renamed from: a, reason: collision with root package name */
        public final p f24605a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f24606b;

        /* compiled from: MyApplication */
        /* renamed from: l3.e$a$a, reason: collision with other inner class name */
        public static class C0108a {

            /* renamed from: a, reason: collision with root package name */
            private p f24607a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f24608b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f24607a == null) {
                    this.f24607a = new m3.a();
                }
                if (this.f24608b == null) {
                    this.f24608b = Looper.getMainLooper();
                }
                return new a(this.f24607a, this.f24608b);
            }
        }

        private a(p pVar, Account account, Looper looper) {
            this.f24605a = pVar;
            this.f24606b = looper;
        }
    }

    private e(Context context, Activity activity, l3.a aVar, a.d dVar, a aVar2) {
        o.n(context, "Null context is not permitted.");
        o.n(aVar, "Api must not be null.");
        o.n(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) o.n(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f24594a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : g(context);
        this.f24595b = attributionTag;
        this.f24596c = aVar;
        this.f24597d = dVar;
        this.f24599f = aVar2.f24606b;
        m3.b a8 = m3.b.a(aVar, dVar, attributionTag);
        this.f24598e = a8;
        this.f24601h = new m0(this);
        m3.g t7 = m3.g.t(context2);
        this.f24603j = t7;
        this.f24600g = t7.k();
        this.f24602i = aVar2.f24605a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            v.u(activity, t7, a8);
        }
        t7.E(this);
    }

    private final com.google.android.gms.common.api.internal.a n(int i7, com.google.android.gms.common.api.internal.a aVar) {
        aVar.n();
        this.f24603j.z(this, i7, aVar);
        return aVar;
    }

    private final w4.i o(int i7, q qVar) {
        w4.j jVar = new w4.j();
        this.f24603j.A(this, i7, qVar, jVar, this.f24602i);
        return jVar.a();
    }

    protected d.a c() {
        Set set;
        GoogleSignInAccount a8;
        d.a aVar = new d.a();
        a.d dVar = this.f24597d;
        aVar.d((!(dVar instanceof a.d.InterfaceC0107a) || (a8 = ((a.d.InterfaceC0107a) dVar).a()) == null) ? null : a8.M0());
        a.d dVar2 = this.f24597d;
        if (dVar2 instanceof a.d.InterfaceC0107a) {
            GoogleSignInAccount a9 = ((a.d.InterfaceC0107a) dVar2).a();
            set = a9 == null ? Collections.EMPTY_SET : a9.T0();
        } else {
            set = Collections.EMPTY_SET;
        }
        aVar.c(set);
        aVar.e(this.f24594a.getClass().getName());
        aVar.b(this.f24594a.getPackageName());
        return aVar;
    }

    public w4.i d(q qVar) {
        return o(2, qVar);
    }

    public w4.i e(q qVar) {
        return o(0, qVar);
    }

    public com.google.android.gms.common.api.internal.a f(com.google.android.gms.common.api.internal.a aVar) {
        n(1, aVar);
        return aVar;
    }

    protected String g(Context context) {
        return null;
    }

    public final m3.b h() {
        return this.f24598e;
    }

    protected String i() {
        return this.f24595b;
    }

    public Looper j() {
        return this.f24599f;
    }

    public final int k() {
        return this.f24600g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f l(Looper looper, h0 h0Var) {
        p3.d a8 = c().a();
        a.f c8 = ((a.AbstractC0106a) o.m(this.f24596c.a())).c(this.f24594a, looper, a8, this.f24597d, h0Var, h0Var);
        String i7 = i();
        if (i7 != null && (c8 instanceof p3.c)) {
            ((p3.c) c8).U(i7);
        }
        if (i7 == null || !(c8 instanceof m3.m)) {
            return c8;
        }
        android.support.v4.media.session.b.a(c8);
        throw null;
    }

    public final y0 m(Context context, Handler handler) {
        return new y0(context, handler, c().a());
    }

    public e(Context context, l3.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
