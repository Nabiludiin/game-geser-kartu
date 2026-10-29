package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class n03 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12529a;

    /* renamed from: b, reason: collision with root package name */
    public final f03 f12530b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12531c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f12532d;

    n03(JsonReader jsonReader, Bundle bundle) {
        this.f12532d = bundle;
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && bundle != null) {
            bundle.putLong(yw1.SERVER_RESPONSE_PARSE_START.c(), r2.t.o().a());
        }
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        f03 f03Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        list = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            list.add(new c03(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        f03Var = new f03(jsonReader);
                        if (((Boolean) s2.b0.c().d(uy.f17232w2)).booleanValue() && bundle != null) {
                            bundle.putLong(yw1.NORMALIZATION_AD_RESPONSE_START.c(), f03Var.f7943s);
                            bundle.putLong(yw1.NORMALIZATION_AD_RESPONSE_END.c(), f03Var.f7944t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = v2.r0.d(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new m03(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f12531c = arrayList;
        this.f12529a = list;
        this.f12530b = f03Var == null ? new f03(new JsonReader(new StringReader("{}"))) : f03Var;
    }

    public static n03 a(Reader reader, Bundle bundle) {
        try {
            try {
                return new n03(new JsonReader(reader), bundle);
            } finally {
                com.google.android.gms.common.util.l.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e8) {
            throw new g03("unable to parse ServerResponse", e8);
        }
    }
}
