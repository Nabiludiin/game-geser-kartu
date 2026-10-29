package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class zx4 implements u05 {
    protected static x15 i(v05 v05Var) {
        return new x15(v05Var);
    }

    protected static void k(Iterable iterable, List list) {
        byte[] bArr = c05.f6204b;
        iterable.getClass();
        if (iterable instanceof e15) {
            list.addAll((Collection) iterable);
        } else {
            q(iterable, list);
        }
    }

    private static void q(Iterable iterable, List list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof g15) {
                ((g15) list).g(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    r(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Object obj2 = list2.get(i7);
            if (obj2 == null) {
                r(list, size2);
            }
            list.add(obj2);
        }
    }

    private static void r(List list, int i7) {
        int size = list.size() - i7;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i7) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    public zx4 d(byte[] bArr, ez4 ez4Var) {
        return g(bArr, 0, bArr.length, ez4Var);
    }

    public abstract zx4 g(byte[] bArr, int i7, int i8, ez4 ez4Var);
}
