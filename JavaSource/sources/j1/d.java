package j1;

import android.content.Context;
import android.os.Build;
import e1.k;
import m1.p;

/* compiled from: MyApplication */
public class d extends c {
    public d(Context context, o1.a aVar) {
        super(k1.h.c(context, aVar).d());
    }

    @Override // j1.c
    boolean b(p pVar) {
        return pVar.f24718j.b() == k.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(i1.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
