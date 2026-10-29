package com.google.android.gms.internal.drive;

import java.util.Comparator;

final class k implements Comparator {
    k() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int c8;
        int c9;
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        p pVar = (p) iVar.iterator();
        p pVar2 = (p) iVar2.iterator();
        while (pVar.hasNext() && pVar2.hasNext()) {
            c8 = i.c(pVar.c());
            c9 = i.c(pVar2.c());
            int compare = Integer.compare(c8, c9);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(iVar.size(), iVar2.size());
    }
}
