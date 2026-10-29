package c6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* compiled from: MyApplication */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f3603a = new StringBuilder();

    /* compiled from: MyApplication */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* compiled from: MyApplication */
    private static class b {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* compiled from: MyApplication */
    private static class c {
        static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* compiled from: MyApplication */
    private static class d {
        static j a(Context context) {
            return new s(context);
        }
    }

    /* compiled from: MyApplication */
    private static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: MyApplication */
    static class f implements ThreadFactory {
        f() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    static long a(File file) {
        long j7;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j7 = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            j7 = 5242880;
        }
        return Math.max(Math.min(j7, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) p(context, "activity");
        boolean z7 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z7) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    static void c() {
        if (!s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static void e(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static j g(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new d0(context);
        }
    }

    static String h(w wVar) {
        StringBuilder sb = f3603a;
        String i7 = i(wVar, sb);
        sb.setLength(0);
        return i7;
    }

    static String i(w wVar, StringBuilder sb) {
        String str = wVar.f3721f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(wVar.f3721f);
        } else {
            Uri uri = wVar.f3719d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(wVar.f3720e);
            }
        }
        sb.append('\n');
        if (wVar.f3728m != 0.0f) {
            sb.append("rotation:");
            sb.append(wVar.f3728m);
            if (wVar.f3731p) {
                sb.append('@');
                sb.append(wVar.f3729n);
                sb.append('x');
                sb.append(wVar.f3730o);
            }
            sb.append('\n');
        }
        if (wVar.c()) {
            sb.append("resize:");
            sb.append(wVar.f3723h);
            sb.append('x');
            sb.append(wVar.f3724i);
            sb.append('\n');
        }
        if (wVar.f3725j) {
            sb.append("centerCrop");
            sb.append('\n');
        } else if (wVar.f3726k) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List list = wVar.f3722g;
        if (list == null || list.size() <= 0) {
            return sb.toString();
        }
        android.support.v4.media.session.b.a(wVar.f3722g.get(0));
        throw null;
    }

    static void j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int k(Bitmap bitmap) {
        int a8 = c.a(bitmap);
        if (a8 >= 0) {
            return a8;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String l(c6.c cVar) {
        return m(cVar, "");
    }

    static String m(c6.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        c6.a h8 = cVar.h();
        if (h8 != null) {
            sb.append(h8.f3543b.d());
        }
        List i7 = cVar.i();
        if (i7 != null) {
            int size = i7.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (i8 > 0 || h8 != null) {
                    sb.append(", ");
                }
                sb.append(((c6.a) i7.get(i8)).f3543b.d());
            }
        }
        return sb.toString();
    }

    static int n(Resources resources, w wVar) {
        Uri uri;
        int i7 = wVar.f3720e;
        if (i7 != 0 || (uri = wVar.f3719d) == null) {
            return i7;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f3719d);
        }
        List<String> pathSegments = wVar.f3719d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + wVar.f3719d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f3719d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + wVar.f3719d);
    }

    static Resources o(Context context, w wVar) {
        Uri uri;
        if (wVar.f3720e != 0 || (uri = wVar.f3719d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f3719d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f3719d);
        }
    }

    static Object p(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean r(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    static void u(String str, String str2, String str3) {
        v(str, str2, str3, "");
    }

    static void v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    static boolean w(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(split[0])) {
                if (Integer.parseInt(split[1]) == 304) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    static byte[] x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
