package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* compiled from: MyApplication */
public final class e03 {

    /* renamed from: a, reason: collision with root package name */
    private String f7383a;

    e03(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    jsonReader.nextInt();
                }
                jsonReader.skipValue();
            } else if (nextName.equals("description")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f7383a = str;
    }

    public final String a() {
        return this.f7383a;
    }
}
