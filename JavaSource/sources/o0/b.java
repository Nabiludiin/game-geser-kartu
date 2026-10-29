package o0;

import android.content.Context;
import android.util.Log;
import p6.l;
import q6.i;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25043a = new b();

    private b() {
    }

    public final Object a(Context context, String str, l lVar) {
        i.e(context, "context");
        i.e(str, "tag");
        i.e(lVar, "manager");
        try {
            return lVar.g(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(str, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + a.f25040a.b());
            return null;
        }
    }
}
