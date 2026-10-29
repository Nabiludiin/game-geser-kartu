package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class mc extends qc {
    mc() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                android.support.v4.media.session.b.a(((nc) d(0)).c());
                throw null;
            }
            Iterator it = e().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
