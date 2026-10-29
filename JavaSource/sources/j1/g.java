package j1;

import android.content.Context;
import android.os.Build;
import e1.k;
import m1.p;

/* compiled from: MyApplication */
public class g extends c {
    public g(Context context, o1.a aVar) {
        super(k1.h.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        if (pVar.f24718j.b() != k.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && pVar.f24718j.b() == k.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
