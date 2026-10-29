package c6;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import c6.t;
import c6.y;

/* compiled from: MyApplication */
class b extends y {

    /* renamed from: b, reason: collision with root package name */
    private static final int f3572b = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f3573a;

    public b(Context context) {
        this.f3573a = context.getAssets();
    }

    static String j(w wVar) {
        return wVar.f3719d.toString().substring(f3572b);
    }

    @Override // c6.y
    public boolean c(w wVar) {
        Uri uri = wVar.f3719d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // c6.y
    public y.a f(w wVar, int i7) {
        return new y.a(this.f3573a.open(j(wVar)), t.e.DISK);
    }
}
