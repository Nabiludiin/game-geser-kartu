package com.google.android.gms.internal.drive;

abstract class h2 {
    static String a(i iVar) {
        i2 i2Var = new i2(iVar);
        StringBuilder sb = new StringBuilder(i2Var.size());
        for (int i7 = 0; i7 < i2Var.size(); i7++) {
            byte N = i2Var.N(i7);
            if (N == 34) {
                sb.append("\\\"");
            } else if (N == 39) {
                sb.append("\\'");
            } else if (N != 92) {
                switch (N) {
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
                        if (N < 32 || N > 126) {
                            sb.append('\\');
                            sb.append((char) (((N >>> 6) & 3) + 48));
                            sb.append((char) (((N >>> 3) & 7) + 48));
                            sb.append((char) ((N & 7) + 48));
                            break;
                        } else {
                            sb.append((char) N);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
