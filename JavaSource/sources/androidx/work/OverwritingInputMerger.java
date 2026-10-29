package androidx.work;

import androidx.work.b;
import e1.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class OverwritingInputMerger extends h {
    @Override // e1.h
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((b) it.next()).h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
