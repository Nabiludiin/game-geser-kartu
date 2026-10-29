package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public abstract class c13 {
    public static s2.g5 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d03 d03Var = (d03) it.next();
            if (d03Var.f6892c) {
                arrayList.add(k2.h.f24407p);
            } else {
                arrayList.add(new k2.h(d03Var.f6890a, d03Var.f6891b));
            }
        }
        return new s2.g5(context, (k2.h[]) arrayList.toArray(new k2.h[arrayList.size()]));
    }

    public static d03 b(s2.g5 g5Var) {
        return g5Var.f26103y ? new d03(-3, 0, true) : new d03(g5Var.f26099u, g5Var.f26096r, false);
    }
}
