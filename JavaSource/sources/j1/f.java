package j1;

import android.content.Context;
import android.os.Build;
import e1.j;
import e1.k;
import m1.p;

/* compiled from: MyApplication */
public class f extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f24242e = j.f("NetworkNotRoamingCtrlr");

    public f(Context context, o1.a aVar) {
        super(k1.h.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f24718j.b() == k.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        j.c().a(f24242e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
