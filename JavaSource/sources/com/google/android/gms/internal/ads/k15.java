package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: MyApplication */
abstract class k15 {
    static final /* synthetic */ qy4 a(qy4 qy4Var, qy4 qy4Var2, ArrayDeque arrayDeque) {
        b(qy4Var, arrayDeque);
        b(qy4Var2, arrayDeque);
        qy4 qy4Var3 = (qy4) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            qy4Var3 = new m15((qy4) arrayDeque.pop(), qy4Var3, null);
        }
        return qy4Var3;
    }

    private static final void b(qy4 qy4Var, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!qy4Var.l()) {
            if (!(qy4Var instanceof m15)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(qy4Var.getClass())));
            }
            m15 m15Var = (m15) qy4Var;
            b(m15Var.A(), arrayDeque);
            b(m15Var.C(), arrayDeque);
            return;
        }
        int c8 = c(qy4Var.h(), arrayDeque);
        int G = m15.G(c8 + 1);
        if (arrayDeque.isEmpty() || ((qy4) arrayDeque.peek()).h() >= G) {
            arrayDeque.push(qy4Var);
            return;
        }
        int G2 = m15.G(c8);
        qy4 qy4Var2 = (qy4) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((qy4) arrayDeque.peek()).h() >= G2) {
                break;
            } else {
                qy4Var2 = new m15((qy4) arrayDeque.pop(), qy4Var2, bArr);
            }
        }
        m15 m15Var2 = new m15(qy4Var2, qy4Var, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((qy4) arrayDeque.peek()).h() >= m15.G(c(m15Var2.h(), arrayDeque) + 1)) {
                break;
            } else {
                m15Var2 = new m15((qy4) arrayDeque.pop(), m15Var2, bArr);
            }
        }
        arrayDeque.push(m15Var2);
    }

    private static final int c(int i7, ArrayDeque arrayDeque) {
        int binarySearch = Arrays.binarySearch(m15.f12024x, i7);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
