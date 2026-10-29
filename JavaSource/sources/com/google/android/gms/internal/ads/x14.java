package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class x14 {
    public static ArrayList a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList b(int i7) {
        sz3.b(i7, "initialArraySize");
        return new ArrayList(i7);
    }

    public static List c(List list, hx3 hx3Var) {
        return list instanceof RandomAccess ? new u14(list, hx3Var) : new w14(list, hx3Var);
    }
}
