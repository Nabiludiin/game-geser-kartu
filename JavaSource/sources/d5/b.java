package d5;

import android.content.Context;
import android.os.Bundle;
import c5.e;
import com.google.android.gms.internal.measurement.p3;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p3.o;

/* compiled from: MyApplication */
public class b implements a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f23127c;

    /* renamed from: a, reason: collision with root package name */
    final s4.a f23128a;

    /* renamed from: b, reason: collision with root package name */
    final Map f23129b;

    b(s4.a aVar) {
        o.m(aVar);
        this.f23128a = aVar;
        this.f23129b = new ConcurrentHashMap();
    }

    public static a a(e eVar, Context context, m5.d dVar) {
        o.m(eVar);
        o.m(context);
        o.m(dVar);
        o.m(context.getApplicationContext());
        if (f23127c == null) {
            synchronized (b.class) {
                try {
                    if (f23127c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.t()) {
                            dVar.a(c5.b.class, d.f23131q, c.f23130a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.s());
                        }
                        f23127c = new b(p3.o(context, bundle).p());
                    }
                } finally {
                }
            }
        }
        return f23127c;
    }

    static /* synthetic */ void b(m5.a aVar) {
        throw null;
    }
}
