package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MyApplication */
public abstract class u2 implements z4 {
    protected int zza = 0;

    protected static void d(Iterable iterable, List list) {
        byte[] bArr = j4.f21586b;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof h5) {
            ((h5) list).g(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Object obj = list2.get(i7);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] b() {
        try {
            int i7 = i();
            byte[] bArr = new byte[i7];
            int i8 = p3.f21708d;
            m3 m3Var = new m3(bArr, 0, i7);
            a(m3Var);
            m3Var.e();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }

    abstract int c(j5 j5Var);
}
