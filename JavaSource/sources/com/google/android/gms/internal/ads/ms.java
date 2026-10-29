package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: MyApplication */
public final class ms {

    /* renamed from: a, reason: collision with root package name */
    private final int f12396a;

    /* renamed from: b, reason: collision with root package name */
    private final js f12397b = new ps();

    public ms(int i7) {
        this.f12396a = i7;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            sb.append(((String) arrayList.get(i7)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ls lsVar = new ls();
        int i8 = this.f12396a;
        PriorityQueue priorityQueue = new PriorityQueue(i8, new ks(this));
        for (String str : split) {
            String[] b8 = os.b(str, false);
            if (b8.length != 0) {
                rs.a(b8, i8, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                lsVar.f11763b.write(this.f12397b.a(((qs) it.next()).f14598b));
            } catch (IOException e8) {
                int i9 = v2.n1.f26802b;
                w2.p.d("Error while writing hash to byteStream", e8);
            }
        }
        return lsVar.toString();
    }
}
