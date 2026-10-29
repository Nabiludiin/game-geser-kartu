package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class ey1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f7866a;

    public ey1(com.google.android.gms.common.util.e eVar) {
        this.f7866a = eVar;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) y00.f19324a.e()).booleanValue()) {
            long a8 = this.f7866a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a8);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj = objArr[i7];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e8) {
                int i8 = v2.n1.f26802b;
                w2.p.d("unable to log", e8);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i9 = v2.n1.f26802b;
            w2.p.e("AD-DBG ".concat(valueOf));
        }
    }
}
