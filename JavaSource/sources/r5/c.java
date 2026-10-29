package r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.util.k;
import com.google.firebase.installations.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import n5.i;
import org.json.JSONException;
import org.json.JSONObject;
import p3.o;
import r5.d;
import r5.f;
import w4.l;

/* compiled from: MyApplication */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f25883d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f25884e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f25885a;

    /* renamed from: b, reason: collision with root package name */
    private final o5.b f25886b;

    /* renamed from: c, reason: collision with root package name */
    private final e f25887c = new e();

    public c(Context context, o5.b bVar) {
        this.f25885a = context;
        this.f25886b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private String f() {
        try {
            Context context = this.f25885a;
            byte[] a8 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a8 != null) {
                return k.b(a8, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f25885a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("ContentValues", "No such package: " + this.f25885a.getPackageName(), e8);
            return null;
        }
    }

    private URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e8) {
            throw new com.google.firebase.installations.c(e8.getMessage(), c.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o7 = o(httpURLConnection);
        if (TextUtils.isEmpty(o7)) {
            return;
        }
        Log.w("Firebase-Installations", o7);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f25885a.getPackageName());
            i iVar = (i) this.f25886b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) l.a(iVar.a()));
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e8);
                } catch (ExecutionException e9) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e9);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
    }

    static long m(String str) {
        o.b(f25883d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25884e));
        f.a a8 = f.a();
        d.a a9 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a9.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a9.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a9.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a8.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a8.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a9.b(a8.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a9.e(d.b.OK).a();
    }

    private static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f25884e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private f p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f25884e));
        f.a a8 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a8.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a8.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a8.b(f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        d n7;
        if (!this.f25887c.b()) {
            throw new com.google.firebase.installations.c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        URL g8 = g(String.format("projects/%s/installations", str3));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection l7 = l(g8, str);
            try {
                try {
                    l7.setRequestMethod("POST");
                    l7.setDoOutput(true);
                    if (str5 != null) {
                        l7.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l7, str2, str4);
                    responseCode = l7.getResponseCode();
                    this.f25887c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    n7 = n(l7);
                } else {
                    k(l7, str4, str, str3);
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", c.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        n7 = d.a().e(d.b.BAD_CONFIG).a();
                    }
                    l7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                l7.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n7;
            } catch (Throwable th) {
                l7.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new com.google.firebase.installations.c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) {
        int responseCode;
        f p7;
        if (!this.f25887c.b()) {
            throw new com.google.firebase.installations.c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        URL g8 = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection l7 = l(g8, str);
            try {
                try {
                    l7.setRequestMethod("POST");
                    l7.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l7.setDoOutput(true);
                    r(l7);
                    responseCode = l7.getResponseCode();
                    this.f25887c.f(responseCode);
                } finally {
                    l7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (i(responseCode)) {
                p7 = p(l7);
            } else {
                k(l7, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    p7 = f.a().b(f.b.AUTH_ERROR).a();
                } else {
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", c.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        p7 = f.a().b(f.b.BAD_CONFIG).a();
                    }
                }
            }
            return p7;
        }
        throw new com.google.firebase.installations.c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
    }
}
