package q4;

import android.content.Intent;

/* compiled from: MyApplication */
public final class i implements e4.a {
    @Override // e4.a
    public final l3.g a(l3.f fVar, String str, long j7) {
        return e(fVar, str, j7, null);
    }

    @Override // e4.a
    public final Intent b(l3.f fVar, String str) {
        return c(fVar, str, -1);
    }

    public final Intent c(l3.f fVar, String str, int i7) {
        return d(fVar, str, i7, -1);
    }

    public final Intent d(l3.f fVar, String str, int i7, int i8) {
        return y3.b.a(fVar).r0(str, i7, i8);
    }

    public final l3.g e(l3.f fVar, String str, long j7, String str2) {
        return fVar.g(new j(this, fVar, str, j7, str2));
    }
}
