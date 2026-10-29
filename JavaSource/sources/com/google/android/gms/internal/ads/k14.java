package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class k14 {
    public static boolean a(Iterable iterable, sx3 sx3Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            sx3Var.getClass();
            return c((List) iterable, sx3Var);
        }
        Iterator it = iterable.iterator();
        sx3Var.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (sx3Var.d(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static Object b(Iterable iterable, Object obj) {
        j34 it = ((a34) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean c(List list, sx3 sx3Var) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            Object obj = list.get(i7);
            if (!sx3Var.d(obj)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, obj);
                    } catch (IllegalArgumentException unused) {
                        d(list, sx3Var, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        d(list, sx3Var, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }

    private static void d(List list, sx3 sx3Var, int i7, int i8) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i8) {
                break;
            } else if (sx3Var.d(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            } else {
                list.remove(i8);
            }
        }
    }
}
