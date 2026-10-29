package c6;

import android.content.Context;
import c6.t;
import c6.y;
import java.io.InputStream;

/* compiled from: MyApplication */
class g extends y {

    /* renamed from: a, reason: collision with root package name */
    final Context f3606a;

    g(Context context) {
        this.f3606a = context;
    }

    @Override // c6.y
    public boolean c(w wVar) {
        return "content".equals(wVar.f3719d.getScheme());
    }

    @Override // c6.y
    public y.a f(w wVar, int i7) {
        return new y.a(j(wVar), t.e.DISK);
    }

    InputStream j(w wVar) {
        return this.f3606a.getContentResolver().openInputStream(wVar.f3719d);
    }
}
