package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.Map;

/* compiled from: MyApplication */
class FragmentManager$6 implements androidx.lifecycle.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.g f2143b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f2144c;

    @Override // androidx.lifecycle.i
    public void c(androidx.lifecycle.k kVar, g.b bVar) {
        Map map;
        Map map2;
        if (bVar == g.b.ON_START) {
            map2 = this.f2144c.f2292j;
            if (((Bundle) map2.get(this.f2142a)) != null) {
                throw null;
            }
        }
        if (bVar == g.b.ON_DESTROY) {
            this.f2143b.c(this);
            map = this.f2144c.f2293k;
            map.remove(this.f2142a);
        }
    }
}
