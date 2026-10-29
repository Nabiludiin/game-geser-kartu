package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class b2 extends d4 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f21880b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f21881c;

    /* renamed from: d, reason: collision with root package name */
    private long f21882d;

    public b2(w6 w6Var) {
        super(w6Var);
        this.f21881c = new r.a();
        this.f21880b = new r.a();
    }

    private final void o(long j7, da daVar) {
        if (daVar == null) {
            this.f22928a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f22928a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        yd.k0(daVar, bundle, true);
        this.f22928a.B().t("am", "_xa", bundle);
    }

    private final void p(String str, long j7, da daVar) {
        if (daVar == null) {
            this.f22928a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            this.f22928a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        yd.k0(daVar, bundle, true);
        this.f22928a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j7) {
        Map map = this.f21880b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j7));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f21882d = j7;
    }

    public final void i(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f22928a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f22928a.b().t(new a(this, str, j7));
        }
    }

    public final void j(String str, long j7) {
        if (str == null || str.length() == 0) {
            this.f22928a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f22928a.b().t(new z(this, str, j7));
        }
    }

    public final void k(long j7) {
        da q7 = this.f22928a.I().q(false);
        Map map = this.f21880b;
        for (String str : map.keySet()) {
            p(str, j7 - ((Long) map.get(str)).longValue(), q7);
        }
        if (!map.isEmpty()) {
            o(j7 - this.f21882d, q7);
        }
        n(j7);
    }

    final /* synthetic */ void l(String str, long j7) {
        h();
        p3.o.g(str);
        Map map = this.f21881c;
        if (map.isEmpty()) {
            this.f21882d = j7;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f22928a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f21880b.put(str, Long.valueOf(j7));
        }
    }

    final /* synthetic */ void m(String str, long j7) {
        h();
        p3.o.g(str);
        Map map = this.f21881c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f22928a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        da q7 = this.f22928a.I().q(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f21880b;
        Long l7 = (Long) map2.get(str);
        if (l7 == null) {
            this.f22928a.a().o().a("First ad unit exposure time was never set");
        } else {
            long longValue = j7 - l7.longValue();
            map2.remove(str);
            p(str, longValue, q7);
        }
        if (map.isEmpty()) {
            long j8 = this.f21882d;
            if (j8 == 0) {
                this.f22928a.a().o().a("First ad exposure time was never set");
            } else {
                o(j7 - j8, q7);
                this.f21882d = 0L;
            }
        }
    }
}
