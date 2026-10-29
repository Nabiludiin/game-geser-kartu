package v6;

import f6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q6.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class h extends g {
    public static List c(b bVar) {
        i.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.c();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return l.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
