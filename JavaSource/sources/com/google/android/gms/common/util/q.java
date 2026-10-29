package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: MyApplication */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static String f4565a;

    /* renamed from: b, reason: collision with root package name */
    private static int f4566b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f4567c;

    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f4565a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f4565a = processName;
            } else {
                int i7 = f4566b;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f4566b = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        String str2 = "/proc/" + i7 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                p3.o.m(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                l.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    l.a(bufferedReader);
                }
                f4565a = str;
            }
        }
        return f4565a;
    }

    public static boolean b() {
        boolean isIsolated;
        Boolean bool = f4567c;
        if (bool == null) {
            if (n.g()) {
                isIsolated = Process.isIsolated();
                bool = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object a8 = o4.h.a(Process.class, "isIsolated", new o4.g[0]);
                    Object[] objArr = new Object[0];
                    if (a8 == null) {
                        throw new o4.c(o4.b.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) a8;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f4567c = bool;
        }
        return bool.booleanValue();
    }
}
