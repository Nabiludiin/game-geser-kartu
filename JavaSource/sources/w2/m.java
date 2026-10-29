package w2;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: MyApplication */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f27081c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f27082d = false;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f27085g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f27086a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f27080b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.common.util.e f27083e = com.google.android.gms.common.util.h.d();

    /* renamed from: f, reason: collision with root package name */
    private static final Set f27084f = new HashSet(Arrays.asList(new String[0]));

    public m(String str) {
        this.f27086a = !j() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static void g() {
        synchronized (f27080b) {
            f27081c = false;
            f27082d = false;
            p.f("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z7) {
        synchronized (f27080b) {
            f27081c = true;
            f27082d = z7;
        }
    }

    public static boolean i() {
        boolean z7;
        synchronized (f27080b) {
            z7 = f27081c;
        }
        return z7;
    }

    public static boolean j() {
        boolean z7;
        synchronized (f27080b) {
            try {
                z7 = false;
                if (f27081c && f27082d) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    static /* synthetic */ void k(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        p(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void l(int i7, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i7);
        jsonWriter.endObject();
        p(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void m(final String str, final String str2, final Map map, final byte[] bArr) {
        q("onNetworkRequest", new l() { // from class: w2.k
            @Override // w2.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) {
                m.k(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void n(final Map map, final int i7) {
        q("onNetworkResponse", new l() { // from class: w2.h
            @Override // w2.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) {
                m.l(i7, map, jsonWriter);
            }
        });
    }

    private final void o(final String str) {
        q("onNetworkRequestError", new l() { // from class: w2.j
            @Override // w2.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) {
                int i7 = m.f27085g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void p(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f27084f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        p.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void q(String str, l lVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f27083e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f27086a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            p.d("unable to log", e8);
        }
        r(stringWriter.toString());
    }

    private static synchronized void r(String str) {
        synchronized (m.class) {
            try {
                p.e("GMA Debug BEGIN");
                int i7 = 0;
                while (i7 < str.length()) {
                    int i8 = i7 + 4000;
                    p.e("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i7, Math.min(i8, str.length())))));
                    i7 = i8;
                }
                p.e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map map, byte[] bArr) {
        if (j()) {
            m(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i7) {
        if (j()) {
            String str = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i7);
            if (i7 < 200 || i7 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e8) {
                    p.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
                }
                o(str);
            }
        }
    }

    public final void d(Map map, int i7) {
        if (j()) {
            n(map, i7);
            if (i7 < 200 || i7 >= 300) {
                o(null);
            }
        }
    }

    public final void e(String str) {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(final byte[] bArr) {
        q("onNetworkResponseBody", new l() { // from class: w2.i
            @Override // w2.l
            public final /* synthetic */ void a(JsonWriter jsonWriter) {
                int i7 = m.f27085g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String a8 = com.google.android.gms.common.util.c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(a8);
                } else {
                    String o7 = g.o(a8);
                    if (o7 != null) {
                        jsonWriter.name("bodydigest").value(o7);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
