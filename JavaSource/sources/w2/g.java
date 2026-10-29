package w2;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.fc3;
import com.google.android.gms.internal.ads.of3;
import com.google.android.gms.internal.ads.uy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.b0;
import s2.g5;

/* compiled from: MyApplication */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f27064b = new of3(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f27065c = k2.i.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f27066d = x2.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f27067e = l2.b.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f27068f = l2.c.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f27069g = fc3.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private static final String f27070h = k2.f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f27071a = -1.0f;

    public static final boolean A(Context context, int i7) {
        return k3.h.h().j(context, i7) == 0;
    }

    public static final boolean B(Context context) {
        int j7 = k3.h.h().j(context, k3.k.f24503a);
        return j7 == 0 || j7 == 2;
    }

    public static final boolean C() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int a(DisplayMetrics displayMetrics, int i7) {
        return Math.round(i7 / displayMetrics.density);
    }

    public static final void b(Context context, String str, String str2, Bundle bundle, boolean z7, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int b8 = k3.h.h().b(context);
            StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 10);
            sb.append(b8);
            sb.append(".253830000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.b(appendQueryParameter.toString());
    }

    public static final int c(Context context, int i7) {
        return x(context.getResources().getDisplayMetrics(), i7);
    }

    public static final String d(Context context) {
        uy.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || z()) {
            string = "emulator";
        }
        return e(string, "MD5");
    }

    private static String e(String str, String str2) {
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray f(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void g(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(u((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(s((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(f((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(v((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void h(JSONObject jSONObject, String str, Object obj) {
        if (((Boolean) b0.c().d(uy.f17189r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, u((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, s((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), f((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, f(Arrays.asList((Object[]) obj)));
            return;
        }
        int i7 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i7 < length) {
                numArr[i7] = Integer.valueOf(iArr[i7]);
                i7++;
            }
            jSONObject.put(str, v(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i7 < length2) {
                dArr2[i7] = Double.valueOf(dArr[i7]);
                i7++;
            }
            jSONObject.put(str, v(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i7 < length3) {
                lArr[i7] = Long.valueOf(jArr[i7]);
                i7++;
            }
            jSONObject.put(str, v(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i7 < length4) {
            boolArr[i7] = Boolean.valueOf(zArr[i7]);
            i7++;
        }
        jSONObject.put(str, v(boolArr));
    }

    private static final void i(ViewGroup viewGroup, g5 g5Var, String str, int i7, int i8) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i7);
        textView.setBackgroundColor(i8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i7);
        int c8 = c(context, 3);
        int i9 = g5Var.f26100v;
        int i10 = g5Var.f26097s;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i9 - c8, i10 - c8, 17));
        viewGroup.addView(frameLayout, i9, i10);
    }

    public static Object m(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static ActivityManager.MemoryInfo n(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            p.f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static String o(String str) {
        return e(str, "MD5");
    }

    public static String p(String str) {
        return e(str, "SHA-256");
    }

    public static String r() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) f10.f7958d.e());
    }

    public static final int x(DisplayMetrics displayMetrics, int i7) {
        return (int) TypedValue.applyDimension(1, i7, displayMetrics);
    }

    public static final String y(StackTraceElement[] stackTraceElementArr, String str) {
        int i7;
        int i8;
        String str2;
        while (true) {
            i8 = i7 + 1;
            if (i8 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i7];
            String className = stackTraceElement.getClassName();
            i7 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f27065c.equalsIgnoreCase(className) || f27066d.equalsIgnoreCase(className) || f27067e.equalsIgnoreCase(className) || f27068f.equalsIgnoreCase(className) || f27069g.equalsIgnoreCase(className) || f27070h.equalsIgnoreCase(className))) ? 0 : i8;
        }
        str2 = stackTraceElementArr[i8].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i9 = 2; i9 > 0 && stringTokenizer.hasMoreElements(); i9--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean z() {
        boolean booleanValue = ((Boolean) b0.c().d(uy.vc)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public final int j(Context context, int i7) {
        if (this.f27071a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f27071a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f27071a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i7 / this.f27071a);
    }

    public final void k(ViewGroup viewGroup, g5 g5Var, String str, String str2) {
        if (str2 != null) {
            p.f(str2);
        }
        i(viewGroup, g5Var, str, -65536, -16777216);
    }

    public final void l(ViewGroup viewGroup, g5 g5Var, String str) {
        i(viewGroup, g5Var, "Ads by Google", -16777216, -1);
    }

    public final void q(final Context context, String str, String str2, Bundle bundle, boolean z7) {
        b(context, str, "gmob-apps", bundle, true, new f() { // from class: w2.e
            @Override // w2.f
            public final /* synthetic */ u b(String str3) {
                new d(g.this, context, str3).start();
                return u.SUCCESS;
            }
        });
    }

    public final JSONObject s(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                h(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e8) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e8.getMessage())));
        }
    }

    public final JSONObject t(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return u(bundle);
            } catch (JSONException e8) {
                p.d("Error converting Bundle to JSON", e8);
            }
        }
        return null;
    }

    public final JSONObject u(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            h(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    final JSONArray v(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            g(jSONArray, obj);
        }
        return jSONArray;
    }
}
