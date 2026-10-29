package p3;

import android.content.Context;
import android.util.SparseIntArray;
import l3.a;

/* compiled from: MyApplication */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f25203a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private k3.h f25204b;

    public h0(k3.h hVar) {
        o.m(hVar);
        this.f25204b = hVar;
    }

    public final int a(Context context, int i7) {
        return this.f25203a.get(i7, -1);
    }

    public final int b(Context context, a.f fVar) {
        o.m(context);
        o.m(fVar);
        int i7 = 0;
        if (!fVar.m()) {
            return 0;
        }
        int o7 = fVar.o();
        int a8 = a(context, o7);
        if (a8 != -1) {
            return a8;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.f25203a.size()) {
                i7 = -1;
                break;
            }
            int keyAt = this.f25203a.keyAt(i8);
            if (keyAt > o7 && this.f25203a.get(keyAt) == 0) {
                break;
            }
            i8++;
        }
        if (i7 == -1) {
            i7 = this.f25204b.j(context, o7);
        }
        this.f25203a.put(o7, i7);
        return i7;
    }

    public final void c() {
        this.f25203a.clear();
    }
}
