package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class g4 {
    public static int a(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i7 >>>= 1;
            i8++;
        }
        return i8;
    }

    public static d4 b(y82 y82Var, boolean z7, boolean z8) {
        if (z7) {
            d(3, y82Var, false);
        }
        String k7 = y82Var.k((int) y82Var.a(), StandardCharsets.UTF_8);
        int length = k7.length();
        long a8 = y82Var.a();
        String[] strArr = new String[(int) a8];
        int i7 = length + 15;
        for (int i8 = 0; i8 < a8; i8++) {
            String k8 = y82Var.k((int) y82Var.a(), StandardCharsets.UTF_8);
            strArr[i8] = k8;
            i7 = i7 + 4 + k8.length();
        }
        if (z8 && (y82Var.R() & 1) == 0) {
            throw wi.b("framing bit expected to be set", null);
        }
        return new d4(k7, strArr, i7 + 1);
    }

    public static le c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            String str2 = hi2.f9535a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                gv1.c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(q5.b(new y82(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    gv1.d("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new p6(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new le(arrayList);
    }

    public static boolean d(int i7, y82 y82Var, boolean z7) {
        if (y82Var.C() < 7) {
            if (z7) {
                return false;
            }
            int C = y82Var.C();
            StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 18);
            sb.append("too short header: ");
            sb.append(C);
            throw wi.b(sb.toString(), null);
        }
        if (y82Var.R() != i7) {
            if (z7) {
                return false;
            }
            throw wi.b("expected header type ".concat(String.valueOf(Integer.toHexString(i7))), null);
        }
        if (y82Var.R() == 118 && y82Var.R() == 111 && y82Var.R() == 114 && y82Var.R() == 98 && y82Var.R() == 105 && y82Var.R() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw wi.b("expected characters 'vorbis'", null);
    }
}
