package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MyApplication */
public abstract class jy1 {
    public static void a(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 4);
            sb.append("csd-");
            sb.append(i7);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static void b(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }
}
