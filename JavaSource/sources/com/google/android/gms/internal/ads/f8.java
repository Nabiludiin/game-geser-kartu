package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
abstract class f8 {
    public static String a(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z7 = false;
        while (it.hasNext()) {
            String str2 = ((s8) it.next()).f15486a.f13698g.f7775o;
            if (th.b(str2)) {
                return "video/mp4";
            }
            if (th.a(str2)) {
                z7 = true;
            } else if (th.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z7 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
