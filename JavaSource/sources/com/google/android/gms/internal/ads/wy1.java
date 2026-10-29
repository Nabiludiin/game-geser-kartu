package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Objects;

/* compiled from: MyApplication */
public final class wy1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18471a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18472b;

    private wy1(long j7, int[] iArr) {
        this.f18471a = j7;
        this.f18472b = iArr;
    }

    public static w04 a(JsonReader jsonReader) {
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            w04 m7 = w04.m();
            jsonReader.beginObject();
            wy1 wy1Var = null;
            Long l7 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l7 = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    t04 t04Var2 = new t04();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        t04Var2.g(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    m7 = t04Var2.j();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l7 != null && !m7.isEmpty()) {
                long longValue = l7.longValue();
                int[] iArr = new int[m7.size()];
                for (int i8 = 0; i8 < m7.size(); i8++) {
                    iArr[i8] = ((Integer) m7.get(i8)).intValue();
                }
                wy1Var = new wy1(longValue, iArr);
            }
            if (wy1Var != null) {
                t04Var.g(wy1Var);
            }
        }
        jsonReader.endArray();
        return t04Var.j();
    }
}
