package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

final class y1 extends x1 {
    y1(int i7) {
        super(i7, null);
    }

    @Override // com.google.android.gms.internal.drive.x1
    public final void j() {
        if (!a()) {
            if (m() > 0) {
                android.support.v4.media.session.b.a(g(0).getKey());
                throw null;
            }
            Iterator it = n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.j();
    }
}
