package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;

/* compiled from: MyApplication */
public abstract class h0 extends w {

    /* renamed from: b, reason: collision with root package name */
    private final TopicsManager f2580b;

    /* compiled from: MyApplication */
    static final class a extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f2581t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f2582u;

        /* renamed from: w, reason: collision with root package name */
        int f2584w;

        a(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f2582u = obj;
            this.f2584w |= Integer.MIN_VALUE;
            return h0.e(h0.this, null, this);
        }
    }

    public h0(TopicsManager topicsManager) {
        q6.i.e(topicsManager, "mTopicsManager");
        this.f2580b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.h0 r4, androidx.privacysandbox.ads.adservices.topics.c r5, g6.e r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.h0.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.h0$a r0 = (androidx.privacysandbox.ads.adservices.topics.h0.a) r0
            int r1 = r0.f2584w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2584w = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.h0$a r0 = new androidx.privacysandbox.ads.adservices.topics.h0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2582u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f2584w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f2581t
            androidx.privacysandbox.ads.adservices.topics.h0 r4 = (androidx.privacysandbox.ads.adservices.topics.h0) r4
            e6.n.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e6.n.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f2581t = r4
            r0.f2584w = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = androidx.privacysandbox.ads.adservices.topics.f0.a(r6)
            androidx.privacysandbox.ads.adservices.topics.i r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.h0.e(androidx.privacysandbox.ads.adservices.topics.h0, androidx.privacysandbox.ads.adservices.topics.c, g6.e):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, g6.e eVar) {
        x6.k kVar = new x6.k(h6.b.c(eVar), 1);
        kVar.E();
        this.f2580b.getTopics(getTopicsRequest, new androidx.privacysandbox.ads.adservices.measurement.k(), androidx.core.os.p.a(kVar));
        Object w7 = kVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.w
    public Object a(c cVar, g6.e eVar) {
        return e(this, cVar, eVar);
    }

    public GetTopicsRequest c(c cVar) {
        q6.i.e(cVar, "request");
        return h.f2579a.b(cVar);
    }

    public i d(GetTopicsResponse getTopicsResponse) {
        q6.i.e(getTopicsResponse, "response");
        return t.f2587a.a(getTopicsResponse);
    }
}
