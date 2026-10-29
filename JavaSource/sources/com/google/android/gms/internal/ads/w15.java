package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class w15 {
    static String a(qy4 qy4Var) {
        StringBuilder sb = new StringBuilder(qy4Var.h());
        for (int i7 = 0; i7 < qy4Var.h(); i7++) {
            byte e8 = qy4Var.e(i7);
            if (e8 == 34) {
                sb.append("\\\"");
            } else if (e8 == 39) {
                sb.append("\\'");
            } else if (e8 != 92) {
                switch (e8) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (e8 < 32 || e8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e8 >>> 6) & 3) + 48));
                            sb.append((char) (((e8 >>> 3) & 7) + 48));
                            sb.append((char) ((e8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) e8);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
