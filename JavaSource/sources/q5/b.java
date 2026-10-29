package q5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import c5.e;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f25675c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25676a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25677b;

    public b(e eVar) {
        this.f25676a = eVar.j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f25677b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(e eVar) {
        String d8 = eVar.m().d();
        if (d8 != null) {
            return d8;
        }
        String c8 = eVar.m().c();
        if (!c8.startsWith("1:") && !c8.startsWith("2:")) {
            return c8;
        }
        String[] split = c8.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e8) {
            Log.w("ContentValues", "Invalid key stored " + e8);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f25676a) {
            string = this.f25676a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f25676a) {
            try {
                String string = this.f25676a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e8 = e(string);
                if (e8 == null) {
                    return null;
                }
                return c(e8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.f25676a) {
            try {
                String g8 = g();
                if (g8 != null) {
                    return g8;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f25676a) {
            try {
                for (String str : f25675c) {
                    String string = this.f25676a.getString(a(this.f25677b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
