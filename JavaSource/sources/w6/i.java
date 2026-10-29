package w6;

import f6.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class i extends f {
    private static final p6.l d(final String str) {
        return str.length() == 0 ? new p6.l() { // from class: w6.g
            @Override // p6.l
            public final Object g(Object obj) {
                String e8;
                e8 = i.e((String) obj);
                return e8;
            }
        } : new p6.l() { // from class: w6.h
            @Override // p6.l
            public final Object g(Object obj) {
                String f8;
                f8 = i.f(str, (String) obj);
                return f8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str) {
        q6.i.e(str, "line");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String str2) {
        q6.i.e(str2, "line");
        return str + str2;
    }

    private static final int g(String str) {
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (!a.c(str.charAt(i7))) {
                break;
            }
            i7++;
        }
        return i7 == -1 ? str.length() : i7;
    }

    public static final String h(String str, String str2) {
        Appendable i7;
        String str3;
        q6.i.e(str, "<this>");
        q6.i.e(str2, "newIndent");
        List A = q.A(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (!q.v((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(f6.l.h(arrayList, 10));
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            arrayList2.add(Integer.valueOf(g((String) obj2)));
        }
        Integer num = (Integer) f6.l.o(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * A.size());
        p6.l d8 = d(str2);
        int d9 = f6.l.d(A);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : A) {
            int i10 = i8 + 1;
            if (i8 < 0) {
                f6.l.g();
            }
            String str4 = (String) obj3;
            if ((i8 == 0 || i8 == d9) && q.v(str4)) {
                str4 = null;
            } else {
                String I = s.I(str4, intValue);
                if (I != null && (str3 = (String) d8.g(I)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i8 = i10;
        }
        i7 = v.i(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((StringBuilder) i7).toString();
    }

    public static String i(String str) {
        q6.i.e(str, "<this>");
        return h(str, "");
    }
}
