package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import e6.s;
import p6.p;
import x6.g0;
import x6.h0;

/* compiled from: MyApplication */
public abstract class l extends b {

    /* renamed from: b, reason: collision with root package name */
    private final MeasurementManager f2568b;

    /* compiled from: MyApplication */
    static final class a extends i6.k implements p {

        /* renamed from: u, reason: collision with root package name */
        int f2569u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f2570v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ l f2571w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, g6.e eVar) {
            super(2, eVar);
            this.f2571w = lVar;
        }

        @Override // i6.a
        public final g6.e j(Object obj, g6.e eVar) {
            a aVar = new a(null, this.f2571w, eVar);
            aVar.f2570v = obj;
            return aVar;
        }

        @Override // i6.a
        public final Object m(Object obj) {
            h6.b.e();
            if (this.f2569u != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e6.n.b(obj);
            throw null;
        }

        @Override // p6.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object i(g0 g0Var, g6.e eVar) {
            return ((a) j(g0Var, eVar)).m(s.f23253a);
        }
    }

    public l(MeasurementManager measurementManager) {
        q6.i.e(measurementManager, "mMeasurementManager");
        this.f2568b = measurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, g6.e eVar) {
        new x6.k(h6.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, g6.e eVar) {
        x6.k kVar = new x6.k(h6.b.c(eVar), 1);
        kVar.E();
        lVar.i().getMeasurementApiStatus(new k(), androidx.core.os.p.a(kVar));
        Object w7 = kVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, g6.e eVar) {
        x6.k kVar = new x6.k(h6.b.c(eVar), 1);
        kVar.E();
        lVar.i().registerSource(uri, inputEvent, new k(), androidx.core.os.p.a(kVar));
        Object w7 = kVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7 == h6.b.e() ? w7 : s.f23253a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, g6.e eVar) {
        Object b8 = h0.b(new a(mVar, lVar, null), eVar);
        return b8 == h6.b.e() ? b8 : s.f23253a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, g6.e eVar) {
        x6.k kVar = new x6.k(h6.b.c(eVar), 1);
        kVar.E();
        lVar.i().registerTrigger(uri, new k(), androidx.core.os.p.a(kVar));
        Object w7 = kVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7 == h6.b.e() ? w7 : s.f23253a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, g6.e eVar) {
        new x6.k(h6.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, g6.e eVar) {
        new x6.k(h6.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, g6.e eVar) {
        return h(this, aVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(g6.e eVar) {
        return j(this, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, g6.e eVar) {
        return k(this, uri, inputEvent, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, g6.e eVar) {
        return l(this, mVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, g6.e eVar) {
        return m(this, uri, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, g6.e eVar) {
        return n(this, nVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, g6.e eVar) {
        return o(this, oVar, eVar);
    }

    protected final MeasurementManager i() {
        return this.f2568b;
    }
}
