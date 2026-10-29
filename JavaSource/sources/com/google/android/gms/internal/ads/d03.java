package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class d03 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6892c;

    public d03(int i7, int i8, boolean z7) {
        this.f6890a = i7;
        this.f6891b = i8;
        this.f6892c = z7;
    }

    static List a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i7 = 0;
            int i8 = 0;
            boolean z7 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i7 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i8 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z7 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new d03(i7, i8, z7));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
