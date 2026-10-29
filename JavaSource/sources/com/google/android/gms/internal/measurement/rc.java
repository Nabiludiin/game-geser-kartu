package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
abstract class rc {
    static String a(ca caVar) {
        StringBuilder sb = new StringBuilder(caVar.g());
        for (int i7 = 0; i7 < caVar.g(); i7++) {
            byte c8 = caVar.c(i7);
            if (c8 == 34) {
                sb.append("\\\"");
            } else if (c8 == 39) {
                sb.append("\\'");
            } else if (c8 != 92) {
                switch (c8) {
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
                        if (c8 < 32 || c8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c8 >>> 6) & 3) + 48));
                            sb.append((char) (((c8 >>> 3) & 7) + 48));
                            sb.append((char) ((c8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c8);
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
