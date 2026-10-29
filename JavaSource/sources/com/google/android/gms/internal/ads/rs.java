package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* compiled from: MyApplication */
public abstract class rs {
    public static void a(String[] strArr, int i7, int i8, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            b(i7, e(strArr, 0, length), c(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e8 = e(strArr, 0, 6);
        b(i7, e8, c(strArr, 0, 6), 6, priorityQueue);
        int i9 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i9 >= length2 - 5) {
                return;
            }
            long a8 = os.a(strArr[i9 - 1]);
            long a9 = os.a(strArr[i9 + 5]);
            String c8 = c(strArr, i9, 6);
            e8 = ((((((e8 + 1073807359) - ((d(16785407L, 5) * ((a8 + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((a9 + 2147483647L) % 1073807359)) % 1073807359;
            b(i7, e8, c8, length2, priorityQueue);
            i9++;
        }
    }

    static void b(int i7, long j7, String str, int i8, PriorityQueue priorityQueue) {
        qs qsVar = new qs(j7, str, i8);
        if ((priorityQueue.size() != i7 || (((qs) priorityQueue.peek()).f14599c <= qsVar.f14599c && ((qs) priorityQueue.peek()).f14597a <= qsVar.f14597a)) && !priorityQueue.contains(qsVar)) {
            priorityQueue.add(qsVar);
            if (priorityQueue.size() > i7) {
                priorityQueue.poll();
            }
        }
    }

    static String c(String[] strArr, int i7, int i8) {
        int i9 = i8 + i7;
        if (strArr.length < i9) {
            int i10 = v2.n1.f26802b;
            w2.p.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i9 - 1;
            if (i7 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i7]);
            sb.append(' ');
            i7++;
        }
    }

    static long d(long j7, int i7) {
        if (i7 == 1) {
            return j7;
        }
        int i8 = i7 >> 1;
        long j8 = (j7 * j7) % 1073807359;
        return ((i7 & 1) == 0 ? d(j8, i8) : j7 * (d(j8, i8) % 1073807359)) % 1073807359;
    }

    private static long e(String[] strArr, int i7, int i8) {
        long a8 = (os.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i9 = 1; i9 < i8; i9++) {
            a8 = (((a8 * 16785407) % 1073807359) + ((os.a(strArr[i9]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a8;
    }
}
