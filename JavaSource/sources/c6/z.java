package c6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c6.t;
import c6.y;

/* compiled from: MyApplication */
class z extends y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3766a;

    z(Context context) {
        this.f3766a = context;
    }

    private static Bitmap j(Resources resources, int i7, w wVar) {
        BitmapFactory.Options d8 = y.d(wVar);
        if (y.g(d8)) {
            BitmapFactory.decodeResource(resources, i7, d8);
            y.b(wVar.f3723h, wVar.f3724i, d8, wVar);
        }
        return BitmapFactory.decodeResource(resources, i7, d8);
    }

    @Override // c6.y
    public boolean c(w wVar) {
        if (wVar.f3720e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f3719d.getScheme());
    }

    @Override // c6.y
    public y.a f(w wVar, int i7) {
        Resources o7 = e0.o(this.f3766a, wVar);
        return new y.a(j(o7, e0.n(o7, wVar), wVar), t.e.DISK);
    }
}
