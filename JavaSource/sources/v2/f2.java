package v2;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.c95;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.dr0;
import com.google.android.gms.internal.ads.ex3;
import com.google.android.gms.internal.ads.f03;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.gy3;
import com.google.android.gms.internal.ads.iy3;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.nu1;
import com.google.android.gms.internal.ads.of3;
import com.google.android.gms.internal.ads.oh0;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.rx1;
import com.google.android.gms.internal.ads.tt0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.wz;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class f2 {

    /* renamed from: l, reason: collision with root package name */
    public static final of3 f26746l = new o1(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private String f26753g;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f26754h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f26747a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f26748b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f26749c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f26750d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private boolean f26751e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f26752f = new Object();

    /* renamed from: i, reason: collision with root package name */
    private boolean f26755i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26756j = false;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f26757k = Executors.newSingleThreadExecutor();

    public static int A(int i7) {
        if (i7 >= 5000) {
            return i7;
        }
        if (i7 <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i7);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        String sb2 = sb.toString();
        int i8 = n1.f26802b;
        w2.p.f(sb2);
        return 60000;
    }

    public static final void B(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            e0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i7 = n1.f26802b;
            w2.p.a(sb2);
        } catch (ActivityNotFoundException e8) {
            int i8 = n1.f26802b;
            w2.p.d("No browser is found.", e8);
        }
    }

    public static final int[] C(Activity activity) {
        int[] w7 = w(activity);
        return new int[]{s2.z.a().j(activity, w7[0]), s2.z.a().j(activity, w7[1])};
    }

    public static final boolean D(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return y(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, F(context));
    }

    public static final void E(Context context, Intent intent, rx1 rx1Var, String str) {
        if (!((Boolean) s2.b0.c().d(uy.ge)).booleanValue() || !(context instanceof tt0)) {
            z(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) s2.b0.c().d(uy.ie))) {
                    ((tt0) context).a(intent, 236);
                    if (!((Boolean) s2.b0.c().d(uy.he)).booleanValue() || rx1Var == null) {
                        return;
                    }
                    qx1 a8 = rx1Var.a();
                    a8.c("action", "hila");
                    a8.c("gqi", iy3.a(str));
                    a8.f();
                    return;
                }
            }
            z(context, intent);
        } catch (ActivityNotFoundException e8) {
            e = e8;
            int i7 = n1.f26802b;
            w2.p.d("Error occurred while starting activity for result", e);
            r2.t.l().i(e, "AdUtil.startActivityForResult");
            z(context, intent);
        } catch (SecurityException e9) {
            e = e9;
            int i72 = n1.f26802b;
            w2.p.d("Error occurred while starting activity for result", e);
            r2.t.l().i(e, "AdUtil.startActivityForResult");
            z(context, intent);
        } catch (Exception e10) {
            int i8 = n1.f26802b;
            w2.p.d("Error occurred while starting activity for result", e10);
            r2.t.l().i(e10, "AdUtil.startActivityForResult");
            z(context, intent);
        }
    }

    private static KeyguardManager F(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean G(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String H(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static Bundle I(Context context) {
        try {
            return u3.e.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
            n1.l("Error getting metadata", e8);
            return null;
        }
    }

    private static final void J(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(d.C0013d c0013d, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i7 = bundle.getInt("h", -1);
        if (i7 >= 0) {
            c0013d.d(i7);
        }
        int i8 = bundle.getInt("cbp", -1);
        if (i8 < 0 || i8 > 2) {
            return;
        }
        c0013d.b(i8);
    }

    private static final void L(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String M(final Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return g0();
        }
        try {
            h1 a8 = h1.a();
            if (TextUtils.isEmpty(a8.f26771a)) {
                if (com.google.android.gms.common.util.d.a()) {
                    str3 = (String) e1.a(context, new Callable() { // from class: v2.f1
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                n1.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            n1.k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            com.google.android.gms.common.util.r.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context d8 = k3.k.d(context);
                    str3 = (String) e1.a(context, new Callable() { // from class: v2.g1
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = d8;
                            Context context3 = context;
                            boolean z7 = false;
                            if (context2 != null) {
                                n1.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                n1.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z7 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            n1.k("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z7) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                n1.k("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                a8.f26771a = str3;
            }
            str2 = a8.f26771a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = g0();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 10 + str.length());
        sb.append(str2);
        sb.append(" (Mobile; ");
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (u3.e.a(context).g()) {
                StringBuilder sb3 = new StringBuilder(sb2.length() + 4);
                sb3.append(sb2);
                sb3.append(";aia");
                sb2 = sb3.toString();
            }
        } catch (Exception e8) {
            r2.t.l().i(e8, "AdUtil.getUserAgent");
        }
        return sb2.concat(")");
    }

    public static void T(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            cm0.f6500a.execute(runnable);
        }
    }

    public static List W() {
        ly lyVar = uy.f17045a;
        List f8 = s2.b0.b().f();
        ArrayList arrayList = new ArrayList();
        Iterator it = f8.iterator();
        while (it.hasNext()) {
            Iterator it2 = gy3.a(ex3.b(',')).d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    n1.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static String X(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7++) {
            charArray[i7] = (char) (charArray[i7] ^ str2.charAt(i7 % str2.length()));
        }
        return new String(charArray);
    }

    public static z1 Y(Context context) {
        LocaleList locales;
        Locale locale;
        LocaleList systemLocales;
        boolean isEmpty;
        LocaleList systemLocales2;
        Locale locale2;
        z1 z1Var = new z1(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            if (i7 < 24) {
                Locale locale3 = context.getResources().getConfiguration().locale;
                return new z1(locale3.getLanguage(), locale3.getCountry());
            }
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return new z1(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager a8 = c2.a(context.getSystemService(b2.a()));
        if (a8 == null) {
            return z1Var;
        }
        systemLocales = a8.getSystemLocales();
        isEmpty = systemLocales.isEmpty();
        if (isEmpty) {
            return z1Var;
        }
        systemLocales2 = a8.getSystemLocales();
        locale2 = systemLocales2.get(0);
        return new z1(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long a(View view) {
        float f8 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f8 = Math.min(f8, view2.getAlpha());
            view = view2.getParent();
        } while (f8 > 0.0f);
        return Math.round((f8 >= 0.0f ? f8 : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", r2.t.g().Q(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new n0(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e8) {
            int i7 = n1.f26802b;
            w2.p.g("Could not fetch MRAID JS.", e8);
        }
        return null;
    }

    public static final String c() {
        Resources h8 = r2.t.l().h();
        return h8 != null ? h8.getString(p2.d.f25110t) : "Test Ad";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.f2.c0(android.view.View):boolean");
    }

    public static final q0 d(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(iBinder);
            }
            int i7 = n1.f26802b;
            w2.p.c("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e8) {
            r2.t.l().i(e8, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean d0(final Context context, final WebSettings webSettings) {
        e1.a(context, new Callable() { // from class: v2.w1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                of3 of3Var = f2.f26746l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) s2.b0.c().d(uy.f17065c1)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final boolean e(Context context, String str) {
        Context a8 = oh0.a(context);
        return u3.e.a(a8).b(str, a8.getPackageName()) == 0;
    }

    public static final void e0(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final boolean f(Context context) {
        try {
            return com.google.android.gms.common.util.i.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final String f0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return H(I(context));
    }

    public static final boolean g(String str) {
        if (!w2.m.j()) {
            return false;
        }
        if (!((Boolean) s2.b0.c().d(uy.L5)).booleanValue()) {
            return false;
        }
        String str2 = (String) s2.b0.c().d(uy.N5);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) s2.b0.c().d(uy.M5);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static final String g0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final boolean h(Context context) {
        KeyguardManager F;
        return (context == null || (F = F(context)) == null || !F.isKeyguardLocked()) ? false : true;
    }

    public static final String h0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final boolean i(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i7 = n1.f26802b;
            w2.p.d("Error loading class.", th);
            r2.t.l().i(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final Integer i0(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final boolean j() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final DisplayMetrics j0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final boolean k(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    protected static final int[] k0() {
        return new int[]{0, 0};
    }

    public static final boolean l(Context context) {
        try {
            Bundle I = I(context);
            String string = I.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(H(I))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final Map l0(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        String optString = optJSONArray.optString(i7);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e8) {
            r2.t.l().i(e8, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final boolean m(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void n(View view, int i7, MotionEvent motionEvent) {
        String str;
        int i8;
        int i9;
        int i10;
        char c8;
        char c9;
        String str2;
        c03 T;
        f03 t02;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof nu1) {
                view2 = ((nu1) view2).getChildAt(0);
            }
            if (view2 instanceof com.google.android.gms.ads.nativead.d) {
                str = "NATIVE";
                i8 = 1;
            } else {
                str = "UNKNOWN";
                i8 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i10 = rect.width();
                i9 = rect.height();
            } else {
                i9 = 0;
                i10 = 0;
            }
            r2.t.g();
            long a8 = a(view2);
            view2.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof vs0) || (t02 = ((vs0) view2).t0()) == null) {
                c8 = 0;
                c9 = 1;
                str2 = "none";
            } else {
                str2 = t02.f7926b;
                c8 = 0;
                int hashCode = view2.hashCode();
                c9 = 1;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str2);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if ((view2 instanceof dr0) && (T = ((dr0) view2).T()) != null) {
                str = c03.a(T.f6152b);
                i8 = T.f6158e;
                str3 = T.E;
            }
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(view2.hashCode());
            Integer valueOf2 = Integer.valueOf(i8);
            String name = view2.getClass().getName();
            Integer valueOf3 = Integer.valueOf(i11);
            Integer valueOf4 = Integer.valueOf(i12);
            Integer valueOf5 = Integer.valueOf(view2.getWidth());
            Integer valueOf6 = Integer.valueOf(view2.getHeight());
            Integer valueOf7 = Integer.valueOf(i10);
            Integer valueOf8 = Integer.valueOf(i9);
            Long valueOf9 = Long.valueOf(a8);
            String num = Integer.toString(i7, 2);
            Object[] objArr = new Object[15];
            objArr[c8] = valueOf;
            objArr[c9] = packageName;
            objArr[2] = str3;
            objArr[3] = str2;
            objArr[4] = str;
            objArr[5] = valueOf2;
            objArr[6] = name;
            objArr[7] = valueOf3;
            objArr[8] = valueOf4;
            objArr[9] = valueOf5;
            objArr[10] = valueOf6;
            objArr[11] = valueOf7;
            objArr[12] = valueOf8;
            objArr[13] = valueOf9;
            objArr[14] = num;
            String format = String.format(locale, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", objArr);
            int i13 = n1.f26802b;
            w2.p.e(format);
        } catch (Exception e8) {
            int i14 = n1.f26802b;
            w2.p.d("Failure getting view location.", e8);
        }
    }

    public static final AlertDialog.Builder o(Context context) {
        r2.t.j();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void p(Context context, String str, String str2) {
        new v0(context, str, str2, null, null).b();
    }

    public static final void q(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) f10.f7956b.e()).booleanValue()) {
                com.google.android.gms.common.util.g.a(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void r(Context context, c03 c03Var, rx1 rx1Var) {
        qx1 a8 = rx1Var.a();
        a8.c("action", "can_show");
        r2.t.g();
        a8.c("foreground", true != k(context) ? "1" : "0");
        a8.c("fg_al", true == r2.t.k().f() ? "1" : "0");
        if (c03Var != null) {
            List list = c03Var.f6188t;
            if (!list.isEmpty()) {
                a8.c("ancn", (String) list.get(0));
            }
            a8.c("ad_format", c03.a(c03Var.f6152b));
        }
        a8.d();
    }

    public static final boolean s(c03 c03Var) {
        return ((Boolean) s2.b0.c().d(uy.ue)).booleanValue() && c03Var != null && c03Var.f6158e == 4;
    }

    public static final int t(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            String concat = "Could not parse value:".concat(e8.toString());
            int i7 = n1.f26802b;
            w2.p.f(concat);
            return 0;
        }
    }

    public static final Map u(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) s2.b0.c().d(uy.f17197s)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i7 = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i7);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i7);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i7, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i7 = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] w(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? k0() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] x(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] k02 = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? k0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{s2.z.a().j(activity, k02[0]), s2.z.a().j(activity, k02[1])};
    }

    public static final boolean y(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z7 = r2.t.g().f26751e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || c0(view);
        long a8 = a(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z7)) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.D1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.Eb)).booleanValue()) {
            if (a8 < ((Integer) s2.b0.c().d(uy.Gb)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void z(Context context, Intent intent) {
        if (!((Boolean) s2.b0.c().d(uy.bc)).booleanValue()) {
            L(context, intent);
            return;
        }
        try {
            L(context, intent);
        } catch (SecurityException e8) {
            int i7 = n1.f26802b;
            w2.p.g("", e8);
            r2.t.l().i(e8, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public final void N(Context context, String str, boolean z7, HttpURLConnection httpURLConnection, boolean z8, int i7) {
        int A = A(i7);
        StringBuilder sb = new StringBuilder(String.valueOf(A).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(A);
        sb.append(" milliseconds.");
        String sb2 = sb.toString();
        int i8 = n1.f26802b;
        w2.p.e(sb2);
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", Q(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean O(Context context) {
        if (this.f26755i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        uy.a(context);
        if (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new a2(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new a2(this, null), intentFilter, 4);
        }
        this.f26755i = true;
        return true;
    }

    public final boolean P(Context context) {
        if (this.f26756j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        uy.a(context);
        byte[] bArr = null;
        if (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new y1(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new y1(this, bArr), intentFilter, 4);
        }
        this.f26756j = true;
        return true;
    }

    public final String Q(Context context, String str) {
        if (((Boolean) s2.b0.c().d(uy.nc)).booleanValue()) {
            if (this.f26754h != null) {
                return this.f26754h;
            }
            this.f26754h = M(context, str);
            return this.f26754h;
        }
        synchronized (this.f26752f) {
            try {
                String str2 = this.f26753g;
                if (str2 != null) {
                    return str2;
                }
                String M = M(context, str);
                this.f26753g = M;
                return M;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a5.d R(final Uri uri) {
        return p64.d(new Callable() { // from class: v2.x1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                of3 of3Var = f2.f26746l;
                r2.t.g();
                return f2.u(uri);
            }
        }, this.f26757k);
    }

    public final void S(final Context context, final String str, String str2, Bundle bundle, boolean z7) {
        r2.t.g();
        bundle.putString("device", h0());
        ly lyVar = uy.f17045a;
        bundle.putString("eids", TextUtils.join(",", s2.b0.b().e()));
        if (bundle.isEmpty()) {
            int i7 = n1.f26802b;
            w2.p.a("Empty or null bundle.");
        } else {
            final String str3 = (String) s2.b0.c().d(uy.Cb);
            if (!this.f26750d.getAndSet(true)) {
                this.f26749c.set(d.c(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: v2.v1
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        f2.this.Z(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f26749c.get());
        }
        s2.z.a();
        w2.g.b(context, str, "gmob-apps", bundle, true, new w2.f() { // from class: v2.u1
            @Override // w2.f
            public final /* synthetic */ w2.u b(String str4) {
                of3 of3Var = f2.f26746l;
                r2.t.g();
                f2.p(context, str, str4);
                return w2.u.SUCCESS;
            }
        });
    }

    public final boolean U(String str) {
        return G(str, this.f26747a, (String) s2.b0.c().d(uy.f17238x0));
    }

    public final boolean V(String str) {
        return G(str, this.f26748b, (String) s2.b0.c().d(uy.f17246y0));
    }

    final /* synthetic */ void Z(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f26749c.set(d.b(context, str));
    }

    final /* synthetic */ void a0(boolean z7) {
        this.f26751e = z7;
    }

    public final int b0(Context context, Uri uri, Bundle bundle) {
        if (context == null) {
            n1.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            J(context, uri);
            return 2;
        }
        if (!((Boolean) s2.b0.c().d(uy.f17123i5)).booleanValue()) {
            if (!((Boolean) s2.b0.c().d(uy.f17105g5)).booleanValue()) {
                J(context, uri);
                return 9;
            }
            wz wzVar = new wz();
            wzVar.d(new t1(this, wzVar, bundle, context, uri));
            wzVar.e((Activity) context);
            return 5;
        }
        d.C0013d c0013d = new d.C0013d(r2.t.r().d());
        K(c0013d, bundle);
        androidx.browser.customtabs.d a8 = c0013d.a();
        if (((Boolean) s2.b0.c().d(uy.f17227v5)).booleanValue()) {
            s2.z.a();
            if (w2.g.z()) {
                return 5;
            }
        }
        a8.f1034a.setPackage(c95.a(context));
        a8.a(context, uri);
        return 5;
    }
}
