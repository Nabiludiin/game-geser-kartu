package p4;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import x4.c;

/* compiled from: MyApplication */
final class k3 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f25430a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f25431b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f25432c;

    /* renamed from: d, reason: collision with root package name */
    private final r f25433d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f25434e;

    /* renamed from: f, reason: collision with root package name */
    private final z2 f25435f;

    /* renamed from: g, reason: collision with root package name */
    private final n3 f25436g;

    /* renamed from: h, reason: collision with root package name */
    private final s2 f25437h;

    k3(Application application, e eVar, Handler handler, Executor executor, r rVar, l0 l0Var, z2 z2Var, n3 n3Var, s2 s2Var) {
        this.f25430a = application;
        this.f25431b = handler;
        this.f25432c = executor;
        this.f25433d = rVar;
        this.f25434e = l0Var;
        this.f25435f = z2Var;
        this.f25436g = n3Var;
        this.f25437h = s2Var;
    }

    public static /* synthetic */ void a(final k3 k3Var, Activity activity, x4.d dVar, final c.b bVar, final c.a aVar) {
        try {
            x4.a a8 = dVar.a();
            if (a8 != null) {
                if (!a8.b()) {
                }
                final c a9 = new m3(k3Var.f25436g, k3Var.d(k3Var.f25435f.c(activity, dVar))).a();
                r rVar = k3Var.f25433d;
                rVar.e(a9.f25302a);
                rVar.g(a9.f25303b);
                k3Var.f25434e.d(a9.f25304c);
                k3Var.f25437h.a().execute(new Runnable() { // from class: p4.i3
                    @Override // java.lang.Runnable
                    public final void run() {
                        k3.b(k3.this, bVar, a9);
                    }
                });
            }
            Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + k1.a(k3Var.f25430a) + "\") to set this as a debug device.");
            final c a92 = new m3(k3Var.f25436g, k3Var.d(k3Var.f25435f.c(activity, dVar))).a();
            r rVar2 = k3Var.f25433d;
            rVar2.e(a92.f25302a);
            rVar2.g(a92.f25303b);
            k3Var.f25434e.d(a92.f25304c);
            k3Var.f25437h.a().execute(new Runnable() { // from class: p4.i3
                @Override // java.lang.Runnable
                public final void run() {
                    k3.b(k3.this, bVar, a92);
                }
            });
        } catch (RuntimeException e8) {
            final u2 u2Var = new u2(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e8))));
            k3Var.f25431b.post(new Runnable() { // from class: p4.g3
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(u2Var.a());
                }
            });
        } catch (u2 e9) {
            k3Var.f25431b.post(new Runnable() { // from class: p4.f3
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.this.a(e9.a());
                }
            });
        }
    }

    public static /* synthetic */ void b(k3 k3Var, final c.b bVar, c cVar) {
        Objects.requireNonNull(bVar);
        k3Var.f25431b.post(new Runnable() { // from class: p4.h3
            @Override // java.lang.Runnable
            public final void run() {
                c.b.this.a();
            }
        });
        if (cVar.f25303b != c.EnumC0147c.NOT_REQUIRED) {
            k3Var.f25434e.c();
        }
    }

    private final j1 d(h1 h1Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f25430a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = h1Var.f25374a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    d1 d1Var = h1Var.f25375b;
                    if (d1Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i7 = d1Var.f25323c;
                        if (i7 != 1) {
                            jsonWriter.name("os_type");
                            int i8 = i7 - 1;
                            if (i8 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i8 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = d1Var.f25321a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = d1Var.f25322b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = h1Var.f25376c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = h1Var.f25377d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = h1Var.f25378e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    f1 f1Var = h1Var.f25379f;
                    if (f1Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = f1Var.f25356a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = f1Var.f25357b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d8 = f1Var.f25358c;
                        if (d8 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d8);
                        }
                        List<e1> list = f1Var.f25359d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (e1 e1Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = e1Var.f25342a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = e1Var.f25343b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = e1Var.f25344c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = e1Var.f25345d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    b1 b1Var = h1Var.f25380g;
                    if (b1Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = b1Var.f25298a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = b1Var.f25299b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = b1Var.f25300c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    g1 g1Var = h1Var.f25381h;
                    if (g1Var != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = g1Var.f25366a;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = h1Var.f25382i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((c1) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        j1 a8 = j1.a(new JsonReader(new StringReader(headerField)));
                        a8.f25414a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a8;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            j1 a9 = j1.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return a9;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e8) {
            throw new u2(4, "The server timed out.", e8);
        } catch (IOException e9) {
            throw new u2(2, "Error making request.", e9);
        }
    }

    final void c(final Activity activity, final x4.d dVar, final c.b bVar, final c.a aVar) {
        this.f25432c.execute(new Runnable() { // from class: p4.j3
            @Override // java.lang.Runnable
            public final void run() {
                k3.a(k3.this, activity, dVar, bVar, aVar);
            }
        });
    }
}
