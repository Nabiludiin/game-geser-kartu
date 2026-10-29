package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class m6 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final List f12082a;

    public m6(List list) {
        this.f12082a = list;
        boolean z7 = false;
        if (!list.isEmpty()) {
            long j7 = ((l6) list.get(0)).f11430b;
            int i7 = 1;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                }
                if (((l6) list.get(i7)).f11429a < j7) {
                    z7 = true;
                    break;
                } else {
                    j7 = ((l6) list.get(i7)).f11430b;
                    i7++;
                }
            }
        }
        rx3.a(!z7);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m6.class != obj.getClass()) {
            return false;
        }
        return this.f12082a.equals(((m6) obj).f12082a);
    }

    public final int hashCode() {
        return this.f12082a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f12082a.toString());
    }
}
