package j1;

import android.content.Context;
import android.os.Build;
import e1.j;
import e1.k;
import m1.p;

/* compiled from: MyApplication */
public class e extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f24241e = j.f("NetworkMeteredCtrlr");

    public e(Context context, o1.a aVar) {
        super(k1.h.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f24718j.b() == k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        j.c().a(f24241e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
