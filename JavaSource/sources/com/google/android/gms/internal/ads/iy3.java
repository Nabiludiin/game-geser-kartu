package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class iy3 {
    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static String b(String str) {
        if (qx3.a(str)) {
            return null;
        }
        return str;
    }

    public static boolean c(String str) {
        return qx3.a(str);
    }

    public static String d(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = objArr.length;
            if (i7 >= length || (indexOf = str.indexOf("%s", i8)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i8, indexOf);
            sb.append(e(objArr[i7]));
            i8 = indexOf + 2;
            i7++;
        }
        sb.append((CharSequence) str, i8, str.length());
        if (i7 < length) {
            String str2 = " [";
            while (i7 < objArr.length) {
                sb.append(str2);
                sb.append(e(objArr[i7]));
                i7++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e8) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e8);
            String name2 = e8.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
