package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: MyApplication */
public final class iu {

    /* renamed from: a, reason: collision with root package name */
    private final nu f10186a;

    /* renamed from: b, reason: collision with root package name */
    private final qx f10187b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10188c;

    private iu() {
        this.f10187b = rx.y0();
        this.f10188c = false;
        this.f10186a = new nu();
    }

    public static iu a() {
        return new iu();
    }

    private final synchronized void d(int i7) {
        qx qxVar = this.f10187b;
        qxVar.F();
        qxVar.E(v2.f2.W());
        mu muVar = new mu(this.f10186a, ((rx) qxVar.A()).e(), null);
        int i8 = i7 - 1;
        muVar.b(i8);
        muVar.a();
        v2.n1.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i8, 10))));
    }

    private final synchronized void e(int i7) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(se3.a().a(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(f(i7).getBytes());
                } catch (IOException unused) {
                    v2.n1.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        v2.n1.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    v2.n1.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            v2.n1.k("Could not find file for Clearcut");
        }
    }

    private final synchronized String f(int i7) {
        qx qxVar;
        qxVar = this.f10187b;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", qxVar.N(), Long.valueOf(r2.t.o().b()), Integer.valueOf(i7 - 1), Base64.encodeToString(((rx) qxVar.A()).e(), 3));
    }

    public final synchronized void b(hu huVar) {
        if (this.f10188c) {
            try {
                huVar.a(this.f10187b);
            } catch (NullPointerException e8) {
                r2.t.l().i(e8, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i7) {
        if (this.f10188c) {
            if (((Boolean) s2.b0.c().d(uy.K5)).booleanValue()) {
                e(i7);
            } else {
                d(i7);
            }
        }
    }

    public iu(nu nuVar) {
        this.f10187b = rx.y0();
        this.f10186a = nuVar;
        this.f10188c = ((Boolean) s2.b0.c().d(uy.J5)).booleanValue();
    }
}
