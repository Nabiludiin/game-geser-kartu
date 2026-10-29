package v5;

import com.google.firebase.components.ComponentRegistrar;
import f5.e;
import f5.h;
import f5.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public class b implements j {
    public static /* synthetic */ Object b(String str, f5.c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // f5.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final f5.c cVar : componentRegistrar.getComponents()) {
            final String i7 = cVar.i();
            if (i7 != null) {
                cVar = cVar.r(new h() { // from class: v5.a
                    @Override // f5.h
                    public final Object a(e eVar) {
                        return b.b(i7, cVar, eVar);
                    }
                });
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
