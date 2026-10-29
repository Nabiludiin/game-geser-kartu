package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class n9 implements wb {
    private static void i(List list, int i7) {
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

    protected static void m(Iterable iterable, List list) {
        byte[] bArr = eb.f20914b;
        iterable.getClass();
        if (iterable instanceof ec) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof gc) {
                ((gc) list).g(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    i(list, size2);
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
                i(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wb
    public final /* synthetic */ wb e(byte[] bArr, la laVar) {
        return l(bArr, 0, bArr.length, laVar);
    }

    @Override // com.google.android.gms.internal.measurement.wb
    public final /* synthetic */ wb j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public abstract n9 k(byte[] bArr, int i7, int i8);

    public abstract n9 l(byte[] bArr, int i7, int i8, la laVar);
}
